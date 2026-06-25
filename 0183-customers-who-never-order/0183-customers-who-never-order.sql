# Write your MySQL query statement below
Select c.name as Customers from Customers c
Left Join Orders o on c.id=o.customerId where o.customerid is NULL;