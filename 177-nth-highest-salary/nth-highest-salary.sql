CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
set N=N-1;
  RETURN (
     select distinct salary from Employee group by salary  ORDER BY salary DESC limit 1 offset N

  );
END