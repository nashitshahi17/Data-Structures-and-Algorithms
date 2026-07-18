import java.util.*;
class DistinctSubstring{
    private static void count(String s){
        HashSet<Character> st = new HashSet<>();
        for(int i=0;i<s.length();i++){
            st.add(s.charAt(i));
        }
        System.out.println(st.size());

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        count(s);
    }
}