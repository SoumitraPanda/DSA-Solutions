-- Last updated: 6/22/2026, 9:33:50 AM
# Write your MySQL query statement below

SELECT customer_id
FROM Customer
GROUP BY customer_id
HAVING COUNT(DISTINCT product_key) = (SELECT COUNT(*) FROM Product);