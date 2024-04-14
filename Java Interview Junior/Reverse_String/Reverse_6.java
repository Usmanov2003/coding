import java.lang.*; 
import java.io.*;
import java.util.*; 

class ReversedString { 
    public static void main(Stirng[] args) 
    {
        String input = "This is reversed";
        char[] hello = input.toCharArray();
        List<Character> trial1 = new ArrayList<>();

        for(char c: hello) 
            trial1.add(c);

        Colllections.reversed(trial1);
        ListIterator li = trail1.lsitIterator();
        while(li.hasNext()) 
            System.out.println(li.next());
    }
}