import java.util.*;
public class ReverseAnArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        reverseArray(arr, 0);
        System.out.print("The reversed array is: ");
        for(int i=0;i<n;i++) {
            System.out.print(arr[i] + " ");
        }
    }   
    
    private static void reverseArray(int[] arr, int pointer) {
        if(pointer == arr.length/2) {
            return;
        }
        int temp = arr[pointer];
        arr[pointer] = arr[arr.length - pointer - 1];
        arr[arr.length-pointer-1] = temp;
        reverseArray(arr, pointer+1);
    }
}
