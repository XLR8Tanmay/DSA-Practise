import java.util.*;

public class PrintAllSubsequences {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the n elements separated by a space");
        String[] numbers = sc.nextLine().split(" ");
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++) {
            arr[i] = Integer.parseInt(numbers[i]);
        }
        sc.close();
        System.out.println("The subsequences are as follows:");
        printSubsequence(arr, 0, new Stack<Integer>());
    }

    public static void printSubsequence(int[] arr, int curPos, Stack<Integer> st) {
        if(curPos == arr.length) {
            System.out.println(st);
            return;
        }
        st.push(arr[curPos]);
        printSubsequence(arr, curPos+1, st);
        st.pop();
        printSubsequence(arr, curPos+1, st);
        
    }
}
