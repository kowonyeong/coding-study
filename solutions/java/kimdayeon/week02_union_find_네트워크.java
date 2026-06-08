/**
 * [kimdayeon] week02 - 네트워크
 * 유형: union_find
 * 날짜: 2026-06-08
 * 출처: https://school.programmers.co.kr/learn/courses/30/lessons/43162
 *
 * 학습 내용:
 * 유니온 파인드 - init -> find -> union 구조
 * 간선이 추가되면서 집합 여부를 판단하는 유형
 * distinct할 때 parent[i]가 최종 루트값이 아닐 수 있기 때문에 find(i)로 추가해야함.
 */

import java.util.*;

class Solution {
    public int solution(int n, int[][] computers) {
        int[] parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }

        for (int i = 0; i < computers.length; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                if (computers[i][j] == 1) {
                    union(i, j, parent);
                }
            }
        }

        Set<Integer> distinct = new HashSet<>();
        for (int i = 0; i < n; i++) {
            distinct.add(find(parent[i], parent));
        }

        return distinct.size();
    }

    private int find(int x, int[] parent) {
        if (parent[x] == x) return x;
        return parent[x] = find(parent[x], parent);
    }

    private void union(int a, int b, int[] parent) {
        int rootA = find(a, parent);
        int rootB = find(b, parent);
        if (rootA != rootB) parent[rootB] = rootA;
    }
}
