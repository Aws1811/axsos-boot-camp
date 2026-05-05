-- 1

-- select amount
-- from billing
-- where charged_datetime >='2012-03-01' and charged_datetime <'2012-04-01';

-- 2

-- select sum(amount) as revenue
-- from billing
-- where clients_id = 2;

-- 3

-- select domain_name
-- from sites 
-- where clients_id = 10;

-- 4

--  Client ID 1
-- SELECT 
-- YEAR(created_datetime) AS year, MONTH(created_datetime) AS month,
--  COUNT(id) AS total_sites
-- FROM sites
-- WHERE clients_id = 1
-- GROUP BY YEAR(created_datetime), MONTH(created_datetime);

--  Client ID 20
-- SELECT 
-- YEAR(created_datetime) AS year,MONTH(created_datetime) AS month,
--  COUNT(id) AS total_sites
-- FROM sites
-- WHERE clients_id = 20
-- GROUP BY YEAR(created_datetime), MONTH(created_datetime);

-- 5

-- select leads.id , count(*) as leads_generated
-- from leads
-- join sites 
-- on sites.id = leads.sites_id
-- where created_datetime >= '2011-01-01' and created_datetime < '2011-2-16'
-- group by id;

-- 6

select concat(clients.first_name , '' ,clients.last_name) as client_name ,count(*) as total
from clients
join sites
on clients.id = sites.clients_id
join leads
on sites.id = leads.sites_id
where leads.registered_datetime >= '2011-01-01'
and leads.registered_datetime < '2012-01-01'
group by clients.id;

