package test;

import static org.testng.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.xml.crypto.Data;
import main.NumberCombinator;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NumberCombinatorTest {

  @DataProvider(name = "keycombos")
  public Object[][] dataProviderMethod() {
    return new Object[][] {
        {
          new TestTuple<String, List<String>>("23", new ArrayList<>(
          Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf")))
        },
        {
            new TestTuple<String, List<String>>("7", new ArrayList<>(
                Arrays.asList("p", "q", "r", "s")))
        },
        {
            new TestTuple<String, List<String>>("458", new ArrayList<>(
                Arrays.asList("gjt", "gju", "gjv", "gkt", "gku", "gkv", "glt", "glu", "glv",
                    "hjt", "hju", "hjv", "hkt", "hku", "hkv", "hlt", "hlu", "hlv",
                    "ijt", "iju", "ijv", "ikt", "iku", "ikv", "ilt", "ilu", "ilv")))
        }
    };
  }

  @Test(dataProvider = "keycombos")
  public void testLetterCombinations(TestTuple<String, List<String>> t) {
    assertEquals(NumberCombinator.letterCombinations(t.test), t.model);
  }
}