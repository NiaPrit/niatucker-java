--
-- Subquery Example -----------------------------------------------------------------------------------------------
--
-- Show the names of the countries that speak English
--

select name
from country
where code In(select countrycode from countrylanguage where language = 'English')
;







--
-- Show any actors we have in the actor table who are not in any films
-- in the film table (ie. no entry in the film_actor table)

--
-- 1. Add some test data to the actor table we know do not
--    have matches in the film_actor table;

Begin transaction;

insert into actor (first_name, last_name) values('Agnes', 'Alexander');
insert into actor (first_name, last_name) values('Amber', 'Anthony');
insert into actor (first_name, last_name) values('Dana', 'Brian');
insert into actor (first_name, last_name) values('Aidan', 'Patrick');
insert into actor (first_name, last_name) values('Jared', 'Daniel');
insert into actor (first_name, last_name) values('Jess', 'Jared');
insert into actor (first_name, last_name) values('Josh', 'Lindsay');
insert into actor (first_name, last_name) values('Nia', 'Vanese');
insert into actor (first_name, last_name) values('Ruben', 'Java');
insert into actor (first_name, last_name) values('John', 'Frank');
insert into actor (first_name, last_name) values('Joiny', 'McJoinJoin');


--
--  2a. Problem solved with sub-query
--
select actor_id
from actor
where actor_id not in(select actor_id
                        from film_actor)
;


--
-- 2b. Problem solved with left-join actor table to file_actor table
--
select actor_id, first_name, last_name
from actor
left join film_actor
on actor.actor_id = film_actor.actor_id
where film_actor.actor_id is null



--
-- 3. Reset table to original state before test data inserted
--
rollback;