import java.util.Map;
import java.util.HashMap;

public class WordCount {
    public Map<String, Integer> phrase(String input) {
        Map<String, Integer> wordCount = new HashMap<>();
        String[] arrayOfWords = input.toLowerCase().split("[,\\:!&@$%\\^\\.\\s]+");

        for (String string : arrayOfWords) {
            String withoutSpace = string.trim().replaceAll("^[']+|[']+$", "");
            if(!withoutSpace.isEmpty()) {
                wordCount.merge(withoutSpace, 1, Integer::sum);
            }
        }
    
        return wordCount;
    }
}
