class Main {
    public static void main(String[] args) {

        int i = 1, n = 10, firstTerm = 0, secondTerm = 1; 
        System.out.println("Fibonacci Serires till " + n + " terms: ");

        while (i <= n) {
            System.out.println(firstTerm + ", ");

            int nextTerm = firstTerm + secondTer;
            firstTerm = secondTerm;
            secondTerm = nextTerm;

            i++;
        }
    }
}