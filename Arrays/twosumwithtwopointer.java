import java.util.*;
public class twosumwithtwopointer {
    private static int[] sum(int[] arr, int target){
        int n = arr.length;
        int i =0 ;
        int j = n-1;
        while(i<j){
            if(arr[i]+arr[j]==target){
                return new int[]{i+1,j+1};
            }else if(arr[i]+arr[j]>target){
                j--;
            }
            else{
                i++;
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int target = sc.nextInt();
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(Arrays.toString(sum(arr,target)));
    }
}
