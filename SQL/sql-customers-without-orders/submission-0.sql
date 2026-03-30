-- Write your query below
SELECT c.name
FROM Customers c
WHERE c.id NOT IN (
    SELECT customer_id
    FROM Orders
);