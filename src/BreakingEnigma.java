import java.sql.SQLOutput;
import java.util.*;

public class BreakingEnigma {

    HashMap<String, String> plugboard = new HashMap<String, String>(Map.of("S", "U", "Q", "V", "H", "C", "W", "L", "O", "F", "G", "R", "Z", "P", "J", "X", "T", "B", "A", "D"));
    String[] salt = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M"};
    ArrayList<String> saltedWord = new ArrayList<>();

    public ArrayList allSaltCombinations(String wordfile)  {


            for (String word1 : salt
            ) {
                String salted = word1;

                for (String word2 : salt
                ) {
                    String salted2 = word2;
                    String saltComb = salted + salted2;
                    String begMerged = saltComb+wordfile;
                    String endMerged = wordfile+saltComb;
//                    System.out.println("Salt: "+ saltComb);
//                    System.out.println("Salt no inicio: " +begMerged);
//                    System.out.println("Salt no fim: " + endMerged);
//                    System.out.println("------------------------------");
                    saltedWord.add(begMerged);
                    saltedWord.add(endMerged);
                }
            }
        return saltedWord;
    }

    public void plugboard(){
        for (int i = 0; i < saltedWord.size(); i++) {
            String saltW = saltedWord.get(i);
            System.out.println(saltW);
        }

    }
}