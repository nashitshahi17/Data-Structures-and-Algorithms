import java.util.*;
class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}
class symmetrictree{
    public static boolean isSym(Node root1, Node root2){
        if(root1==null && root2==null) return true;
        if(root1==null || root2==null) return false;
        if(root1.val!=root2.val) return false;
        boolean r1 = isSym(root1.left,root2.right);
        boolean r2 = isSym(root1.right, root2.left);
        if(r1==true && r2==true) return true;
        else return false;
    }
    public static boolean isSymmetric(Node root){
        Node root1 = root.left;
        Node root2 = root.right;
        return isSym(root1,root2);
    }
    public static Node buildtree(Integer[] arr){
        Node root = new Node(arr[0]);
        Deque<Node> q = new ArrayDeque<>();
        q.addLast(root);
        int i = 1;
        while(i<arr.length){
            Node current = q.pop();
            if(i<arr.length && arr[i]!=null){
                current.left = new Node(arr[i]);
                q.addLast(current.left);
            }
            i++;
            if(i<arr.length && arr[i]!=null){
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
        String[] val = s.trim().split("\\s+");
        Integer[] arr = new Integer[val.length];
        for(int i=0;i<arr.length;i++){
            if(val[i].equalsIgnoreCase("null")){
                arr[i] = null;
            }else{
                arr[i] = Integer.parseInt(val[i]);
            }
        }
        sc.close();
        Node root = buildtree(arr);
        boolean ans = isSymmetric(root);
        if(ans) System.out.println("Yes Symmetric");
        else System.out.println("No Not Symmetric");
    }
}