package Stack;

import java.util.Stack;

public class BalanceParenthesis {

    public static void main(String[] args) {
        String s = "{[(]}";
        Stack<Object> st =  new Stack<>();
        char[] array = s.toCharArray();
//        System.out.println("Stack  " + st);

        for(char c :array){
//            System.out.println("char is " + c);

            if(c == '{' || c == '[' || c == '('){
                st.push(c);
            }else{
                if(st.isEmpty()) {
                    System.out.println("NOT BALANCED");
                    break;
                }
                else{
                    char ch = (char) st.pop();
                    if((ch == '{' && c == '}' ) ||
                        (ch == '[' && c == ']' ) ||
                                (ch == '(' && c == ')')) {

                    }
                    else {
                        System.out.println("NOT BALANCED");
                        break;

                    }
                }
            }
//            System.out.println("Stack is " + st);
//            System.out.println("=======");

        }
        if(st.isEmpty())
            System.out.println("BALANCED");
       else
            System.out.println("NOT BALANCED");

    }
}
