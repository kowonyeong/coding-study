/**
 * [kimdayeon] week01 - 정수 삼각형
 * 유형: dp
 * 날짜: 2026-06-05
 * 출처: https://school.programmers.co.kr/learn/courses/30/lessons/43105
 *
 * 학습 내용:
 *
 */
class Solution {
    public int solution(int[][] triangle) {
        for (int i = triangle.length - 2; i >= 0; i--) {
            for (int j = 0; j < triangle[i].length; j++) {
                triangle[i][j] += Math.max(triangle[i + 1][j], triangle[i + 1][j + 1]);
            }
        }
        return triangle[0][0];
    }
}
