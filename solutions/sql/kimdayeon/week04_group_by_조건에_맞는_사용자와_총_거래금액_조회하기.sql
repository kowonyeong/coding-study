/**
 * [kimdayeon] week04 - 조건에_맞는_사용자와_총_거래금액_조회하기
 * 유형: group_by
 * 날짜: 2026-06-27
 * 출처: https://school.programmers.co.kr/learn/courses/30/lessons/164668
 *
 * 학습 내용:
 * HAVING 절 - 집계 함수 결과에 조건을 걸 때 사용 (WHERE는 그룹화 전, HAVING은 집계 후 적용)
 */

SELECT
    U.USER_ID,
    U.NICKNAME,
    SUM(B.PRICE) AS TOTAL_SALES
FROM USED_GOODS_BOARD B
JOIN USED_GOODS_USER U ON B.WRITER_ID = U.USER_ID
WHERE B.STATUS = 'DONE'
GROUP BY U.USER_ID, U.NICKNAME
HAVING TOTAL_SALES >= 700000
ORDER BY TOTAL_SALES ASC;
