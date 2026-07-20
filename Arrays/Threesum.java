import java.util.*;
class Threesum{
    private static List<List<Integer>> three(int[] nums){
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int left = i+1;
            int right = n-1;
            int sum = -nums[i];
            while(left<right){
                List<Integer> l1 = new ArrayList<>();
                if(nums[left]+nums[right]==sum){
                    l1.add(nums[i]);
                    l1.add(nums[left]);
                    l1.add(nums[right]);
                    res.add(l1);
                    left++;
                    right--;
                    while(left<n && nums[left]==nums[left-1]){
                        left++;
                    }
                    while(right>=0 && nums[right]==nums[right+1]){
                        right--;
                    }
                }else if(nums[left]+nums[right]>sum){
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
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        List<List<Integer>> l = three(arr);
        System.out.println(l);
    }
}