/**
 * [kimdayeon] week01 - 가장 먼 노드
 * 유형: bfs
 * 날짜: 2026-06-06
 * 출처: https://school.programmers.co.kr/learn/courses/30/lessons/49189
 *
 * 학습 내용:
 * ArrayDeque가 LinkedList보다 메모리 효율이 좋음; distance 배열을 -1로 초기화해 visited 배열 없이 방문 여부 체크 가능
 */
// https://school.programmers.co.kr/learn/courses/30/lessons/49189
// 인덱스가 필요없을 때는 Queue를 ArrayDeque로 구현하는게 LinkedList보다 메모리 효율이 좋음
// visited를 따로 안 만들고 거리 배열에 -1로 초기화하며 미방문 시 계산시킬 수 있음

import java.util.*;

class Solution {
    public int solution(int n, int[][] edge) {
        // 간선 그래프 초기화
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < edge.length; i++) {
            graph.get(edge[i][0] - 1).add(edge[i][1] - 1);
            graph.get(edge[i][1] - 1).add(edge[i][0] - 1);
        }

        // 거리 배열, 미방문 시 -1
        int[] distance = new int[n];
        Arrays.fill(distance, -1);

        int maxDistance = -1;

        // 방문할 노드
        Queue<Integer> q = new ArrayDeque<>();

        // 시(int neighbor : graph.get(current)) {
                if (distance[neighbor] == -1) {
                    distance[neighbor] = distance[current] + 1;
                    q.add(neighbor);
                    maxDistance = Math.max(maxDistance, distance[neighbor]);
                }
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (distance[i] == maxDistance) {
                count++;
            }
        }

        return count;
    }
}
