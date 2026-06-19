/**
 * [kimdayeon] week03 - 카테고리 별 도서 판매량 집계하기
 * 유형: group_by
 * 날짜: 2026-06-19
 * 출처: https://school.programmers.co.kr/learn/courses/30/lessons/144855
 *
 * 학습 내용:
 * SALES_DATE를 BETWEEN '2022-01-01' AND '2022-02-01'로 했는데 실패가 떠서 부등식으로 바꿈
 */

SELECT
    CATEGORY,
    SUM(SALES) AS TOTAL_SALES
FROM BOOK_SALES s
JOIN BOOK b ON s.BOOK_ID = b.BOOK_ID
WHERE SALES_DATE >= '2022-01-01' AND SALES_DATE < '2022-02-01'
GROUP BY CATEGORY
ORDER BY CATEGORY ASC;
