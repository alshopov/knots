SELECT *
  FROM users AS u
 WHERE u.id = 42;

SELECT *
  FROM users AS u
  JOIN accounts AS a
    ON u.id = a.user_id
 WHERE u.id = 42;

SELECT *
  FROM users AS u
  JOIN accounts AS a
    ON u.id = a.user_id
  JOIN banks AS b
    ON b.id = a.bank_id
 WHERE u.id = 42
   AND b.id = 666;


SELECT *
  FROM users AS u
  JOIN countries AS c
    on u.country_id = c.id
  JOIN currency AS cu
    on c.currency_id = cu.id
 WHERE u.id = 42;
