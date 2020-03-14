package test;

import static org.testng.Assert.*;

import main.RotateMatrix;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RotateMatrixTest {

  @Test
  public void testRotate2x2() {
    int[][] test = new int[][]{{1,2}, {3,4}};
    int[][] model = new int[][]{{3,1}, {4,2}};
    RotateMatrix.rotate(test);
    assertEquals(test, model);
  }

  @Test
  public void testRotate3x3() {
    int[][] test = new int[][]{{1,2,3}, {4,5,6}, {7,8,9}};
    int[][] model = new int[][]{{7,4,1}, {8,5,2}, {9,6,3}};
    RotateMatrix.rotate(test);
    assertEquals(test, model);
  }

  @Test
  public void testRotate4x4() {
    int[][] test = new int[][]{{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
    int[][] model = new int[][]{{13,9,5,1}, {14,10,6,2}, {15,11,7,3}, {16,12,8,4}};
    RotateMatrix.rotate(test);
    assertEquals(test, model);
  }
}