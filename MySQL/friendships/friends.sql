-- NINJA Query: Return all users who are friends with the first user,
-- and make sure their namesare displayed in the results.

SELECT users.first_name, users.last_name
FROM friendships
JOIN users ON friendships.friend_id = users.id
WHERE friendships.user_id = 1;

-- NINJA Query: Return the count of all friendships
SELECT COUNT(*) AS total_friendships FROM friendships;

-- NINJA Query: Find out who has the most friends and return the count of their friends.

SELECT users.first_name, users.last_name, COUNT(*) AS friend_count
FROM friendships
JOIN users ON friendships.user_id = users.id
GROUP BY friendships.user_id
ORDER BY friend_count DESC
LIMIT 1;





-- NINJA Query: Return the friends of the third user in alphabetical order 
SELECT users.first_name, users.last_name
FROM friendships
JOIN users ON friendships.friend_id = users.id
WHERE friendships.user_id = 3
ORDER BY users.first_name ASC;