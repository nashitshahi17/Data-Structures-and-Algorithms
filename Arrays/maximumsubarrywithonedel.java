import java.util.*;
public class maximumsubarrywithonedel {
    private static int maxsub(int[] arr){
        int nodelete = arr[0];
        int onedelete = Integer.MIN_VALUE;
        int ans = arr[0];
        for(int i=1;i<arr.length;i++){
            int prevnodelete = nodelete;
            int prevonedelete = onedelete;
            nodelete = Math.max(prevnodelete+arr[i],arr[i]);
            int v2;
            if(prevonedelete==Integer.MIN_VALUE){
                v2 = Integer.MIN_VALUE;
            }else{
                v2 = prevonedelete + arr[i];
            }
            onedelete = Math.max(v2,prevnodelete);
            ans = Math.max(ans,Math.max(nodelete,onedelete));
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
