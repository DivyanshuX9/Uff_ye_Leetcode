# Write your MySQL query statement below
Select w.id from weather w
join weather q on w.recorddate= DATE_ADD(q.recordDate, INTERVAL 1 DAY)
where w.temperature>q.temperature;