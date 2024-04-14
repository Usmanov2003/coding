import java.util.*;

class GFG { 
    public static void main(String[] args) 
    {
        String s = "This is reversed";

        Stack<Character> stack = new Stack<>();

        for(char c:s.toCharArray())
        {
            stack.push(c);
        }

        String temp="";

        while(!stack.isEmpty()) 
        {
            temp+=stack.pop();
        }

        System.out.println("Reversed string is: " + temp);
    }
}