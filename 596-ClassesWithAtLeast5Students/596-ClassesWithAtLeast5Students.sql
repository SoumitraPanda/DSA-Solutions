-- Last updated: 6/22/2026, 9:33:55 AM
# Write your MySQL query statement below
select class
from Courses 
group by class
having count(student)>4