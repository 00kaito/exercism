class Acronym {
    String result;
    Acronym(String phrase) {
        StringBuilder sb = new StringBuilder();
        char tmp;
        sb.append(phrase.charAt(0));
        for (int i = 0; i < phrase.length(); i++) {
            if (phrase.charAt(i) == ' ' || phrase.charAt(i) == '-') {
                sb.append(phrase.charAt(i + 1));
            }
        }
        result = sb.toString().toUpperCase();
    }
    String get() {
        return result;
    }
}
