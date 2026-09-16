import java.util.*;
class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}
class levelorder{
    public static List<List<Integer>> level(Node root){
        List<List<Integer>> res = new ArrayList<>();
        Deque<Node> q = new ArrayDeque<>();
        if(root!=null){
            q.addLast(root);
        }
        while(!q.isEmpty()){
            int length = q.size();
            List<Integer> l = new ArrayList<>();
            while(length-->0){
                Node t = q.pop();
                l.add(t.val);
                if(t.left!=null) q.addLast(t.left);
                if(t.right!=null) q.addLast(t.right);
            }
            res.add(l);
        }
        return res;
    }
    public static Node buildtree(Integer[] arr){
        if(arr==null || arr.length==0 || arr[0]==null){
            return null;
        }
        Node root = new Node(arr[0]);
        Deque<Node> q = new ArrayDeque<>();
        q.add(root);
        int i = 1;
        while(i<arr.length){
            Node current = q.remove();
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
        String n = sc.nextLine();
        String[] val = n.trim().split("\\s+");
        Integer[] arr = new Integer[val.length];
        for(int i=0;i<val.length;i++){
            if(val[i].equalsIgnoreCase("null")){
                arr[i] = null;
            }else{
                arr[i] = Integer.parseInt(val[i]);
            }
        }
        sc.close();
        Node root = buildtree(arr);
        List<List<Integer>> ans = level(root);
        System.out.println(ans);
    }
}