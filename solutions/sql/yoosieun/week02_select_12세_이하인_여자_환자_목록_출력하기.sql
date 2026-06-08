/*
 * [yoosieun]week02 - 12세_이하인_여자_환자_목록_출력하기.sql
 * 날짜: 2026-06-08
 * 출처: https://school.programmers.co.kr/learn/courses/30/lessons/132201
 */

SELECT 
    PT_NAME,
    PT_NO,
    GEND_CD,
    AGE,
    NVL(TLNO, 'NONE') AS TLNO
FROM PATIENT
WHERE 
    AGE <= 12
    AND GEND_CD = 'W'
ORDER BY AGE DESC, PT_NAME ASC;
