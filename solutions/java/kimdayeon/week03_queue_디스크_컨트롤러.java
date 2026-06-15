/**
 * [kimdayeon] week03 - 디스크_컨트롤러
 * 유형: queue
 * 날짜: 2026-06-15
 * 출처: https://school.programmers.co.kr
 *
 * 학습 내용:
 *
 */
import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        int n = jobs.length;

        // 요청 시각 순으로 정렬
        Arrays.sort(jobs, (a, b) -> a[0] - b[0]);

        // 대기 큐: 소요시간 짧은 순 (동률이면 요청 빠른 순)
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if (a[1] == b[1]) return a[0] - b[0];
            return a[1] - b[1];
        });

        int idx = 0;    // 아직 큐에 안 넣은 작업 포인터
        int time = 0;   // 현재 시각
        int sum = 0;    // 반환 시간 합
        int done = 0;   // 처리 완료한 작업 수

        while (done < n) {
            // 1) 현재 시각까지 도착한 작업 전부 큐에 push
            while (idx < n && jobs[idx][0] <= time) {
                pq.add(jobs[idx]);
                idx++;
            }

            // 2) 큐가 비었으면 다음 도착 시각으로 점프, 아니면 실행
            if (pq.isEmpty()) {
                time = jobs[idx][0];
            } else {
                int[] cur = pq.poll();
                time += cur[1];           // 소요시간만큼 디스크 점유
                sum += time - cur[0];     // 종료 시각 − 요청 시각
                done++;
            }
        }

        return sum / n;
    }
}
