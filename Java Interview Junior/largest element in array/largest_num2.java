import java.io.*;
import java.util.*;

class Main { 

    static int largest(int arr[], int n) 
    {
        for(int i = 1; i < n; ++i) 
        {
            int key = arr[i];
            int j = i - 1; 

            while (j >= 0 && arr[i] > key) 
            {
                arr[j+1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key; 
        }

        return arr[n-1];
    }

    static public void main(String[] args) 
    {
        int[] arr = {10, 324, 45, 90,9808};
        int n = arr.length;
        System.out.println(largest(arr, n));
    }
}
