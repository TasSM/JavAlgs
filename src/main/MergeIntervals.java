package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

public class MergeIntervals {

    public static int[][] merge(int[][] intervals) {
        if (intervals == null) {return null;}
        if (intervals.length == 0) {return new int[][]{};}
        if (intervals.length == 1) {return intervals;}
        Stack<int[]> stack=new Stack<>();
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        stack.push(intervals[0]);
        for (int i = 0; i < intervals.length; i++) {
            int[] top = stack.peek();
            if (top[1] < intervals[i][0]) {stack.push(intervals[i]);}
            else if (top[1] < intervals[i][1]) {
                top[1] = intervals[i][1];
                stack.pop();
                stack.push(top);
            }
        }
        List<int[]> arr = new ArrayList<int[]>();
        int[][] out = new int[stack.size()][];
        int j = stack.size();
        while (!stack.isEmpty()) {
            j--;
            out[j]=stack.pop();
        }
        return out;
    }
}
