-- [kimdayeon] week02 - 3월에 태어난 여성 회원 목록 출력하기
-- 유형: sql
-- 날짜: 2026-06-06
-- 출처: https://school.programmers.co.kr/learn/courses/30/lessons/131120
--
-- 학습 내용:
-- 빠진 조건(TLNO IS NOT NULL) 체크 습관

-- 빠진 조건 없는지 확인

SELECT
    MEMBER_ID,
    MEMBER_NAME,
    GENDER,
    DATE_FORMAT(DATE_OF_BIRTH, "%Y-%m-%d") AS DATE_OF_BIRTH
FROM MEMBER_PROFILE
WHERE MONTH(DATE_OF_BIRTH) = 3
    AND GENDER = "W"
    AND TLNO IS NOT NULL
ORDER BY MEMBER_ID ASC
