/**
 * [kimdayeon] week02 - 대장균들의_자식의_수_구하기
 * 유형: join
 * 날짜: 2026-06-08
 * 출처: https://school.programmers.co.kr/learn/courses/30/lessons/299305
 *
 * 학습 내용:
 *
 */

SELECT
    e.id,
    IFNULL(p.count, 0) AS child_count
FROM ECOLI_DATA e
LEFT JOIN (SELECT parent_id,
        count(*) AS count
     FROM ECOLI_DATA
     GROUP BY parent_id) p
ON e.id = p.parent_id
ORDER BY id ASC;
