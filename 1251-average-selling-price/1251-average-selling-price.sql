# Write your MySQL query statement below
select p.product_id,IFNULL(ROUND(sUM(u.units*p.price)/SUM(u.units),2),0) AS average_price
FROM Prices p
LEFT JOIN UnitsSold u
on p.product_id=u.product_id
and u.purchase_date between p.start_date and p.end_date
group by p.product_id;