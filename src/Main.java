import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        BreakingEnigma breaking = new BreakingEnigma();

        Scanner scanner = new Scanner(new File("src/wordlist.txt"));
        String wordFile = null;
        while (scanner.hasNext()) {
            wordFile = scanner.nextLine();
        }

        breaking.allCombinations(wordFile);

    }
}
