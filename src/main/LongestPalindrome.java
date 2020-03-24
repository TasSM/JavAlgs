package main;

public class LongestPalindrome {

  public static String longestPalindrome(String s) {
    if (s.length() == 0) return "";
    String out = s.substring(0,1);
    for (int i = 0; i < s.length()-1; i++) {
      for (int j = s.length()-1; j > 0; j--) {
        if (s.charAt(i) == s.charAt(j)) {
          if (j == i) break;
          if (checkPalindrome(s, i, j) && s.substring(i,j+1).length() > out.length()) {
              out = s.substring(i,j+1);
            }
          }
        }
      }
    return out;
  }

  private static boolean checkPalindrome(String s, int index1, int index2) {
    while (index1 <= index2) {
      if (s.charAt(index1) != s.charAt(index2)) {
        return false;
      }
      index1++;
      index2--;
    }
    return true;
  }
}
