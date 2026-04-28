# Blog Platform ERD

A database design for a blogging platform using MySQL Workbench.

## Tables
- **registrations** - stores email and password
- **users** - stores user info, linked to registration
- **blogs** - blogs owned by users
- **co-admin** - users who co-manage a blog
- **posts** - posts inside a blog
- **comments** - comments on posts

## Relationships
- users → registrations (1:1)
- users → blogs (1:many)
- users → posts (1:many)
- users → comment (1:many)
- users → co-admin (1:many)
- blogs → co-admin (1:many)

## Tool Used
MySQL Workbench