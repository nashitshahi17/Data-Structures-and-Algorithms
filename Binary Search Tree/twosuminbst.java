import java.util.*;
class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}
class twosuminbst{
    static Deque<Node> asc = new ArrayDeque<>();
    static Deque<Node> desc = new ArrayDeque<>();
    public static Node getsmall(){
        if(asc.isEmpty()) return null;
        Node small = asc.pop();
        Node rightchild = small.right;
        while(rightchild!=null){
            asc.push(rightchild);
            rightchild = rightchild.left;
        }
        return small;
    }
    public static Node getbig(){
        if(desc.isEmpty()) return null;
        Node big = desc.pop();
        Node leftchild = big.left;
        while(leftchild!=null){
            desc.push(leftchild);
            leftchild = leftchild.right;
        }
        return big;
    } 
    public static boolean twosum(Node root, int k){
        if(root==null) return false;
        Node t = root;
        while(t!=null){
            asc.push(t);
            t= t.left;
        }
        t = root;
        while(t!=null){
            desc.push(t);
            t = t.right;
        }
        Node i = getsmall();
        Node j = getbig();
        while(i!=null && j!=null && i!=j && i.val<j.val){
            int sum = i.val+j.val;
            if(sum==k) return true;
            else if(sum>k){
                j = getbig();
            }else{
                i = getsmall();
            }
        }
        return false;
    }
    public static Node insert(Node root, int val){
        if(root==null) return new Node(val);
        if(root.val>val){
            root.left = insert(root.left,val);
        }else{
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
        int k = sc.nextInt();
        sc.close();
        Node root = buildtree(arr);
        boolean ans = twosum(root, k);
        if(ans) System.out.println("True");
        else System.out.println("False");
    }
}