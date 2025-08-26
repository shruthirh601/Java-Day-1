import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();
        String copy = str.toLowerCase();
        String revString = ReverseString.reverseString(copy);
        System.out.println(revString);
        if(copy.equals(revString)){
            System.out.println(String.format("The string %s is a palindrome.", str));
        }
        else {
            System.out.println(String.format("The string %s is not a palindrome.", str));
        }

    }
}
