import java.util.*;
public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word to check for palindrome:");
        String str = sc.nextLine();
        sc.close();
        System.out.println("Palindrome check successful: " + isPalindrome(str, 0)); 
    }

    private static boolean isPalindrome(String str, int pos) {
        if(pos == str.length() / 2) {
            return true;
        }
        if(str.charAt(pos) != str.charAt(str.length() - pos - 1)) {
            return false;
        }
        return isPalindrome(str, pos+1);
    }
}
