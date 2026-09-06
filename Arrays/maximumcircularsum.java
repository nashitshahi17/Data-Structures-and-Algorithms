import java.util.*;
public class maximumcircularsum {
    private static int maxcir(int[] arr){
        int maxending = arr[0];
        int minending = arr[0];
        int minsum = arr[0];
        int sum = arr[0];
        int res = arr[0];
        for(int i=1;i<arr.length;i++){
            sum+= arr[i];
            maxending = Math.max(maxending+arr[i],arr[i]);
            minending = Math.min(minending+arr[i],arr[i]);
            minsum = Math.min(minsum,minending);
            res = Math.max(res,maxending);
        }
        if(res<0){
            return res;
        }
        return Math.max(res,sum-minsum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        int ans = maxcir(arr);
        System.out.println(ans);
    }
}
