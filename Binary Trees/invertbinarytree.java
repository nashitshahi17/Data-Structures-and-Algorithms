import java.util.*;
class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}
class invertbinarytree{
    public static Node inverttree(Node root){
        if(root==null) return null;
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        inverttree(root.left);
        inverttree(root.right);
        return root;
    }
    public static Node buildtree(Integer[] arr){
        if(arr.length==0 || arr==null || arr[0]==null){
            return null;
        }
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
            if(i<arr.length && arr[i]!=null){
                current.right = new Node(arr[i]);
                q.addLast(current.right);
            }
            i++;
        }
        return root;
    }
    public static void printtree(Node root){
        if(root==null) return;
        List<Integer> res = new ArrayList<>();
        Deque<Node> q = new ArrayDeque<>();
        q.addLast(root);
        while(!q.isEmpty()){
            int size = q.size();
            while(size-->0){
                Node t = q.pop();
                res.add(t.val);
                if(t.left!=null) q.addLast(t.left);
                if(t.right!=null) q.addLast(t.right);
            }
        }
        // System.out.println(res);
        for(int x: res){
            System.out.print(x+" ");
        }
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
        Node nroot = inverttree(root);
        printtree(nroot);
    }
}