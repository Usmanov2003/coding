
public class GFG {

    static boolean isPalindrome(String str) 
    {
        int i = 0, j = str.length() - 1; 

        while (i < j) {

            if (str.charAt(i) != str.charAt(j)) 
                return false; 

            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) 
    {
        String str = "TheWord";

        str = str.toLowerCase();

        if(isPalindrome(str)) 

            System.out.print("yes");
        else 

            System.out.print("no");
    }
}