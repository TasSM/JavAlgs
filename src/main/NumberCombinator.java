package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * An algorithm to return mobile phone letter combinations based on digit input
 * Based on a standard 0-9 phone handset.
 *
 * EXAMPLE
 * Input: "23" Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 */
public class NumberCombinator {
  public static List<String> letterCombinations(String digits) {
    ArrayList<String> out = new ArrayList<String>();
    HashMap keyVals = keyMap();
    if (digits.isEmpty() || digits == null) return out;
    char[] combo = new char[digits.length()];
    recursiveSearch(out, keyVals, digits, combo, 0, digits.length());
    return out;
  }

  public static void recursiveSearch(List output, HashMap<Character, char[]> mappings, String digits, char[] combination, int idx, int length) {
    if (idx == length) {
      output.add(new String(combination));
      return;
    }
    char[] keyVals = mappings.get(digits.charAt(idx));
    for (char c : keyVals) {
      combination[idx] = c;
      recursiveSearch(output, mappings, digits, combination, idx+1, length);
    }
  }

  // Generate a map of number - lettter values
  public static HashMap<Character, char[]> keyMap(){
    HashMap<Character, char[]> out = new HashMap();
    out.put('2', new char[]{'a', 'b', 'c'});
    out.put('3', new char[]{'d', 'e', 'f'});
    out.put('4', new char[]{'g', 'h', 'i'});
    out.put('5', new char[]{'j', 'k', 'l'});
    out.put('6', new char[]{'m', 'n', 'o'});
    out.put('7', new char[]{'p', 'q', 'r', 's'});
    out.put('8', new char[]{'t', 'u', 'v'});
    out.put('9', new char[]{'w', 'x', 'y', 'z'});
    return out;
  }
}
