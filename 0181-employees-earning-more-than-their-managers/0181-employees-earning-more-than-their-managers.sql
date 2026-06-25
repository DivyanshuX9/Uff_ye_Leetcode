# Write your MySQL query statement below
Select e.name as Employee from Employee e
Left Join Employee ep on e.managerId=ep.id
where e.salary>ep.salary;