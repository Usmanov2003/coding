
import java.io.*;
import java.util.Scanner; 

class GFG { 
    public static void main(String[] args)
    {
        String str = "Reversed", nstr="";
        char ch;

        System.out.println("Original word: ");
        System.out.println("Reversed"); 

        for (int i=0; i<str.length();i++) 
        {
            ch=str.charAt(i);
            nstr=ch+nstr;
        }
        System.out.println("Reversed word: "+nstr);
    }
} 