import java.util.*;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}

public class middlell {
    public static Node createll(int[] arr){
        Node head = new Node(arr[0]);
        Node tail = head;
        for(int i=1;i<arr.length;i++){
            Node n = new Node(arr[i]);
            tail.next = n;
            tail = n;
        }
        return head;
    }
    public static Node middle(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static void printll(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        Node head = createll(arr);
        Node ans = middle(head);
        printll(ans);

    }
}
