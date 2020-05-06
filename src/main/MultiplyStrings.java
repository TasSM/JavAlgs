package main;

public class MultiplyStrings {

  public static String multiply(String num1, String num2) {
    int m = num1.length();
    int n = num2.length();
    int[] out = new int[m + n];

    for (int i = num1.length() - 1; i >= 0; i--) {
      for (int j = num2.length() - 1; j >= 0; j--) {
        int mul = (num1.charAt(i)-'0') * (num2.charAt(j)-'0');
        int sum = mul + out[i+j+1];
        out[i+j] += sum / 10;
        out[i+j+1] = (sum) % 10;
      }
    }

    StringBuilder sb = new StringBuilder();
    for (int k : out)
      if (!(sb.length() == 0 && k == 0))
        sb.append(k);
    return sb.length() == 0 ? "0" : sb.toString();
  }
}
