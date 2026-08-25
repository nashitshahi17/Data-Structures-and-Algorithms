import java.util.*;
class minimumsizesubarraysum{
    private static int minimumsize(int[] arr, int target){
        int n = arr.length;
        int low = 0,sum = 0;
        int res = Integer.MAX_VALUE;
        for(int high=0;high<n; high++){
            sum+= arr[high];
            while(sum>=target){
                int len = high-low+1;
                res = Math.min(res,len);
                sum-= arr[low];
                low++;
            }
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        sc.close();
        int ans = minimumsize(arr,target);
        System.out.println(ans);
    }
}