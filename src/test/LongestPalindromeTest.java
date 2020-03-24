package test;

import static org.testng.Assert.*;

import main.LongestPalindrome;
import org.testng.annotations.Test;

public class LongestPalindromeTest {

  @Test
  public void test1() {
    String out = LongestPalindrome.longestPalindrome("abcecdef");
    assertEquals(out, "cec");
  }

  @Test
  public void test2() {
    String out = LongestPalindrome.longestPalindrome("xooox");
    assertEquals(out, "xooox");
  }

  @Test
  public void test3() {
    String out = LongestPalindrome.longestPalindrome("sausage");
    assertEquals(out, "s");
  }

  @Test
  public void test4() {
    String out = LongestPalindrome.longestPalindrome("alphaahplcoc");
    assertEquals(out, "lphaahpl");
  }

  @Test
  public void test5() {
    String out = LongestPalindrome.longestPalindrome("");
    assertEquals(out, "");
  }

  @Test
  public void test6() {
    String out = LongestPalindrome.longestPalindrome("ddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd");
    assertEquals(out, "ddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd");
  }
}