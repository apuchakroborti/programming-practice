package lessons;

import java.util.Stack;

//It is also the solution of Nesting 
public class Brackets {
    
    public int solution(String S){
        Stack<Character> stk = new Stack<>();
        char[] str=S.toCharArray();
        
        stk.push('0');
        for(int i=0; i<str.length; i++){
            if(str[i]=='(' || str[i]=='{' || str[i]=='['){
//                System.out.println("Brackets: "+str[i]);
                stk.push(str[i]);
            }else{
                char top = stk.peek();
                if(str[i]==')' && top=='('){
                    stk.pop();
                }else if(str[i]=='}' && top=='{'){
                    stk.pop();
                }else if(str[i]==']' && top=='['){
                    stk.pop();
                }
                else{
                    return 0;
                }
            }
        }
        if(stk.peek()=='0'){
            return 1;
        }else{
            return 0;
        }
    }
}
