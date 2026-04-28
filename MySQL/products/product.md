# Product Categories Database Model

A relational database model for a product catalog app built with MySQL Workbench.
The model organizes products and links them to their brand, category, and character.

## Tables
- `product` — stores product details
- `brand` — the brand each product belongs to
- `category` — the category each product falls under
- `character` — the character associated with the product

## Relationships
- A brand can have many products
- A category can have many products
- A character can have many products

## Tools
MySQL 8.0 · MySQL Workbench
