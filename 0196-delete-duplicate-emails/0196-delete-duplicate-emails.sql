# Write your MySQL query statement below
delete p from person p
join person q
on  p.email=q.email
where p.id>q.id