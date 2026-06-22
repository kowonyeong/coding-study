/*
 * [yoosieun]week02 - 강원도에_위치한_생산공장_목록_출력하기.sql
 * 날짜: 2026-06-08
 * 출처: https://school.programmers.co.kr/learn/courses/30/lessons/131112
 */

SELECT FACTORY_ID, FACTORY_NAME, ADDRESS
FROM FOOD_FACTORY
WHERE ADDRESS LIKE '강원도%'
ORDER BY FACTORY_ID ASC;
