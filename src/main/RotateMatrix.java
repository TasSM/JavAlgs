package main;

public class RotateMatrix {

  public static void rotate(int[][] matrix) {
    int temp;
    int len = matrix[0].length;
    for (int i = 0; i < len/2; i++) {
      for (int j = i; j < len-i-1; j++) {
        temp = matrix[i][j];
        matrix[i][j] = matrix[len-1-j][i];
        matrix[len-1-j][i] = matrix[len-1-i][len-1-j];
        matrix[len-1-i][len-1-j] = matrix[j][len-1-i];
        matrix[j][len-1-i] = temp;
      }
    }
  }
}
