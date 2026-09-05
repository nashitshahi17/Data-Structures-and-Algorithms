import java.util.*;
public class maximumabssum {
    private static int maxabs(int[] arr){
        int maxending = arr[0];
        int minending = arr[0];
        int res = Math.abs(arr[0]);
        for(int i=1;i<arr.length;i++){
            int v1 = maxending + arr[i];
            int v2 = arr[i];
            int v3 = minending + arr[i];
            maxending = Math.max(v1,v2);
            minending = Math.min(v2,v3);
            int s = Math.max(Math.abs(minending),Math.abs(maxending));
            res = Math.max(res,s);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        int ans = maxabs(arr);
        System.out.println(ans);
    }
}
