package test;

import static org.testng.Assert.*;

import main.MultiplyStrings;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultiplyStringsTest {

  @DataProvider(name = "stringMultiplyData")
  public Object[][] dataProviderMethod() {
    return new Object[][] {
        {new TestTuple<>(new String[]{"11", "1"}, "11")},
        {new TestTuple<>(new String[]{"10", "70"}, "700")},
        {new TestTuple<>(new String[]{"0", "55"}, "0")},
        {new TestTuple<>(new String[]{"6913259244", "71103343"}, "491555843274052692")}
    };
  }

  @Test(dataProvider = "stringMultiplyData")
  public void testStringMultiply(TestTuple<String[], String> t) {
    String s = MultiplyStrings.multiply(t.test[0], t.test[1]);
    assertEquals(s, t.model);
  }

}