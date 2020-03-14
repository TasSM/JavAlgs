package main;

public class MultiplyStrings {

  public static String multiply(String num1, String num2) {
    String out = "";
    int track = 1;
    int carry = 0;
    int x,y,mult;
    for (int i = num1.length()-1; i > 0; i--) {
      for (int j = num2.length()-1; j > 0; j--) {
        x = indexInt(num1, i);
        y = indexInt(num2, j);
        mult = (x*y)+carry;
        out = (char)mult%10 + out;
        if (mult > 9) {
          carry = mult/10;
        }
        track++;
      }
    }
    return out;
  }

  private static int indexInt(String in, int index) {
    if (index > -1) {
      return Character.getNumericValue(in.charAt(index));
    }
    return 1;
  }
}
