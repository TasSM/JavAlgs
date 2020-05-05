package test;

import static org.testng.Assert.*;

import main.StringToInteger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StringToIntegerTest {

  @DataProvider(name = "atoiTestData")
  public Object[][] dataProviderMethod() {
    return new Object[][] {
        {new TestTuple<>("42", 42)},
        {new TestTuple<>("72623", 72623)},
        {new TestTuple<>("lfw828", 0)},
        {new TestTuple<>("812398 hello test", 812398)},
        {new TestTuple<>("-5", -5)},
        {new TestTuple<>("-626", -626)},
        {new TestTuple<>("ahsd-6s26", 0)},
        {new TestTuple<>("2056783456", 2056783456)},
        {new TestTuple<>("    -1090183456", -1090183456)},
        {new TestTuple<>("-786578097801829329321", Integer.MIN_VALUE)},
        {new TestTuple<>("1978236123871982391223", Integer.MAX_VALUE)}
    };
  }

  @Test(dataProvider = "atoiTestData")
  public void testAtoi(TestTuple<String, Integer> t) {
    assertEquals(StringToInteger.atoi(t.test), (int)t.model);
  }
}