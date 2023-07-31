package BalancedBrackets;

import java.util.Stack;

public class BalancedBrackets {
    public boolean checkBalance(String input){
        Stack<Character> stack = new Stack<>();
        if(input == null){
            return false;
        }
        for(int i = 0; i<input.length(); i++){
            char c = input.charAt(i);

            if(c == '{' || c == '(' || c == '['){
                stack.push(c);
                continue;
            }
            if(stack.isEmpty()){
                return false;
            }
            char poppedChar = stack.pop();
            switch(c){
                case ')':
                    if(poppedChar != '('){
                        return false;
                    }
                    break;
                case '}':
                    if(poppedChar != '{'){
                        return false;
                    }
                    break;
                case ']':
                    if(poppedChar != '['){
                        return false;
                    }
                    break;
            }
        }
        return (stack.isEmpty());
    }
}
