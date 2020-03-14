package test;

import static org.testng.Assert.*;

import main.ListNode;
import main.AddTwoNumbers;
import org.testng.annotations.Test;

public class AddTwoNumbersTest {

  //create a linkedlist for testing accepts a 1, 2 or 3 int array
  private ListNode createList(int[] in) throws Exception{
    if (in.length > 3) {
      throw new Exception("Invalid length");
    }
    ListNode list = new ListNode(in[0]);
    if (in.length >= 2) {
      list.next = new ListNode(in[1]);
    }
    if (in.length == 3) {
      list.next.next = new ListNode(in[2]);
    }
    return list;
  }

  @Test
  public void test1() throws Exception {
    ListNode output = AddTwoNumbers.addTwoNumbers(createList(new int[]{1,2}), createList(new int[]{1,2}));
    assertEquals(output.val, 2);
    assertEquals(output.next.val, 4);
  }

  @Test
  public void test2() throws Exception {
    ListNode output = AddTwoNumbers.addTwoNumbers(createList(new int[]{2,4,3}), createList(new int[]{5,6,4}));
    assertEquals(output.val, 7);
    assertEquals(output.next.val, 0);
    assertEquals(output.next.next.val, 8);
  }

  @Test
  public void test3() throws Exception {
    ListNode output = AddTwoNumbers.addTwoNumbers(createList(new int[]{3,6,2}), createList(new int[]{0,5,2}));
    assertEquals(output.val, 3);
    assertEquals(output.next.val, 1);
    assertEquals(output.next.next.val, 5);
  }

  @Test
  public void test4() throws Exception {
    ListNode output = AddTwoNumbers.addTwoNumbers(createList(new int[]{5}), createList(new int[]{5}));
    assertEquals(output.val, 0);
    assertEquals(output.next.val, 1);
  }
}