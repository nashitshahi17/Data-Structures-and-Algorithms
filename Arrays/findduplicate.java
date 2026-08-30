import java.util.*;
public class findduplicate {
    public static int findd(int[] arr){
        int slow = 0,fast = 0;
        while(true){
            slow = arr[slow];
            fast = arr[fast];
            fast = arr[fast];
            if(slow==fast){
                slow = 0;
                while (slow!=fast){
                    slow = arr[slow];
                    fast = arr[fast];
                }
                return slow;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        int ans = findd(arr);
        System.out.println(ans);
    }
}
