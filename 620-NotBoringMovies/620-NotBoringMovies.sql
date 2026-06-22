-- Last updated: 6/22/2026, 9:33:53 AM
# Write your MySQL query statement below
SELECT *
FROM Cinema
WHERE id % 2 <> 0 AND description <> 'boring'
ORDER BY rating DESC;