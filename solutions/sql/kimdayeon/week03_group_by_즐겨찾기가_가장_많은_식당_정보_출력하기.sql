/**
 * [kimdayeon] week03 - 즐겨찾기가_가장_많은_식당_정보_출력하기
 * 유형: group_by
 * 날짜: 2026-06-18
 * 출처: https://school.programmers.co.kr/learn/courses/30/lessons/131123
 *
 * 학습 내용:
 * 어제 배운 RANK()로 2가지 방법으로 풀어봄
 */
SELECT
    FOOD_TYPE,
    REST_ID,
    REST_NAME,
    FAVORITES
FROM REST_INFO
WHERE (FOOD_TYPE, FAVORITES) IN (
    SELECT
        FOOD_TYPE, MAX(FAVORITES)
    FROM REST_INFO
    GROUP BY FOOD_TYPE)
ORDER BY FOOD_TYPE DESC;

-- RANK() 윈도우 함수 방식
-- SELECT
--     FOOD_TYPE,
--     REST_ID,
--     REST_NAME,
--     FAVORITES
-- FROM (SELECT
--         FOOD_TYPE,
--         REST_ID,
--         REST_NAME,
--         FAVORITES,
--         RANK() OVER (PARTITION BY FOOD_TYPE ORDER BY FAVORITES DESC) AS RNK
--     FROM REST_INFO) inline_view
-- WHERE RNK = 1
-- ORDER BY FOOD_TYPE DESC;
