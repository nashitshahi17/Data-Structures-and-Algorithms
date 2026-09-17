import java.util.*;
class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}
public class searchinBST {
    public static Node search(Node root,int val){
        if(root==null) return null;
        if(root.val==val) return root;
        if(root.val>val) return search(root.left, val);
        else return search(root.right, val);
    }
    public static Node insert(Node root,int val){
        if(root==null) return new Node(val);
        if(val<root.val){
            root.left = insert(root.left,val);
        }else{
            root.right = insert(root.right,val);
        }
        return root;
    }
    public static Node buildtree(int[] arr){
        Node root = null;
        for(int val: arr){
            root = insert(root,val);
        }
        return root;
    }
    public static void print(Node root){
        if(root==null) return;
        System.out.print(root.val+" ");
        print(root.left);
        print(root.right);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] val = s.trim().split("\\s+");
        int[] arr = new int[val.length];
        for(int i=0;i<arr.length;i++){
            arr[i] = Integer.parseInt(val[i]);
        }
        int vall = sc.nextInt();
        sc.close();
        Node root = buildtree(arr);
        Node ans = search(root, vall);
        print(ans);

    }
}
