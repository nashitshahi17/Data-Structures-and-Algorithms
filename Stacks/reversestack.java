import java.util.*;
public class reversestack {
    public static void reverse(Stack<Integer>st){
        if(st.size()<=1) return;
        int top = st.pop();
        reverse(st);
        insertAtBottom(st,top);
    }
    public static void insertAtBottom(Stack<Integer>st,int ele){
        if(st.isEmpty()){
            st.push(ele);
            return;
        }
        int top = st.pop();
        insertAtBottom(st, ele);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        reverse(st);
        System.out.println(st);
        
    }
    
}
