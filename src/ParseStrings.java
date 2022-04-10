import java.util.Scanner;

public class ParseStrings {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        String userInput = getUserInput(scnr);
        while (!userInput.equals("q")) {

            if (userInput.contains(",")) {
                showWordsIn(userInput);
            } else {
                System.out.println("Error: No comma in string");
            }

            System.out.println();

            userInput = getUserInput(scnr);
        }
    }

    private static void showWordsIn(String userInput) {
        int index = userInput.indexOf(",");
        String firstWord = userInput.substring(0, index).trim();
        String secondWord = userInput.substring(index + 1).trim();

        System.out.printf("First word: %s%n", firstWord);
        System.out.printf("Second word: %s%n", secondWord);
    }

    private static String getUserInput(Scanner scnr) {
        System.out.println("Enter input string: ");
        return scnr.nextLine();
    }
}