import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class twosumwithhashmap {
    private static int[] sum(int[] arr, int target){
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int needed = target - arr[i];
            if(map.containsKey(needed)){
                return new int[]{map.get(needed),i};
            }else{
            map.put(arr[i],i);
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int k = sc.nextInt();
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(Arrays.toString(sum(arr,k)));
    }
}
