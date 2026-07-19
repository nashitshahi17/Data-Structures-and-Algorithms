import java.util.*;
class removeduplicates{
    private static int remove(int[] arr){
        int n = arr.length;
        int count = 1;
        int i = 0;
        int j = i+1;
        while(j<n){
            if(arr[i]==arr[j]){
                j++;
            }else{
                arr[++i] = arr[j];
                j++;
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        int c = remove(arr);
        System.out.println(c);
        for(int i=0;i<c;i++){
            System.out.print(arr[i]+" ");
        }

    }
}