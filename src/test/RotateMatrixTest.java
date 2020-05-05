package test;

import static org.testng.Assert.*;

import main.RotateMatrix;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RotateMatrixTest {

  @DataProvider(name = "rotateMatrixTestData")
  public Object[][] dataProviderMethod() {
    return new Object[][]{
        { new TestTuple<>(new int[][]{{1,2}, {3,4}}, new int[][]{{3,1}, {4,2}}) },
        { new TestTuple<>(new int[][]{{1,2,3}, {4,5,6}, {7,8,9}}, new int[][]{{7,4,1}, {8,5,2}, {9,6,3}}) },
        { new TestTuple<>(new int[][]{{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}}, new int[][]{{13,9,5,1}, {14,10,6,2}, {15,11,7,3}, {16,12,8,4}}) }
    };
  }

  @Test(dataProvider = "rotateMatrixTestData")
  public void testRotation(TestTuple<int[][], int[][]> t) {
    RotateMatrix.rotate(t.test);
    assertEquals(t.test, t.model);
  }
}