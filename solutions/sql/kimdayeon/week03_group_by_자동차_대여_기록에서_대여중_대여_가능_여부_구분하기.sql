/**
 * [kimdayeon] week03 - 자동차_대여_기록에서_대여중_대여_가능_여부_구분하기
 * 유형: group_by
 * 날짜: 2026-06-15
 * 출처: https://school.programmers.co.kr/learn/courses/30/lessons/157340
 *
 * 학습 내용:
 * GROUP BY로 바로 묶어버리면 대여 상태를 판단하기 어려워서 MAX 함수나 조건부 집계를 이용해야함
 */

SELECT

    CAR_ID,

    CASE

        WHEN EXISTS (

            SELECT 1

            FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY H2

            WHERE H2.CAR_ID = H1.CAR_ID

              AND '2022-10-16' BETWEEN H2.START_DATE AND H2.END_DATE

        ) THEN '대여중'

        ELSE '대여 가능'

    END AS AVAILABILITY

FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY H1

GROUP BY CAR_ID

ORDER BY CAR_ID DESC;
