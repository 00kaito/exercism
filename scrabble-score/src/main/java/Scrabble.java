import java.util.HashMap;
import java.util.Map;

class Scrabble {
    Map<String, Integer> letterValue = new HashMap<String, Integer>();
    int score = 0;

    Scrabble(String word) {
        letterValue.put("AEIOULNRST", 1);
        letterValue.put("DG", 2);
        letterValue.put("BCMP", 3);
        letterValue.put("FHVWY", 4);
        letterValue.put("K", 5);
        letterValue.put("JX", 8);
        letterValue.put("QZ", 10);
        Character character;

        for (int i = 0; i < word.length(); i++) {
            character = word.charAt(i);
            for (String key : letterValue.keySet()) {
                if (key.toString().toUpperCase().contains(character.toString().toUpperCase()))
                    score += letterValue.get(key);
            }
        }
    }
    int getScore() {
        return score;
    }
}

