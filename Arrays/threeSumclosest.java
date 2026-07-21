import java.util.*;
class threeSumclosest{
    private static int three(int[] arr,int target){
        int n = arr.length;
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        int res = 0;
        for(int i=0;i<n-2;i++){
            int left = i+1;
            int right = n-1;
            while(left<right){
                int sum = arr[i]+arr[left]+arr[right];
                int diff = Math.abs(sum-target);
                if(diff<min){
                    min = diff;
                    res = sum;
                }
                if(sum==target){
                    left++;
                    right--;
                }else if(sum>target){
                    right--;
                }else{
                    left++;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        sc.close();
        System.out.println(three(arr,target));
    }
}