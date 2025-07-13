import java.util.Stack;

public class stack3 {
    public static void insertAtBottom(Stack<Integer> st, int val){
        if(st.isEmpty()){
            st.push(val);
            return;
            
        }
        else{
            int temp = st.pop();
            insertAtBottom(st, val);
            st.push(temp);
        }
    }
    public static void reverse(Stack<Integer> st){
        if(!st.isEmpty()){
            int temp = st.pop();
            reverse(st);
            insertAtBottom(st, temp);
        }

    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        insertAtBottom(st, 5);
        System.out.println("buttom: " + st);
        reverse(st);
        System.out.println("Revese" + st);

    
       
    }
}
