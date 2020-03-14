package test;

import static org.testng.Assert.*;

import main.MultiplyStrings;
import org.testng.annotations.Test;

public class MultiplyStringsTest {

  @Test
  public void test1() {
    String s = MultiplyStrings.multiply("11", "11");
    assertEquals(s, "121");
  }

  @Test
  public void test2() {
    String s = MultiplyStrings.multiply("10", "70");
    assertEquals(s, "700");
  }

  @Test
  public void test3() {
    String s = MultiplyStrings.multiply("0", "55");
    assertEquals(s, "0");
  }

  @Test
  public void test4() {
    String s = MultiplyStrings.multiply("6913259244", "71103343");
    assertEquals(s, "491555843274052692");
  }

}