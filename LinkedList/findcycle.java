import java.util.*;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}

public class findcycle {
    public static boolean cycle(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;

    }
    public static Node createll(int[] arr,int pos){
        Node head = new Node(arr[0]);
        Node tail = head;
        Node cycle = null;
        if(pos==0){
            cycle = head;
        }
        for(int i=1;i<arr.length;i++){
            Node n = new Node(arr[i]);
            tail.next = n;
            tail = n;

            if(i==pos){
                cycle = n;
            }
        }
        if(pos>=0){
            tail.next = cycle;
        }
        return head;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int pos = sc.nextInt();
        sc.close();
        Node head = createll(arr,pos);
        if(cycle(head)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
