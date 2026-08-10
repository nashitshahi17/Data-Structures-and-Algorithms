import java.util.*;
public class recursiveelementadd {
    public static void addele(Stack<Integer> st,int ele){
        if(st.isEmpty()){
            st.push(ele);
            return;
        }
        int top  = st.pop();
        addele(st,ele);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.add(10);
        st.add(20);
        st.add(30);
        st.add(40);
        int ele = 50;
        System.out.println(st);
        addele(st,ele);
        System.out.println(st);
    }
    
}
