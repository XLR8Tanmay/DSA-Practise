import java.util.*;

class CombinationSumI {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[n];
        String[] sarr = sc.nextLine().split(" ");
        for(int i=0;i<arr.length;i++) {
            arr[i] = Integer.parseInt(sarr[i]);
        }
        int target = sc.nextInt();
        printSumElements(0, arr, target, new Stack<Integer>());

    }

    public static void printSumElements(int index, int[] arr, int target, Stack<Integer> st) {
        if(index == arr.length) {
            if(target == 0) {
                System.out.println(st);
            }
            return;
        }
        if(arr[index] <= target) {
            st.push(arr[index]);
            printSumElements(index, arr, target - arr[index], st);
            st.pop();
        }
        printSumElements(index+1, arr, target, st);
    }
}