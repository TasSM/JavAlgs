package test;

import static org.testng.Assert.*;

import main.StringToInteger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StringToIntegerTest {

  /*
   * Private subclass to represent testing data tuples for the data provider
   */
  private class TestPair {

    public String sRep;
    public int iRep;

    public TestPair(String sRep, int iRep) {
      this.sRep = sRep;
      this.iRep = iRep;
    }
  }

  @DataProvider(name = "atoiTestData")
  public Object[][] dataProviderMethod() {
    return new Object[][] {
        {new TestPair("42", 42)},
        {new TestPair("72623", 72623)},
        {new TestPair("lfw828", 0)},
        {new TestPair("812398 hello test", 812398)},
        {new TestPair("-5", -5)},
        {new TestPair("-626", -626)},
        {new TestPair("ahsd-6s26", 0)},
        {new TestPair("2056783456", 2056783456)},
        {new TestPair("    -1090183456", -1090183456)},
        {new TestPair("-786578097801829329321", Integer.MIN_VALUE)},
        {new TestPair("1978236123871982391223", Integer.MAX_VALUE)}
    };
  }

  @Test(dataProvider = "atoiTestData")
  public void testAtoi(TestPair t) {
    assertEquals(StringToInteger.atoi(t.sRep), t.iRep);
  }
}