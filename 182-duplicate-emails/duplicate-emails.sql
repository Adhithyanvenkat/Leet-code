# Write your MySQL query statement below
select distinct a.email from Person a join person b on a.email=b.email where a.id != b.id;