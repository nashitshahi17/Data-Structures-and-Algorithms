import java.util.*;
class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}

class removenodesfromll{
    public static ListNode createll(int[] arr){
        ListNode head = null;

        for(int i=0;i<arr.length;i++){
            ListNode n = new ListNode(arr[i]);

            if(head==null) {
                head = n;
            }else{
                ListNode temp = head;
                while(temp.next!=null){
                    temp = temp.next;
                }
                temp.next = n;
            }
        }
        return head;
    }
    
    public static ListNode rmv(ListNode head){
        Stack<ListNode> st = new Stack<>();
        ListNode temp = head;
        while(temp!=null){
            while(!st.isEmpty() && st.peek().val< temp.val){
                st.pop();
            }
            st.push(temp);
            temp = temp.next;
        }
        while(!st.isEmpty()){
            ListNode top = st.pop();
            top.next = temp;
            temp = top;
        }
        return temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        ListNode head = createll(arr);
        head = rmv(head);
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }
}