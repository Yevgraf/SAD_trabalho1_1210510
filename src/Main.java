import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
BreakingEnigma breaking = new BreakingEnigma();
String salt = "ABCDEFGHIJKLM";

String wordlist = "C:\\Users\\Rafael\\Desktop\\SAD\\wordlist.txt";
breaking.wordSaltCombined(wordlist);

    }
}
