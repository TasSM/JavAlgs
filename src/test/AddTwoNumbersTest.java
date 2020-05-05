package test;

import static org.testng.Assert.*;

import main.ListNode;
import main.AddTwoNumbers;
import org.testng.annotations.DataProvider;
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

  @DataProvider(name = "addTestData")
  public Object[][] dataProviderMethod() throws Exception{
    return new Object[][]{
        {new TestTuple<>(new ListNode[]{createList(new int[]{1,2}), createList(new int[]{1,2})}, new int[]{2,4})},
        {new TestTuple<>(new ListNode[]{createList(new int[]{2,4,3}), createList(new int[]{5,6,4})}, new int[]{7,0,8})},
        {new TestTuple<>(new ListNode[]{createList(new int[]{3,6,2}), createList(new int[]{0,5,2})}, new int[]{3,1,5})},
        {new TestTuple<>(new ListNode[]{createList(new int[]{5}), createList(new int[]{5})}, new int[]{0,1})}
    };
  }

  @Test(dataProvider = "addTestData")
  public void testAddNumbers(TestTuple<ListNode[], int[]> t) {
    ListNode output = AddTwoNumbers.addTwoNumbers(t.test[0], t.test[1]);
    for (int i = 0; i < t.model.length-1; i++) {
        assertEquals(output.val, t.model[i]);
        if (output.next != null) {
          output = output.next;
        }
    }
  }
}