import java.io.*;

class GFG {

    static int getSum(int n) 
    {
        int sum; 

        for (sum = 0; n > 0; sum += n % 10, 
                        n /=10);

        return sum;
    }

    public static void main(String[] args) 
    {
        int n = 687; 

        System.out.println(getSum(n));
    }
}