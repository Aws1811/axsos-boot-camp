# Database Assignment

Simple MySQL database with connected tables using foreign keys.

## Tables
- **users** – user info
- **books** – book info
- **authors** – author info
- **favorite-books** – user's favorite books

## Relationships
- users → favorite-books `1:N`
- books → favorite-books `1:N`
- authors → books `1:N`

## Tools
MySQL · MySQL Workbench