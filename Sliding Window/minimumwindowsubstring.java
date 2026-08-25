import java.util.*;
public class minimumwindowsubstring {
    private static boolean find(int[] have, int[] need){
        for(int i=0;i<256;i++){
            if(have[i]<need[i]){
                return false;
            }
        }
        return true;
    }
    private static String minimumsubstring(String s,String t){
        int n = s.length();
        int low = 0, start = 0;
        int res = Integer.MAX_VALUE;
        int[] need = new int[256];
        int[] have = new int[256];
        for(char ch: t.toCharArray()){
            need[ch]++;
        }
        for(int high=0;high<n;high++){
            have[s.charAt(high)]++;
            while(find(have,need)){
                int len = high-low+1;
                if(len<res){
                    res = len;
                    start = low;
                }
                have[s.charAt(low)]--;
                low++;
            }
        }
        return res == Integer.MAX_VALUE? "": s.substring(start,start+res);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        sc.close();
        String ans = minimumsubstring(s,t);
        System.out.println(ans);
    }
}
