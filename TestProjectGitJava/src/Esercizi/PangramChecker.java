package Esercizi;

import java.util.*;

public class PangramChecker {
    public boolean check(String sentence) {
        String replace = sentence.replaceAll("[^A-Za-z]", "");
        System.out.println(replace);
        Set<String> letters = new HashSet<>(Arrays.asList(replace.split("")));
        System.out.println(letters);
        return letters.size() >= 26;
    }
}
