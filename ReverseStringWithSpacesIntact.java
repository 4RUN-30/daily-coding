package GFG;

import java.util.Stack;

public class ReverseStringWithSpacesIntact {

    public static void main(String[] args) {
        ReverseStringWithSpacesIntact reverseStringWithSpacesIntact = new ReverseStringWithSpacesIntact();
        System.out.println(reverseStringWithSpacesIntact.reverseWithSpacesIntact("Help others"));;
    }

    String reverseWithSpacesIntact(String s)
    {
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            if(c != ' ') stack.push(c);
        }

        StringBuilder rev = new StringBuilder();

        for(char c : s.toCharArray()){
            if(c == ' ') rev.append(" ");
            else rev.append(stack.pop());
        }

        return rev.toString();
    }
}
