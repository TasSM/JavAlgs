package main;

import java.util.ArrayDeque;
import java.util.Deque;

public class AddTwoNumbers {
  static public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    // create 2 stack objects to store the numbers
    Deque<Integer> num1 = new ArrayDeque<>();
    Deque<Integer> num2 = new ArrayDeque<>();

    //convert the lists into a queue
    transformToQueue(l1, num1);
    transformToQueue(l2, num2);

    return expand(num1, num2);
  }

  static private void transformToQueue(ListNode list, Deque<Integer> queue) {
    while (list != null) {
      queue.addLast(list.val);
      if (list.next != null) {
        list = list.next;
        continue;
      }
      return;
    }
  }

  static private ListNode expand(Deque<Integer> q1, Deque<Integer> q2) {
    //while at least 1 list has digits left
    int carry = 0;
    int tempRes = 0;
    int numA = 0;
    int numB = 0;
    ListNode out = null;
    ListNode point = null;
    Deque<Integer> stk = new ArrayDeque<>();
    while (q1.peek() != null || q2.peek() != null) {
      numA = 0;
      numB = 0;
      //poll each list if not empty
      if (!q1.isEmpty()) {
        numA = q1.poll();
      }
      if (!q2.isEmpty()) {
        numB = q2.poll();
      }
      //Add the numbers with the carry
      tempRes = carry + numA + numB;
      if (tempRes > 9) {
        carry = 1;
      }
      else {
        carry = 0;
      }
      if (out == null) {
        out = new ListNode(tempRes%10);
        point  = out;
        continue;
      }
      point.next = new ListNode(tempRes%10);
      point = point.next;
    }
    //carry over the final value if necessary
    if (carry == 1) {
      point.next = new ListNode(carry);
    }
    return out;
  }
}