import java.util.*;

public class SubsequencesWithSumK {
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
        printSubsequencesWithSumK(elements, 0, k, 0, new Stack<Integer>());
    }

    public static void printSubsequencesWithSumK(int[] arr, int pos, int k, int sum, Stack<Integer> st) {
        if(pos >= arr.length) {
            if(sum == k) {
                System.out.println(st);
            }
            return;
        }
        st.push(arr[pos]);
        printSubsequencesWithSumK(arr, pos+1, k, sum+arr[pos], st);
        st.pop();
        printSubsequencesWithSumK(arr, pos+1, k, sum, st);
    }
}
