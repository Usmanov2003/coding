import java.lang.*;
import java.io.*;
import java.util.*;

class ReverseString { 
    public static void main(String[] args) 
    {
        String input = "This is Reversed";

        StringBuilder input1  = new StringBuilder();

        input1.append(input);

        input1.reverse();

        System.out.println(input1);
    }
}