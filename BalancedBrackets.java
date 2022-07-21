import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        Stack<Character> stack = new Stack<Character>();
        int size = str.length();
        for(int i = 0; i < size; i++) {
            char currChar = str.charAt(i);
            if(currChar == '{' || currChar == '[' || currChar == '(') {
                stack.push(currChar);
            } else {
                if(currChar == '}') {
                    if(stack.empty()) {
                        System.out.println(false);
                        return;
                    } else if (stack.peek() != '{') {
                        System.out.println(false);
                        return;
                    }else {
                        stack.pop();
                    }
                } else if(currChar == ']') {
                    if(stack.empty()) {
                        System.out.println(false);
                        return;
                    } else if (stack.peek() != '[') {
                        System.out.println(false);
                        return;
                    } else {
                        stack.pop();
                        
                    }
                } else if(currChar == ')') {
                    if(stack.empty()) {
                        System.out.println(false);
                        return;
                    } else if(stack.peek() != '(') {
                        System.out.println(false);
                        return;
                    } else {
                        stack.pop();
                        
                    }
                    
                }
            }
        }
        
        System.out.println(stack.empty());
    }

}
