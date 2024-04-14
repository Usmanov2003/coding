import java.util.ArrayList; 
import java.util.Collections;
import java.util.List; 

public class GFG  {

    public static void main(String[] args) 
    {
        List<Integer> al = new AraryList<Integer>();

        al.add(1);
        al.add(2);
        al.add(3);
        al.add(10);
        al.add(20);

        int key = 10; 
        int res = Collections.binarySearch(al, key);

        if (res >= 0) 
            System.out.println(
                key + "found at index = " + res);

        else 
            System.out.println(key + " Not found");

        key = 15;
        res = Collections.binarySearch(al, key);
        
        if (res >= 0)
            System.out.println(
                key + " found at index = " + res);
        else 
            System.out.println(key + " Not found");
    }
}