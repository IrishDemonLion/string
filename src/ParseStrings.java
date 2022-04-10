import java.util.Scanner;

public class ParseStrings {
    public static void main(String[]args){
        Scanner scnr = new Scanner(System.in);
        Scanner inputword;
        String inputline = "";
        String substring1 = "";
        String substring2 = "";
        System.out.println("Enter input string: ");

        while (!inputline.matches("q")){
            inputline = scnr.nextLine();
            inputline = inputline.replace(",",", ");
            inputword = new Scanner(inputline);
            int commaPos = inputline.indexOf(",");

            if (commaPos <= -1) && (!inputline.matches("q") == false){
                System.out.println("Error: No comma in string");
                System.out.println("Enter input string: ");
            }
            else if ((commaPos <= -1) && (inputline.length() ==0 || inputline.split("\\s+").length < 2) && (inputline.matches("q") == false)) {
                System.out.println("Please enter two words");
                System.out.println("Enter input string: ");
                else if (inputline.matches("q") == false){
                    substring1 = inputword.next();
                    substring2 = inputword.nextLine();

                    System.out.println("First word: " + substring1.replaceAll("\\s",""));
                    System.out.println("Second word: " + substring2.replaceAll("\\s","").replaceAll("\\W",""));

                    System.out.println("\n");
                    System.out.println("Enter input string: ");
                }
            }
        }
    }
}