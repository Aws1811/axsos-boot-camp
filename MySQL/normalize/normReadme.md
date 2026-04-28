# Student Dojo ERD — Normalization Assignment

A normalized database design built using MySQL Workbench.

## Tables
- **dojos** - stores dojo info
- **students** - stores student info, linked to a dojo
- **addresses** - stores student addresses

## Relationships
- dojos → students (1:many)
- students → addresses (1:many)

## Tool Used
MySQL Workbench