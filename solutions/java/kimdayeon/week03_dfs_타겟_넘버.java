/**
 * [kimdayeon] week03 - 타겟_넘버
 * 유형: dfs
 * 날짜: 2026-06-17
 * 출처: https://school.programmers.co.kr/learn/courses/30/lessons/43165
 *
 * 학습 내용:
 * "한 호출 = 한 칸 = 한 가지 결정" 원칙. 미래 정보(next)를 인자로 넘기면 인덱스 경계가 꼬임.
 */
class Solution {
    public int solution(int[] numbers, int target) {
        return dfs(numbers, target, 0, 0);
    }

    private int dfs(int[] numbers, int target, int index, int sum) {
        if (index == numbers.length) {
            if (sum == target) return 1;

            return 0;
        }

        // 현재 숫자를 더하기/빼기로 분기
        int add = dfs(numbers, target, index + 1, sum + numbers[index]);
        int subtract = dfs(numbers, target, index + 1, sum - numbers[index]);

        return add + subtract;
    }
}
