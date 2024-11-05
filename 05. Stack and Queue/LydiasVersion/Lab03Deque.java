package LydiasVersion;

import java.util.Deque;
import java.util.LinkedList;

public class Lab03Deque {    public static boolean isDequeBalanced(String expression){
    Deque<Character> parentheses = new LinkedList<>();

    boolean balanced = true;
    int index = 0;
    char c;
    char topChar;
    while(balanced && (index < expression.length())){
        c = expression.charAt(index);
        if(isOpen(c)){
            parentheses.push(c);
        }else if(isClose(c)){
            if(parentheses.isEmpty()){
                balanced = false;
            }
            topChar = parentheses.pop();
            if(!areMatching(topChar, c)){
                balanced = false;
            }
        }
        index++;
    }
    if(parentheses.isEmpty()){
        return balanced;
    }else{
        return false;
    }
}
    private static boolean isOpen(char ch){
        return ch == '(' || ch == '[' || ch == '{' || ch == '<';
    }
    private static boolean isClose(char ch){
        return ch == ')' || ch == ']' || ch == '}' || ch == '>';
    }
    private static boolean areMatching(char topChar, char c){
        switch(c){
            case ')': return (topChar == '(');
            case ']': return (topChar == '[');
            case '}': return (topChar == '{');
            case '>': return (topChar == '<');
        }
        return false;
    }
}
