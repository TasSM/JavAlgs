package test;

import static org.testng.Assert.*;

import main.MergeIntervals;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MergeIntervalsTest {

  @DataProvider(name = "intervalData")
  public Object[][] dataProviderMethod() {
    return new Object[][] {
        { new TestTuple<>(new int[][]{{1,3},{2,6},{8,10},{15,18}}, new int[][]{{1,6},{8,10},{15,18}})},
        { new TestTuple<>(new int[][]{{1,4},{4,5}}, new int[][]{{1,5}})},
        { new TestTuple<>(new int[][]{{1,4},{0,4}}, new int[][]{{0,4}})},
        { new TestTuple<>(new int[][]{{1,4},{0,4},{1,15}}, new int[][]{{0,15}})},
        { new TestTuple<>(new int[][]{}, new int[][]{})}
    };
  }

  @Test(dataProvider = "intervalData")
  public void testMerge(TestTuple<int[][], int[][]> t) {
     int[][] result = MergeIntervals.merge(t.test);
     assertEquals(result, t.model);
  }
}