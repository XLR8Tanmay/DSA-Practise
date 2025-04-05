import java.util.*;

public class CountOfSubsequencesWithSumK {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the elements of the array separated by a space:");
        String[] ele = sc.nextLine().split(" ");
        int[] elements = new int[n];
        for(int i=0;i<n;i++) {
            elements[i] = Integer.parseInt(ele[i]);
        }
        System.out.println("Enter the value of K:");
        int k = sc.nextInt();
        sc.close();
        int count = printSubsequencesWithSumK(elements, 0, k, 0);
        System.out.println("Count of subsequences with sum K is: "+ count);
    }

    public static int printSubsequencesWithSumK(int[] arr, int pos, int k, int sum) {
        if(pos >= arr.length) {
            if(sum == k) {
                return 1;
            }
            return 0;
        }
        sum += arr[pos];
        int left = printSubsequencesWithSumK(arr, pos+1, k, sum);
        sum -= arr[pos];
        int right = printSubsequencesWithSumK(arr, pos+1, k, sum);
        return left + right;
    }
}
