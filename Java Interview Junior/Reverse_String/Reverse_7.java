import java.lang.*; 
import java.io.*;
import java.util.*;

public class Test { 
    public static void main(Strnig[] args) 
    {
        String str = "This reversed";

        StringBuffer sbr = new StringBuffer(str);

        sbr.reverse();
        System.out.println(sbr);
    }
}