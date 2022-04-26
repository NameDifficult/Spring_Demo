package spring5.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * @Author Mi
 * @Date 2022/3/20 8:57
 * @Version 1.0
 */
public class Test01 {
    public static void main(String[] args) {

        String s = "}";
        boolean valid = Test01.isValid(s);
        System.out.println(valid);

    }

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        int s_len = s.length();
        char ch_right = ' ';
        char ch_left = ' ';
        for (int i = 0 ; i < s_len ; ++i){
             ch_right = s.charAt(i);
             if (stack.isEmpty()&&i==s_len-1){
                 return false;
             }
             if (stack.isEmpty()){
                 stack.push(ch_right);
                 continue;
             }
            if (ch_right==')'){
                ch_left = stack.pop();
                if (ch_left=='('){
                    continue;
                }else {
                    return false;
                }
            }else if (ch_right==']'){
                ch_left = stack.pop();
                if (ch_left=='['){
                    continue;
                }else {
                    return false;
                }
            }else if (ch_right=='}'){
                ch_left = stack.pop();
                if (ch_left=='{'){
                    continue;
                }else {
                    return false;
                }
            }else {
                stack.push(ch_right);
            }
        }
        if (!stack.isEmpty()){
            return false;
        }
        return true;
    }

}
