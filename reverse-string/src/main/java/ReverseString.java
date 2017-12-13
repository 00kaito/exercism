class ReverseString {
  
    String reverse(String textToReverse) {
        StringBuilder sb = new StringBuilder();
        return sb.append(textToReverse).reverse().toString();
    }
}