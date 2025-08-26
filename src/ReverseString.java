import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();
        System.out.println(reverseString(str));
    }

    public static String reverseString(String str){
        String revString = "";

        for(int i = str.length() - 1; i >= 0; i--){
            char ch = str.charAt(i);
            revString += ch;
        }
        return revString;

    }
}
