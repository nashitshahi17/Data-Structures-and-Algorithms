import java.util.*;
class majorityElement{
    public static int majele(int[] arr){
        int n = arr.length;
        int candidate = 0;
        int count = 0;
        for(int i=0;i<n;i++){
            if(count==0){
                candidate = arr[i];
            }
            if(arr[i]==candidate){
                count++;
            }
            else{
                count--;
            }
        }
        return candidate;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.print(majele(arr));
    }
}