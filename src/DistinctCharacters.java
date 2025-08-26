import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DistinctCharacters {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            Set<Character> distictCharacters = new HashSet<Character>();
            for(char c : input.toCharArray()){
                distictCharacters.add(c);
            }
            for(Character c : distictCharacters){
                System.out.println(c);
            }
    }
}
