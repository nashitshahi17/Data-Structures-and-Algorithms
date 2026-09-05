import java.util.*;
public class maximumproduct {
    private static int maxprod(int[] arr){
        int minending = arr[0];
        int maxending = arr[0];
        int ans = arr[0];
        for(int i=1;i<arr.length;i++){
            int v1 = minending*arr[i];
            int v2 = maxending*arr[i];
            int v3 = arr[i];
            minending = Math.min(v1,Math.min(v2,v3));
            maxending = Math.max(v1,Math.max(v2,v3));
            ans = Math.max(ans,Math.max(minending,maxending));
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
        int ans = maxprod(arr);
        System.out.println(ans);
    }
}
