import java.util.*;
public class subarraysumdividebyk {
    private static int divsum(int[] arr,int k){
        int sum = 0;
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0;i<arr.length;i++){
            sum+= arr[i];
            int rem = sum%k;
            if(rem<0){
                rem = rem + k;
            }
            if(map.containsKey(rem)){
                count += map.get(rem);
            }
            map.put(rem,map.getOrDefault(rem,0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        sc.close();
        int ans = divsum(arr,k);
        System.out.println(ans);
    }
}
