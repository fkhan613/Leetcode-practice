import java.util.*;

class Solution {
    public boolean isValid(String s) {

        HashMap<Character, Character> compliments = new HashMap<>();
        Stack<Character> stack = new Stack<>();

        compliments.put(')', '(');
        compliments.put('}', '{');
        compliments.put(']', '[');

        for(char ch : s.toCharArray()){

            switch(ch){

                case '(': 
                case '{': 
                case '[':
                    stack.push(ch);
                    break;

                case ')': 
                case '}': 
                case ']':

                    //check if the previous brack is the compliment
                    if(stack.isEmpty() || stack.pop() != compliments.get(ch)){
                        return false;
                    }
            }
            
        }

        return stack.isEmpty();
        
    }
}