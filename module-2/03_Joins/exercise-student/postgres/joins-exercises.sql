-- The following queries utilize the "dvdstore" database.

-- 1. All of the films that Nick Stallone has appeared in   -- we wants all the films that include Nick Stallone. I need data from the actor table ( Nick Stallone) and the film table (title of movies)
-- (30 rows)
select first_name, last_name, title
from film
inner join film_actor
on film_actor.film_id = film.film_id
inner join
actor
on film_actor.actor_id = actor.actor_id
where first_name = 'NICK'
and last_name = 'STALLONE'
;




-- 2. All of the films that Rita Reynolds has appeared in
-- (20 rows)
select first_name, last_name, title -- the columns we want to see in the result 
from film
inner join film_actor
on film_actor.film_id = film.film_id
inner join
actor
on film_actor.actor_id = actor.actor_id
where first_name = 'RITA'
and last_name = 'REYNOLDS'
;


-- 3. All of the films that Judy Dean or River Dean have appeared in
-- (46 rows)
-- we need the films and actors
--tables would be film and actors but they are not connected. film_actor connects the two
select first_name, last_name, title
from actor
inner join film_actor
on film_actor.actor_id = actor.actor_id
inner join film
on film_actor.film_id = film.film_id
where first_name = 'JUDY'
or first_name = 'RIVER'
and last_name ilike '%DEAN%'
;


-- 4. All of the the Documentary films
-- (68 rows)
-- we are going to need the films and the category
-- category and film do not connect. film_category does conenct the two
select title
from film
inner join film_category
on film_category.film_id = film.film_id
inner join category
on film_category.category_id = category.category_id
where name = 'Documentary' 
;


-- 5. All of the Comedy films
-- (58 rows)
-- we are looking for the titles of all the films in the comedy category
--category and film are the tables we need to pull data from
--category and film do not connect but film_category does
select title 
from film
inner join film_category
on film_category.film_id = film.film_id
inner join category
on film_category.category_id = category.category_id
where name = 'Comedy'
;


-- 6. All of the Children films that are rated G
-- (10 rows)
--we are looking for the titles of all the films in the childrens category that are also rated G
--cateogry and film have the data we need but are not connected film_category is
select title
from film
inner join film_category
on film_category.film_id = film.film_id
inner join category
on film_category.category_id = category.category_id
where name = 'Children'
and rating = 'G'
;


-- 7. All of the Family films that are rated G and are less than 2 hours in length
-- (3 rows)
--we want to see titles of all family movies , rated G AND are < 2hrs in lentgh
select title, length 
from film
inner join film_category
on film_category.film_id = film.film_id
inner join category
on film_category.category_id = category.category_id
where name = 'Family'
and length < 120
and rating = 'G'
;


-- 8. All of the films featuring actor Matthew Leigh that are rated G
-- (9 rows)
-- we want to see all the film titles that have the actors first and last name and also rated G
--actor and film have the data we need but they are not connected but film_actor connect them both

select first_name, last_name, title
from film
inner join film_actor
on  film_actor.film_id = film.film_id
inner join actor
on film_actor.actor_id = actor.actor_id
where first_name = 'MATTHEW'
and last_name = 'LEIGH'
and rating = 'G'
;

-- 9. All of the Sci-Fi films released in 2006
-- (61 rows)
-- we want to know the title of all the sci fi movies that was relased in 2006
-- the film and category table is going to have the data we need but they are not connected the film category table is connected
Select title
from film
inner join film_category
on film_category.film_id = film.film_id
inner join category
on film_category.category_id = category.category_id
where name = 'Sci-Fi'
and release_year = '2006'
;


 --10. All of the Action films starring Nick Stallone
 --(2 rows)
 --we want to see the titles of the films starring Nick Stallone that are in the action category
--film , actor and category are the 3 tables that have our data they are not connected by film_category and film_actor do

select title, first_name, last_name
from actor
inner join film_actor
on actor.actor_id = film_actor.actor_id 
inner join film 
on film.film_id = film_actor.film_id
inner join film_category
on film.film_id = film_category.film_id
inner join category
on category.category_id = film_category.category_id
where name = 'Action'
and first_name = 'NICK'
and last_name = 'STALLONE'
;


-- 11. The address of all stores, including street address, city, district, and country
-- (2 rows)

-- 12. A list of all stores by ID, the storeâ€™s street address, and the name of the storeâ€™s manager
-- (2 rows)

-- 13. The first and last name of the top ten customers ranked by number of rentals
-- (#1 should be â€œELEANOR HUNTâ€? with 46 rentals, #10 should have 39 rentals)

-- 14. The first and last name of the top ten customers ranked by dollars spent
-- (#1 should be â€œKARL SEALâ€? with 221.55 spent, #10 should be â€œANA BRADLEYâ€? with 174.66 spent)

-- 15. The store ID, street address, total number of rentals, total amount of sales (i.e. payments), and average sale of each store.
-- (NOTE: Keep in mind that while a customer has only one primary store, they may rent from either store.)
-- (Store 1 has 7928 total rentals and Store 2 has 8121 total rentals)

-- 16. The top ten film titles by number of rentals
-- (#1 should be â€œBUCKET BROTHERHOODâ€? with 34 rentals and #10 should have 31 rentals)

-- 17. The top five film categories by number of rentals
-- (#1 should be â€œSportsâ€? with 1179 rentals and #5 should be â€œFamilyâ€? with 1096 rentals)

-- 18. The top five Action film titles by number of rentals
-- (#1 should have 30 rentals and #5 should have 28 rentals)

-- 19. The top 10 actors ranked by number of rentals of films starring that actor
-- (#1 should be â€œGINA DEGENERESâ€? with 753 rentals and #10 should be â€œSEAN GUINESSâ€? with 599 rentals)

-- 20. The top 5 â€œComedyâ€? actors ranked by number of rentals of films in the â€œComedyâ€? category starring that actor
-- (#1 should have 87 rentals and #5 should have 72 rentals)
