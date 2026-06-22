-- Last updated: 6/22/2026, 9:33:59 AM
# Write your MySQL query statement below
select e.name from Employee e JOIN employee c on e.id=c.managerId GROUP BY e.id,e.name having count(*)>4; 