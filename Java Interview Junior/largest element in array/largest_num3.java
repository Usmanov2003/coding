import java.io.*;
import java.util.*;

class GFG { 

    public static void main(String[] args) 
    {
        int arr[] = {12,   45,  67,  89,  100, 23,
            3456, 897, 452, 444, 899, 700};

        Arrays.sort(arr);

        System.out.println(
            "Largest number from given array: " 
            + arr[arr.length - 1]);
    }
}