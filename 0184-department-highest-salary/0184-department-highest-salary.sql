# Write your MySQL query statement below

select b.name as Department,a.name as Employee, a.salary as salary from employee a  join department b on a.departmentId = b.id where (a.departmentID, salary) in (select departmentId, max(salary) from employee group by departmentId)

