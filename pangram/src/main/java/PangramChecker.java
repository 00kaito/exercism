    public class PangramChecker {

        public static final int n = 26;

        public boolean isPangram(String input) {
            if (input.length() < n) {
                return false;
            }
            for (char c = 'A'; c <= 'Z'; c++) {
                if ((input.indexOf(c) < 0) && (input.indexOf((char) (c + 32)) < 0)) {
                    return false;
                }
            }
            return true;
        }
    }