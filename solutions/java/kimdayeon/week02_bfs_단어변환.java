/**
 * [kimdayeon] week02 - 단어변환
 * 유형: bfs
 * 날짜: 2026-06-09
 * 출처: https://school.programmers.co.kr/learn/courses/30/lessons/43163
 *
 * 학습 내용:
 * 최단 거리(최소 변환 횟수)를 구할 때는 DFS보다 BFS가 적합함.
 * BFS는 레벨 단위로 탐색하므로 처음 목표에 도달하는 순간이 곧 최솟값.
 * 현재 상태(단어)와 누적 거리를 함께 관리하기 위해 Node 클래스를 활용.
 */
import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        // 1. target이 words 안에 있는지 먼저 확인
        boolean found = false;
        for (String w : words) {
            if (w.equals(target)) {
                found = true;
                break;
            }
        }
        if (!found) return 0;

        // 2. BFS 준비
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(begin, 0));
        boolean[] visited = new boolean[words.length];

        // 3. BFS 탐색
        while (!queue.isEmpty()) {
            Node current = queue.poll();

            // 목표 도달 시 단계 반환
            if (current.word.equals(target)) return current.count;

            // 변환 가능한 단어 찾기
            for (int i = 0; i < words.length; i++) {
                if (!visited[i] && canConvert(current.word, words[i])) {
                    visited[i] = true;
                    queue.add(new Node(words[i], current.count + 1));
                }
            }
        }

        return 0;
    }

    private boolean canConvert(String s1, String s2) {
        int diff = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) diff++;
        }
        return diff == 1;
    }

    class Node {
        String word;
        int count;
        Node(String word, int count) {
            this.word = word;
            this.count = count;
        }
    }
}
