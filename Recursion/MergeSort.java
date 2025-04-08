import java.util.Scanner;

public class MergeSort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter array elements separated by a space");
        String[] sarr = sc.nextLine().split(" ");
        sc.close();
        int[] elements = new int[n];
        for(int i=0;i<elements.length;i++) {
            elements[i] = Integer.parseInt(sarr[i]);
        }
        sortByMerge(elements, 0, elements.length-1);
        System.out.println("The sorted array is: ");
        for(int i=0;i<elements.length;i++) {
            System.out.print(elements[i] + " ");
        }
    }

    public static void sortByMerge(int[] arr, int low, int high) {
        if(low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        sortByMerge(arr, low, mid);
        sortByMerge(arr, mid+1, high);
        merge(arr, low, mid, high);
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        // Only have the size of the merging arrays.
        int[] temp = new int[high - low + 1];
        int left = low;
        int right = mid+1;
        int c = 0;
        while(left <= mid && right <= high) {
            if(arr[left] <= arr[right]) {
                temp[c] = arr[left];
                left++;
            } else {
                temp[c] = arr[right];
                right++;
            }
            c++;
        }
        while(left <= mid) {
            temp[c] = arr[left];
            left++;
            c++;
        }
        while(right <= high) {
            temp[c] = arr[right];
            right++;
            c++;
        }

        // Only update the indexes which belong to the current merge call.
        for(int i=0;i<temp.length;i++) {
            arr[low + i] = temp[i];
        }
    }
}
