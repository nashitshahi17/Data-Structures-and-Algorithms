import java.util.*;

public class fruitsintobasket {
    private static int fruit(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        int low = 0, res = Integer.MIN_VALUE;
        for(int high = 0;high<arr.length;high++){
            map.put(arr[high],map.getOrDefault(arr[high],0)+1);
            while(map.size()>2){
                int val = map.get(arr[low]);
                map.put(val,map.getOrDefault(val,0)-1);
                low++;
                if(map.get(val)==0){
                    map.remove(val);
                }
            }
            int len = high-low+1;
            res = Math.max(res,len);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        int ans = fruit(arr);
        System.out.println(ans);
    }
}
