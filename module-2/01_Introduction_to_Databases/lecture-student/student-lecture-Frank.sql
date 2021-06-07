--------------------------------------------------------------------------------------------------------
-- Basic SELECT Lecture Code
--------------------------------------------------------------------------------------------------------
-- -- indicates a comment - anything following on the line is ignored
--
-- SQL SELECT statement - retrieve values form the database (Read)
--
-- A SELECT statement is often referred to as a query
--
-- Basic syntax:
--
--      SELECT   - columns to include in the result (seperate mutiple column reqeusts with commas) 1st
--      FROM     - table containing rows used in the query  2nd 
--      WHERE    - rows to include in the result 3rd
--      ORDER BY - sequence of rows in the result last
--                 without an ORDER BY the sequence of the rows in the result is not predictable
--                 if the sequence of teh rows in teh result matter - code an ORDER BY
--
-- WHERE predicates: ( Condition - similar to Java if conditions with many more options)

--  NOT EQUALS is either <> OR !=
--
--        =  <>  !=  >  >=  <  <= 
--        IN(list-of-values)      -- alterative to a series of = OR
--        NOT IN(list-of-values)  -- alterative to a series of != AND
--        BETWEEN value AND value
--        IS NULL
--        IS NOT NULL
--        LIKE    (use wildcards: % means 0 to any number of any characters
--                                _ means exactly any one character)
--        ILIKE   (case insensivtive LIKE - Postgres extension)
--
-- predicates may be combined using AND and OR
--
-- use parentheses to make your multi-predicate condition clear

-- The DISTINCT clause on a SELECT removes duplicate values from the result
-- based on the all columns that follow
--
-- The DISTINCT ON(columns/expression) clause on a SELECT removes duplicate values from the result
-- based on the all columns/expression inside the parentheses that follow (Postgres extension)
------------------------------------------------------------------------------------------------------

-- Selecting the names for all countries
select name -- columns I want to see in the results
 from country-- table with the colums i want
 ; -- use a semi-colon to mark the end of an SQL statements in a file

-- Selecting the name and population of all countries
select name, population -- columns to see in the result in the order you want to see them
 from country           -- table with the columns we want
 ;
 select population, name
 from country
 ;

-- Selecting all columns from the city table
select *  -- * means from all columns in the order defined 
from city
;

-- SELECT ... FROM ... WHERE
-- Selecting the cities in Ohio
select name             -- show me the name 
from city               -- from the city table
where district = 'Ohio' -- only include the rows for district = 'ohio'
                        -- string literals are coded inside apostrophes ( not double quotes like Java)
                        -- the case of the string matters MUST match what is in the table
;

-- Selecting countries that gained independence in the year 1776
select name
from country
where indepyear = 1776; --numeric literals are just codes as numbers
;

-- Selecting countries not in Asia
select name, continent -- sometimes include columsn not asked for to verify your results
from country
where continent <> 'Asia'
;

-- Selecting countries that do not have an independence year --independence year is null
-- in relational data bases null repre a missing or unknown value
-- since its value is unknow we cannt use normal WHERE predicates to test it ( = != <> < >)
--special WHERE predicates are used to check nulls - NOT NULL or IS NULL
select name, indepyear
from country
where indepyear is null
; -- must use the special 

-- Selecting countries that do have an independence year
select name, indepyear
from country
where indepyear is not null
;

-- Selecting countries that have a population greater than 5 million
select name, population
from country
where population > 500000


-- SELECT ... FROM ... WHERE ... AND/OR
-- Selecting cities in Ohio and Population greater than 400,000

select name, population, district
from city
where population > 400000 -- a full predicate is required on each side or and AND / OR
and district = 'Ohio'  
;  -- a full predicate id column operator value





-- Selecting country names on the continent North America or South America
select name, continent
from country
where continent = 'North America'
or     continent = 'South America'
;



-- SELECTING DATA w/arithmetic
-- Selecting the population, life expectancy, and population per area



