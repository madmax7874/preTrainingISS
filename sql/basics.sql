SELECT * FROM actor;

SELECT * FROM film;

SELECT * from employee ORDER BY last_update DESC;

SELECT * from employee ORDER BY release_year, length;

SELECT * from actor LIMIT 5;

SELECT first_name, actor.last_name FROM actor;

SELECT first_name AS forename, actor.last_name AS surname FROM actor;

SELECT DISTINCT release_year FROM film;

SELECT * FROM film WHERE release_year = 2006;

SELECT emp_id, first_name, last_name FROM employee WHERE release_year >= 2000;

SELECT * FROM employee WHERE release_year = 2006 AND length >= 80;

SELECT * FROM employee WHERE (release_year = 2006 AND length >= 80) OR rating = 'G';

SELECT * FROM employee WHERE release_year BETWEEN 2000 AND 2010;
