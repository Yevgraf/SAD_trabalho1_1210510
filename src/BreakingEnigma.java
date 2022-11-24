import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class BreakingEnigma {


    int x = 2;


    public Vector<String> allCombinations() {
        String[] salt = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M"};
        Vector<String> tmp = null;
        {
            int count = salt.length;
            // Traverse all possible lengths
            for (int z = 0; z < x - 1; z++) {

                // Stores all combinations
                // of length z
                tmp = new Vector<String>();

                // Traverse the array
                for (int i = 0; i < salt.length; i++) {
                    for (int k = 0; k < salt.length; k++) {
                        if (salt[i] != salt[k]) {

                            //gerar todas combinações
                            tmp.add(salt[k] + salt[i]);
                            count += 1;
                        }
                    }
                }
                // Print all combinations of length z
                for (int i = 0; i < tmp.size(); i++) {
                    System.out.print(tmp.get(i) + " ");

                }

            }
        }
        return tmp;

    }


    public List<String> readWordlist(String wordlist) throws IOException {

        List<String> words = new ArrayList<String>();
        try {
            BufferedReader input = new BufferedReader(new FileReader(wordlist));
            // for each line
            for (String line = input.readLine(); line != null; line = input.readLine()) {
                words.add(line);
            }
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
            return null;
        }
        return words;
    }


    public void wordSaltCombined(String wordlist) throws IOException {
        for (int i = 0; i < readWordlist(wordlist).size(); i++) {
            String word = readWordlist(wordlist).get(i);
            for (int j = 16; j < allCombinations().size(); j++) {
                String salt = allCombinations().get(j);
                String concatenate = word + salt;
                System.out.println(concatenate);
            }
        }

    }
}





