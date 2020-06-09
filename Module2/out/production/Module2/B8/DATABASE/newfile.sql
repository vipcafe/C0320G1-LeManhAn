CREATE DATABASE classicmodels ;
SELECT * FROM classicmodels.customers ;
UPDATE classicmodels.customers SET phone = '123456' WHERE customerNumber = 103 ;
INSERT INTO classicmodels.customers (customerNumber, customerName, contactLastName, contactFirstName, phone, addressLine1, addressLine2, city, state, postalCode, country, salesRepEmployeeNumber, creditLimit)
    VALUE ('500', 'White Clover Markets', 'Karl', 'Jablonski', '98128', '305 - 14th Ave. S. Suite 3B', NULL, 'Seattle', 'cani', '98128', 'USA', '1002', '10');
SELECT customerNumber FROM classicmodels.customers ;
SELECT COUNT(phone) FROM customers  WHERE phone LIKE  '8%' ;


