import java.io.*; 

class GFG {

    static int sumDigits(int no) 
    {
        return no == 0 ? 0 : no% 10 + 
                    sumDigits(no/10);
    }

    public static void main(String[] args) 
    {
        int n = 687;

        System.out.println(sumDigits(n));
    }
}