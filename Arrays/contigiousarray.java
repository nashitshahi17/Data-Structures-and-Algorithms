import java.util.*;
public class contigiousarray {
    private static int longest01sub(int[] arr){
        int zero = 0;
        int one = 0;
        int res = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zero++;
            }else{
                one++;
            }
            int diff = zero-one;
            if(diff == 0){
                res = Math.max(res,i+1);
            }
            if(!map.containsKey(diff)){
                map.put(diff,i);
            }else{
                int idx = map.get(diff);
                int len = i-idx;
                res = Math.max(res,len);
            }
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
        int ans = longest01sub(arr);
        System.out.println(ans);
    }
}
