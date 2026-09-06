import java.util.*;
public class pivotindex {
    private static int pivot(int[] arr){
        int left  = 0;
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+= arr[i];
        }
        for(int i=0;i<arr.length;i++){
            int right = sum - left - arr[i];
            if(left == right){
                return i;
            }
            left += arr[i];
        }
        return  -1;
    }
    public static void main(String[] args) {
        Scanner sc  =  new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }   
        sc.close();
        int ans = pivot(arr);
        System.out.println(ans);
    }
}

