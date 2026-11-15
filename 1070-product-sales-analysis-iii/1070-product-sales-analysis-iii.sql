# Write your MySQL query statement below
SELECT 
    product_id, 
    year AS first_year, 
    quantity, 
    price
FROM 
    sales AS a
WHERE 
    (product_id, year) IN (
        SELECT
            product_id,
            MIN(year)
        FROM sales AS s
        GROUP BY product_id
    );