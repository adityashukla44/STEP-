import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    public static void main(String[] args) {
        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[] {" *** ", "*   *", "*   *", "*   *", " *** "});
        patternMap.put('P', new String[] {"****", "*   *", "****", "*   ", "*   "});
        patternMap.put('S', new String[] {" *** ", "*    ", " *** ", "    *", " *** "});

        String word = "OOPS";

        for (int row = 0; row < 5; row++) {
            StringBuilder line = new StringBuilder();
            for (int j = 0; j < word.length(); j++) {
                String[] pattern = patternMap.get(word.charAt(j));
                if (line.length() > 0) {
                    line.append("  ");
                }
                line.append(pattern[row]);
            }
            System.out.println(line.toString());
        }
    }
}
