/*
 * [kimdayeon] week02 - 특정_세대의_대장균_찾기
 * 유형: join
 * 날짜: 2026-06-12
 * 출처: https://school.programmers.co.kr/learn/courses/30/lessons/301650
 *
 * 학습 내용:
 *
 */
SELECT e3.ID
FROM ECOLI_DATA e1
JOIN ECOLI_DATA e2 ON e1.ID = e2.PARENT_ID
JOIN ECOLI_DATA e3 ON e2.ID = e3.PARENT_ID
WHERE e1.PARENT_ID IS NULL
ORDER BY e3.ID ASC;
