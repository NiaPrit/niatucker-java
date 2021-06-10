--
-- Frank's JOIN lecture code
--

select country.name, city.name, district
from city, country
where code = countrycode