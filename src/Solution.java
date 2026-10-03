import java.util.Stack;

public class Solution {
    public static void main() {
        System.out.println(longestValidParenthesis(")(()(())())()(()(())())()(()(())())()(()(())())("));
    }

    public static int longestValidParenthesis(String s) {
        Stack<Integer> st = new Stack<>();
        int max = 0;
        st.push(0);
        for(int i=0; i<=s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '(') {
                st.push(i);
            }
            else {
                st.peek();
                if(st.isEmpty()) {
                    st.push(i);
                }
                else {
                    max = Math.max(i - st.peek(), max);
                }
            }
        }
        return max;
    }
}
