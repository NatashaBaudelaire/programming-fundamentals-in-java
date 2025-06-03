package reversesentence;
import java.util.Scanner;

public class reversesentence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();


        String[] words = sentence.split(" ");


        StringBuilder reversedWords = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedWords.append(words[i]);
            if (i != 0) {
                reversedWords.append(" ");
            }
        }

        System.out.println("The sentence with words reversed is: " + reversedWords.toString());

        input.close();
    }
}
