\echo Все роботы
SELECT *
FROM jaegers
ORDER BY model_name;

\echo Не уничтоженные работы
SELECT *
FROM jaegers
WHERE status = 'Active'
ORDER BY model_name;

\echo Роботы mark-1 и mark-4
SELECT *
FROM jaegers
WHERE mark IN (1, 4)
ORDER BY model_name;

\echo Все роботы, кроме mark-1 и mark-4
SELECT *
FROM jaegers
WHERE mark NOT IN (1, 4)
ORDER BY model_name;

\echo Сортировка по столбцу mark в порядке убывания
SELECT *
FROM jaegers
ORDER BY mark DESC;

\echo Самый старый робот
SELECT *
FROM jaegers
WHERE launch = (SELECT MIN(launch) FROM jaegers)
ORDER BY model_name;

\echo Роботы, которые уничтожили больше всех kaiju
SELECT *
FROM jaegers
WHERE kaiju_kill >= (SELECT MAX(kaiju_kill) FROM jaegers)
ORDER BY model_name;

\echo Средний вес роботов
SELECT ROUND(AVG(weight)::numeric, 3) AS avg_weight
FROM jaegers;

\echo Увеличение количества убитых kaiju на 1 у не уничтоженных роботов и отображение таблицы
UPDATE jaegers
SET kaiju_kill = kaiju_kill + 1
WHERE status = 'Active';

SELECT *
FROM jaegers
ORDER BY model_name;

\echo Удаление уничтоженных роботов
DELETE FROM jaegers
WHERE status = 'Destroyed';

\echo Отображение оставшихся роботов
SELECT *
FROM jaegers
ORDER BY model_name;