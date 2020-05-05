package test;

import static org.testng.Assert.*;

import main.LongestPalindrome;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LongestPalindromeTest {

  @DataProvider(name = "palindromeTestData")
  public Object[][] dataProviderMethod() {
    return new Object[][]{
        {new TestTuple<>("abcecdef", "cec")},
        {new TestTuple<>("xooox", "xooox")},
        {new TestTuple<>("sausage", "s")},
        {new TestTuple<>("alphaahplcoc", "lphaahpl")},
        {new TestTuple<>("", "")},
        {new TestTuple<>(
            "ddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd",
            "ddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd")
        }
    };
  }

  @Test(dataProvider = "palindromeTestData")
  public void test1(TestTuple<String, String> t) {
    String out = LongestPalindrome.longestPalindrome(t.test);
    assertEquals(out, t.model);
  }

}
