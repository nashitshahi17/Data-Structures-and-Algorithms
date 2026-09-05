import java.util.*;
public class maximumsubarray {
    private static int maxsub(int[] arr){
        int bestending = arr[0];
        int ans = arr[0];
        for(int i=1;i<arr.length;i++){
            int v1 = bestending + arr[i];
            int v2 = arr[i];
            bestending = Math.max(v1,v2);
            ans = Math.max(ans,bestending);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        int ans = maxsub(arr);
        System.out.println(ans);
    }
}
