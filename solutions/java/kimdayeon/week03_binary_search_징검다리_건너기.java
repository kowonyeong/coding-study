/**
 * [kimdayeon] week03 - 징검다리_건너기
 * 유형: binary_search
 * 날짜: 2026-06-19
 * 출처: https://school.programmers.co.kr/learn/courses/30/lessons/64062
 *
 * 학습 내용:
 */
class Solution {
    public int solution(int[] stones, int k) {
        int min = 1;
        int max = 200000000;
        int answer = 0;

        while (min <= max) {
            int mid = min + (max - min) / 2;

            if (canCross(stones, k, mid)) {
                answer = mid;
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }

        return answer;
    }

    private boolean canCross(int[] stones, int k, int mid) {
        int skipCount = 0;

        for (int stone : stones) {
            if (stone < mid) {
                skipCount++;

                if (skipCount >= k) {
                    return false;
                }
            } else {
                skipCount = 0;
            }
        }

        return true;
    }
}
