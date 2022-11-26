import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        BreakingEnigma breaking = new BreakingEnigma();
        Scanner read = new Scanner(System.in);

        //C:\Users\RafaelMagalhães(1210\Documents
        System.out.println("Introduza o caminho para a wordlist");
        String someUserFile = read.nextLine();

        File file = new File(someUserFile);
        Scanner inputFile = new Scanner(file);

        String wordFile = null;
        while (inputFile.hasNext()) {
            wordFile = inputFile.nextLine();
        }
        breaking.allCombinations(wordFile);

    }
}
