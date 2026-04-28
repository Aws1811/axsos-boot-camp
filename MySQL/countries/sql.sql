Q1

-- SELECT name, language, percentage
-- FROM countries
-- JOIN languages ON countries.id = languages.country_id
-- WHERE language = "Slovene"
-- ORDER BY percentage DESC;

Q2

-- select countries.name , COUNT(cities.id) AS cities
-- from countries 
-- join cities
-- on countries.id = cities.country_id
-- group by countries.id
-- order by cities desc;

Q3

-- select cities.name ,cities.population , country_id
-- from cities
-- join countries 
-- on cities.country_id = countries.id
-- where cities.population > 500000 and countries.name = "Mexico"
-- order by population desc;

Q4

-- select languages.language,countries.name,languages.percentage
--  from languages
--  join countries
--  on languages.country_id=countries.id
--  where languages.percentage > 89
--  order by languages.percentage desc;

Q5

--  select countries.name , surface_area , population
--  from countries 
-- where surface_area <501 and population > 100000; 

Q6

-- select countries.name , government_form , capital , life_expectancy
-- from countries 
-- where government_form = "Constitutional Monarchy" and capital > 200 and life_expectancy >75;

Q7

-- select cities.name , cities.population , countries.name , cities.district
-- from cities 
-- join countries
-- on cities.country_id =countries.id
-- where cities.population >500000 and countries.name = "Argentina" and cities.district = "Buenos Aires";

Q8

-- select region , COUNT(countries.id) as num
-- from countries
-- group by region
-- order by num desc;

