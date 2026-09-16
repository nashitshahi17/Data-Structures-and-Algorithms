import java.util.*;
class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}
public class sametree {
    public static boolean isSametree(Node p,Node q){
        if(p==null && q==null) return true;
        if(p==null || q== null) return false;
        if(p.val!=q.val) return false;
        boolean l1 = isSametree(p.left, q.left);
        boolean r1 = isSametree(p.right, q.right);
        if(l1==true && r1 == true){
            return true;
        }else{
            return false;
        }
    }
    public static Node buildtree(Integer[] arr){
        Node root = new Node(arr[0]);
        int i = 1;
        Deque<Node> q = new ArrayDeque<>();
        q.addLast(root);
        while(i<arr.length){
            Node current = q.pop();
            if(i<arr.length&& arr[i]!=null){
                current.left = new Node(arr[i]);
                q.addLast(current.left);
            }
            i++;
            if(i<arr.length&& arr[i]!=null){
                current.right = new Node(arr[i]);
                q.addLast(current.right);
            }
            i++;
        }
        return root;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s2 = sc.nextLine();
        String[] val = s.trim().split("\\s+");
        String[] val2 = s2.trim().split("\\s+");
        Integer[] arr = new Integer[val.length];
        Integer[] arr2 = new Integer[val2.length];
        for(int i=0;i<arr.length;i++){
            if(val[i].equalsIgnoreCase("null")){
                arr[i] = null;
            }else{
                arr[i] = Integer.parseInt(val[i]);
            }
        }
        for(int i=0;i<arr2.length;i++){
            if(val2[i].equalsIgnoreCase("null")){
                arr2[i] = null;
            }else{
                arr2[i] = Integer.parseInt(val2[i]);
            }
        }
        sc.close();
        Node p = buildtree(arr);
        Node q = buildtree(arr2);
        boolean ans = isSametree(p, q);
        if(ans){
            System.out.println("Yes same");
        }else{
            System.out.println("No Not same");
        }
    }
}
