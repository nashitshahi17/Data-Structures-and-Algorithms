import java.util.*;
class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}
public class lcainbst {
    public static Node lca(Node root,Node p,Node q){
        if(root==p || root==q) return root;
        if(root.val<p.val && root.val<q.val) return lca(root.right,p,q);
        if(root.val>q.val && root.val>q.val) return lca(root.left,p,q);
        return root;
    }
    public static Node find(Node root,int val){
        if(root==null) return null;
        if(root.val == val) return root;
        Node left = find(root.left,val);
        if(left!=null){
            return left;
        }
        return find(root.right,val);
    }
    public static Node insert(Node root, int val){
        if(root==null) return new Node(val);
        if(root.val>val){
            root.left = insert(root.left,val);
        }
        else{
            root.right = insert(root.right,val);
        }
        return root;
    }
    public static Node buildtree(Integer[] arr){
        Node root = null;
        for(Integer val: arr){
            if(val!=null){
                root = insert(root,val);
            }
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
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        Node root = buildtree(arr);
        Node p = find(root,a);
        Node q = find(root,b);
        Node ans = lca(root, p, q);
        System.out.println(ans.val);
    }
}
