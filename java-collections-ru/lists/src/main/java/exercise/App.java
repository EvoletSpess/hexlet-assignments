package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// BEGIN
public class App {
    public static boolean scrabble(String symbols, String word) {
        if (symbols.length() < word.length()) {
            return false;
        }

        List<Character> symbolsList = new ArrayList<>();
        List<Character> wordList = new ArrayList<>();

        for (char c : symbols.toCharArray()) {
            symbolsList.add(Character.toLowerCase(c));
        }

        for (char c : word.toCharArray()) {
            wordList.add(Character.toLowerCase(c));
        }

        Collections.sort(symbolsList);
        Collections.sort(wordList);

        boolean canFormWord = true;
        for (char c : wordList) {
            if (Collections.frequency(symbolsList, c) < Collections.frequency(wordList, c)) {
                canFormWord = false;
                break;
            }
        }

        return canFormWord;
    }
}
//END
