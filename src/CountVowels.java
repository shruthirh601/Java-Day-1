import java.util.Scanner;

public class CountVowels {
    public static int returnVowelCount(String str){
        int vowelCount = 0;
        for(char ch : str.toLowerCase().toCharArray()){
            if(ch =='a' || ch =='o' ||ch =='e' ||ch =='i' ||ch =='u')
                vowelCount++;
        }
        return vowelCount;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();
        System.out.println(String.format("The number of vowels in the word %s is: %d", str, returnVowelCount(str)));

    }
}
