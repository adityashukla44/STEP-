public class OOPSBannerApp {

    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        char getCharacter() {
            return character;
        }

        String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {
        CharacterPatternMap[] patterns = {
            new CharacterPatternMap('O', new String[] {" *** ", "*   *", "*   *", "*   *", " *** "}),
            new CharacterPatternMap('P', new String[] {"****", "*   *", "****", "*   ", "*   "}),
            new CharacterPatternMap('S', new String[] {" *** ", "*    ", " *** ", "    *", " *** "})
        };

        String word = "OOPS";

        for (int row = 0; row < 5; row++) {
            StringBuilder line = new StringBuilder();
            for (int j = 0; j < word.length(); j++) {
                char ch = word.charAt(j);
                for (CharacterPatternMap cpm : patterns) {
                    if (cpm.getCharacter() == ch) {
                        if (line.length() > 0) {
                            line.append("  ");
                        }
                        line.append(cpm.getPattern()[row]);
                        break;
                    }
                }
            }
            System.out.println(line.toString());
        }
    }
}
