# Write your MySQL query statement below
select email as Email from person
Group BY email Having count(email)>1;