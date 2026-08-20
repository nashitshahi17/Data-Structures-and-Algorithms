import java.util.*;
class prisoncellsafterndays{
    private static int[] prinsonaftern(int[] arr,int k){
        HashMap<String,Integer> map = new HashMap<>();
        while(k>0){
            String state = Arrays.toString(arr);
            if(map.containsKey(state)){
                int l = map.get(state) - k;
                k%=l;
            }else{
                map.put(state,k);
            }
            if(k==0){
                break;
            }
            k--;
            int[] res = new int[8];
            for(int i=1;i<7;i++){
                if(arr[i-1]==arr[i+1]){
                    res[i] = 1;
                }else{
                    res[i] = 0;
                }
            }
            arr = res;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];
        for(int i=0;i<8;i++){
            arr[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        sc.close();
        int[] res = prinsonaftern(arr,n);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}