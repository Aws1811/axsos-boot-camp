# Admin & User Management ERD

A database design for a user and admin management system built using MySQL Workbench.

## Tables
- **logins** - stores login credentials for both users and admins
- **users** - stores user info and level
- **admins** - stores admin info
- **profiles** - stores profile info editable by admins and users

## Relationships
- logins → users (1:many) — a user/admin can login multiple times
- admins → users (1:many) — all admins are users but not all users are admins
- users → profiles (1:1) — each user has one profile
- admins → profiles (1:many) — admins can edit all profiles

## Business Rules
- Admins can edit all users profiles
- Users can only edit their own profile
- Admin and user can login more than once
- All admins are users but not all users are admins

## Tool Used
MySQL Workbench