import java.util.*;

public class maxsubarraysum {
    private static int maxsub(int[] arr,int k){
        int low = 0;
        int high = k-1;
        int sum = 0;
        for(int i=low;i<=high;i++){
            sum+=arr[i];
        }
        low++;
        high++;
        int res = sum;
        while(high<arr.length){
            sum = sum - arr[low-1];
            sum = sum + arr[high];
            res = Math.max(res,sum);
            low++;
            high++;
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
        int k = sc.nextInt();
        sc.close();
        int ans = maxsub(arr,k);
        System.out.println(ans);
    }
}
