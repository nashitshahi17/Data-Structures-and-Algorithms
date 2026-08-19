import java.util.*;
class longestrepeatingreplacement{
    private static int find(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max = Math.max(max,arr[i]);
        }
        return max;
    }
    private static int characterreplace(String s,int k){
        int[] arr = new int[26];
        int low = 0,len = 0,res=Integer.MIN_VALUE;
        for(int high=0;high<s.length();high++){
            arr[s.charAt(high)-'A']++;
            len = high-low+1;
            int max = find(arr);
            int diff = len - max;
            while(diff>k){
                arr[s.charAt(low)-'A']--;
                low++;
                max = find(arr);
                len = low - high + 1;
                diff = len - max;
            }
            len = high-low+1;
            res = Math.max(res,len);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();
        sc.close();
        int ans = characterreplace(s, k);
        System.out.println(ans);
    }
}