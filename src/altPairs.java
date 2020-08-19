public class altPairs {
  public String altPairs(String str) {
    String substr = "";
    for (int i = 0; i < str.length(); i += 4) {
      substr += str.charAt(i);
      if (i + 1 < str.length()) {
        substr += str.charAt(i + 1);
      }

    }
    return substr;
  }

}
