import java.util.*;
public class baseball {
    public static int calPoints(String[] arr){
        Stack<Integer> st = new Stack<>();
        for(String s: arr){
            if(!st.isEmpty()&& s.equals("C")){
                st.pop();
            }
            else if(!st.isEmpty() && s.equals("D")){
                st.push(2*st.peek());
            }
            else if(!st.isEmpty() && s.equals("+")){
                int first = st.pop();
                int second = st.peek();
                int sum = first + second;
                st.push(first);
                st.push(sum);
            }
            else{
                st.push(Integer.parseInt(s));
            }
        }
        int res = 0;
        while(!st.isEmpty()){
            res+= st.pop();
        }
        return  res;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.next();
        }
        sc.close();
        int ans = calPoints(arr);
        System.out.println(ans);
    }
}
