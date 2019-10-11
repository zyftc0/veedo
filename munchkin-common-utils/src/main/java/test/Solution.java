package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * ing: 未解决，解决中
 * complete: 已解决
 */
public class Solution {

    public static void main(String[] args) {
//        int[] A = {6, 3, 4, 7, 2, 5, 1, 3};
//        System.out.println(sumSubarrayMins(A));

        int[] A = {11, 5, 1, 5, 4, 3, 1, 15, 2, 2, 3, 1, 6, 3, 3};
        combinationSum2(A, 12);
    }

    /**
     * 40 给定一个数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。ing
     * @param candidates
     * @param target
     * @return
     */
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        HashMap<Integer, Integer> intAndTimes = new HashMap<>();
        Arrays.stream(candidates)
                .filter(v -> v < target)
                .forEach(v -> {
                    if (intAndTimes.containsKey(v)) {
                        intAndTimes.put(v, intAndTimes.get(v)+1);
                    } else {
                        intAndTimes.put(v, 1);
                    }
                });

        return null;
    }

    /**
     * 907 求一个数组的连续子数组的最小数之和 ing
     * @param A
     * @return
     */
    public static int sumSubarrayMins(int[] A) {
        int len = A.length;

        if (len <= 0) return 0;

        // 前驱数组
        int[] pre = new int[len];
        Stack<Integer> stack = new Stack<>();
        Stream.iterate(0, i -> i+1).limit(len).forEach(i -> {
            while (!stack.isEmpty() && A[i] <= A[stack.peek()]) {
                stack.pop();
            }
            pre[i] = stack.isEmpty()?-1:stack.peek();
            stack.push(i);

        });

        // 后继数组
        int[] suf = new int[len];
        Stack<Integer> stack2 = new Stack<>();
        Stream.iterate(len-1, i -> i-1).limit(len).forEach(i -> {
            while (!stack2.isEmpty() && A[i] < A[stack2.peek()]) {
                stack2.pop();
            }
            suf[i] = stack2.isEmpty()?len:stack2.peek();
            stack2.push(i);
        });

        AtomicInteger sum = new AtomicInteger(0);
        IntStream.iterate(0, i -> i+1).limit(len).forEach(i -> sum.addAndGet((i-pre[i])*(suf[i]-i)*A[i]));
        return sum.get();
    }
}
