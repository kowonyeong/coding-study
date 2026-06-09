/**
 * [kimdayeon] week02 - 대장균의_크기에_따라_분류하기_2
 * 유형: window_function
 * 날짜: 2026-06-09
 * 출처: https://school.programmers.co.kr/learn/courses/30/lessons/301649
 *
 * 학습 내용:
 * PERCENT_RANK() 윈도우 함수 사용법
 * RANK/DENSE_RANK/ROW_NUMBER/PERCENT_RANK/CUME_DIST 차이점
 */

SELECT
    ID,
    CASE
        WHEN pr <= 0.25 THEN 'CRITICAL'
        WHEN pr <= 0.50 THEN 'HIGH'
        WHEN pr <= 0.75 THEN 'MEDIUM'
        ELSE 'LOW'
    END AS COLONY_NAME
FROM (
    SELECT
        ID,
        PERCENT_RANK() OVER (ORDER BY SIZE_OF_COLONY DESC) AS pr
    FROM ECOLI_DATA
) sub
ORDER BY ID ASC;
