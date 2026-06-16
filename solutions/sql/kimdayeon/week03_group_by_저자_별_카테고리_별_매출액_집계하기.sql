/**
 * [kimdayeon] week03 - 저자_별_카테고리_별_매출액_집계하기
 * 유형: group_by
 * 날짜: 2026-06-16
 * 출처: https://school.programmers.co.kr/learn/courses/30/lessons/144856
 *
 * 학습 내용:
 * GROUP BY는 SELECT보다 먼저 실행되므로, SELECT의 비집계 컬럼은 반드시 GROUP BY에 포함해야 한다.
 */

SELECT
    b.AUTHOR_ID,
    a.AUTHOR_NAME,
    b.CATEGORY,
    SUM(s.SALES * b.PRICE) AS TOTAL_SALES
FROM BOOK_SALES s
JOIN BOOK b ON s.BOOK_ID = b.BOOK_ID
JOIN AUTHOR a ON b.AUTHOR_ID = a.AUTHOR_ID
WHERE s.SALES_DATE LIKE '2022-01%'
GROUP BY a.AUTHOR_ID, a.AUTHOR_NAME, b.CATEGORY
ORDER BY a.AUTHOR_ID ASC, b.CATEGORY DESC;
