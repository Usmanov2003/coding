import java.util.Scanner; 

public class Main { 
    public static void main(String[] args) 
    {
        String str = "TheWordPalindrome";

        StringBuilder str1 = new StringBuilder(str);
        str1.reverse();

        if(str.equals(str1.toString())) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome String");
        }
    }
}