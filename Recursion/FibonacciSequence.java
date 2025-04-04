import java.util.*;

class FibonacciSequence {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n:");
        int n = sc.nextInt();
        sc.close();
        System.out.println("The nth Fibonacci Number is: "+getNthFibonacciNumber(n));
    }

    public static int getNthFibonacciNumber(int n) {
        if (n <= 1) {
            return n;
        }
        int firstLast = getNthFibonacciNumber(n-1);
        int secondLast = getNthFibonacciNumber(n-2);
        return firstLast + secondLast;
    }
}