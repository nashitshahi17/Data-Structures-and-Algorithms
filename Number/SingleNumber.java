import java.util.Scanner;

class SingleNumber{
    private static int singlenumber(int[] arr){
        int n = arr.length;
        int res = 0;
        for(int i=0;i<n;i++){
            res^=arr[i];
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
        System.out.println(singlenumber(arr));
    }
}