/**
 * [kimdayeon] week03 - 주식가격
 * 유형: stack
 * 날짜: 2026-06-16
 * 출처: https://school.programmers.co.kr/learn/courses/30/lessons/42584
 *
 * 학습 내용:
 * 단조 스택을 이용하면 "언제 조건이 깨지는가"를 O(N)에 효율적으로 처리할 수 있음
 */
import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] result = new int[prices.length];
        Stack<Integer> stack = new Stack<>(); // 주식의 인덱스(시간)를 저장할 스택

        for (int t = 0; t < prices.length; t++) {
            // 스택이 비어있지 않고, 현재 가격이 스택 최상단 인덱스의 가격보다 떨어졌을 때
            while (!stack.isEmpty() && prices[stack.peek()] > prices[t]) {
                int index = stack.pop(); // 가격이 떨어진 주식의 인덱스를 꺼냄
                result[index] = t - index; // 가격이 유지된 기간(현재 시간 - 구매 시간) 계산
            }
            stack.push(t); // 현재 시간(인덱스)을 스택에 추가
        }

        // 반복문이 끝난 후에도 스택에 남아있는 인덱스들은 끝까지 가격이 떨어지지 않은 것
        while (!stack.isEmpty()) {
            int index = stack.pop();
            result[index] = prices.length - 1 - index;
        }

        return result;
    }
}
