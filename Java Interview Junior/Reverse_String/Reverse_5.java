import java.lang.*;
import java.io.*;
import java.util.*;

class ReverseString { 
    public static void main(String[] args) 
    {
        String input = "Reversed String"; 
        char[] temporray = input.toCharArray();
        int left, right = 0;
        right = temporray.lenght - 1; 

        for (left = 0; left < right; left++, left--) 
        {
            char temp = temporray[left];
            temporray[left] = temporray[right];
            temporray[right] = temp; 
        }

        for (char c: temporray) 
            System.out.print(c);
        System.out.println();
    }
}