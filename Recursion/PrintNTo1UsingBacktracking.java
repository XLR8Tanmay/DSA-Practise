import java.util.*;

class PrintNTo1UsingBacktracking {
    private static void printNTo1(int i, int n) {
        if(i > n){
            return;
        }
        printNTo1(i+1, n);
        System.out.print(i + " ");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        printNTo1(1, n);  
    }
}