-- Write queries to return the following:
-- The following changes are applied to the "dvdstore" database.**


-- Frank suggests making the entire exercise one transaction
-- because several exercises depend on previous exercises running
--if you try to make smaller transaction Frank says you willdrive yourself nuts
-- put a begin transaction at the start and a rollback at the end until you are sure everything works ok if you want

-- ignore # 12 until tomorrow if you cant look at the end of todays lecture code
--
-- consider running verify selects before and/or after your insert, updates and deletes
-- your changes will NOT be in the tables if you are doing rollbacks
--
--be sure you know what the data types and contents of your columns
--consider that some columns are generated by the database on insert - you dont need to specify them
--                                              and you dont want to specify them, but you may need to know what they are








-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.
BEGIN TRANSACTION;

SELECT *
from actor;

insert into actor (first_name, last_name)
values('HAMPTON','AVENUE');

insert into actor (first_name, last_name)
values('LISA','BYWAY');

-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in      title - EUCLIDEAN PI 
-- ancient Greece", to the film table. The movie was released in 2008 in English.   description - The epic story of Euclid as a pizza delivery boy in ancient Greece
-- Since its an epic, the run length is 3hrs and 18mins. There are no special       release_year 2008            
-- features, the film speaks for itself, and doesn't need any gimmicks.             length -198
SELECT *
from film;
insert into film (title, description, release_year, language_id, length)
values('EUCLIDEAN PI', 'The epic story of Euclid as a pizza delivery boy in ancient Greece', '2008', '1', '198');
        
-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly  |Hampton and Lisa both need to be added to the film actor table
-- overprotective mother, in the film, "Euclidean PI". Add them to the film. |to add them we need to use the actor_id & film_id values located in the film_actor table
SELECT *
from film_actor;

insert into film_actor
  (actor_id, film_id)
  values ('227', '1001')
    ;
   insert into film_actor
  (actor_id, film_id)
  values ('228','1001')
  ;

-- 4. Add Mathmagical to the category table. 
SELECT *
from category
;
insert into category(name)
values ('Mathmagical')
;

-- 5. Assign the Mathmagical category to the following films, "Euclidean PI",
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"
-- to add something to the film category table it must have the film_id & the category_id
-- the category id for Mathmagical is 17 so all the movies listed about much have 17 in that column

SELECT *
from film_category
;

insert into film_category( film_id, category_id)
values ('1001', '17')
;
update film_category
set category_id = '17'
where film_id = '274'
;
update film_category
set category_id = '17'
where film_id = '494'
;
update film_category
set category_id = '17'
where film_id = '714'
;
update film_category
set category_id = '17'
where film_id = '996'
;

-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films
-- accordingly.
-- (5 rows affected)
select *
from film
;
update film
set rating = 'G'
where title in ('Euclidian PI', 'EGG IGB', 'KARATE MOON', 'RANDOM GO', 'YOUNG LANGUAGE')
;





-- 7. Add a copy of "Euclidean PI" to all the stores.

-- 8. The Feds have stepped in and have impounded all copies of the pirated film,
-- "Euclidean PI". The film has been seized from all stores, and needs to be
-- deleted from the film table. Delete "Euclidean PI" from the film table.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE>

-- 9. Delete Mathmagical from the category table.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE>

-- 10. Delete all links to Mathmagical in the film_category tale.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE>

-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI".
-- (Did either deletes succeed? Why?)
-- <YOUR ANSWER HERE>

-- 12. Check database metadata to determine all constraints of the film id, and
-- describe any remaining adjustments needed before the film "Euclidean PI" can
-- be removed from the film table.


rollback;