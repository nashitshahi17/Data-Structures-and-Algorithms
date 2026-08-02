import java.util.*;
class pascalTriangle{
    private static void generate(int n){
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<n;i++){
            res.add(new ArrayList<>());
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    res.get(i).add(1);
                }else{
                    int val = res.get(i-1).get(j) + res.get(i-1).get(j-1);
                    res.get(i).add(val);
                }
            }
        }
        for(List<Integer> l: res){
            for(int ele: l){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        generate(n);
    }
}