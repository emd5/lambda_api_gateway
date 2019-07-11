package lambda_api_gateway;

import java.util.HashSet;

public class RepeatedWord {

    public static String repeatedWord(String inputWord) {

        String[] wordArray = inputWord.split("\\s*(=>|[,.!?\"]|\\s)\\s*");
        HashSet hashSet = new HashSet();
        for (int i = 0; i < wordArray.length; i++) {
            if (hashSet.contains(wordArray[i])) {
                return wordArray[i];
            } else {
                hashSet.add(wordArray[i].toLowerCase());
            }
        }
        return null;
    }
}
