import java.util.Arrays; 

class GFG { 
    public static void main(String[] args) {
        String[] arr = {"Hello", "World"};
        StringBuilder reversed = new StringBuilder();

        for (int i = arr.length; i > 0; i--) {
            reversed.append(arr[i-1]).append(" ");
        };

        String[] reverserdArray = reversed.toString().split(" ");

        System.out.println(Arrays.toString(reversedArray));
    }
}