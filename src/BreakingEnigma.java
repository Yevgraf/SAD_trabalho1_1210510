import java.io.*;
import java.util.*;

public class BreakingEnigma {


    int x = 2;


    public void allCombinations(String wordlist)  {
        String[] salt = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M"};

            for (String word1 : salt
            ) {
                String salted = word1;

                for (String word2 : salt
                ) {
                    String salted2 = word2;
                    String saltComb = salted + salted2;
                    String begMerged = saltComb+wordlist;
                    String endMerged = wordlist+saltComb;
                    System.out.println("Salt: "+ saltComb);
                    System.out.println("Salt no inicio: " +begMerged);
                    System.out.println("Salt no fim: " + endMerged);
                    System.out.println("------------------------------");
                }
            }
    }
}






