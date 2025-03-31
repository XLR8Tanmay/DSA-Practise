import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(getFactorial(n));

    }

    private static int getFactorial(int n) {
        if(n == 1 || n == 0) {
            return 1;
        }
        return n * getFactorial(n-1);
    }

}
