# Database Assignment

Simple MySQL database with connected tables using foreign keys.

## Tables
- **users** – user info
- **posts** – posts by users
- **comments** – comments on posts
- **registrations** – registration data

## Relationships
- users → posts `1:N`
- users → comments `1:N`
- posts → comments `1:N`
- users → registrations `1:1`

## Tools
MySQL · MySQL Workbench