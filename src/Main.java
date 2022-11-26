import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        BreakingEnigma breaking = new BreakingEnigma();
        Scanner read = new Scanner(System.in);
        boolean error = false;

        System.out.println("Introduza o caminho para a wordlist");
        do {
            error = false;

            try {
                error = true;
                String someUserFile = read.nextLine();

                File file = new File(someUserFile);
                Scanner inputFile = new Scanner(file);

                String wordFile = null;
                while (inputFile.hasNext()) {
                    wordFile = inputFile.nextLine();
                    breaking.allSaltCombinations(wordFile);
                }
                break;
            } catch (Exception e) {
                System.out.println("Introduza input válido");
            }
        }
        while (error);
    }
}

