---------------------------------------------------------------------------------------------------------------
--
-- DROP - remove a table and all it's data from the database
--
-- Consider referential constraints - cannot drop a parent if it has dependents
--
--      DROP TABLE table-name             - Will fail if table does not exist or if it has dependents
--
--      DROP TABLE IF EXISTS table-name   - Will run whether table exists or not; will fail if table has dependents
--
--      DROP TABLE IF EXISTS table-name  CASCADE   - Will run whether table exists or not and whether has dependents or not
--
--
--  CREATE - define a table to the database manager
--
--       CREATE TABLE table-name
--       (column-name     datßa-type    NOT NULL,
--        column-name     data-type,
--        column-name     data-type    DEFAULT   default-value,
--        column-name     data-type    UNIQUE,
--        CONSTRAINT constraint-name PRIMARY KEY (column(s)-in-table),
--        CONSTRAINT constraint-name FOREIGN KEY(for-key-column(s)) REFERENCES parent-table(pri-key-column(s)),
--        CONSTRAINT consraint-name  CHECK (where-predicate)
--       )
--
--       Note: CONTRAINT is part of the set of column definitions (i.e. inside the parens for column specification)
--
-- 
-- ALTER - changing the definition of a table
--
-- Commonly used to add/remove constraints on tables or change existing table attributes
--
--
-- Add a FOREIGN KEY - Establish Parent/Dependant relationship
--
-- FOREIGN KEY must have the same-number, same-order, compatible-data-type as entire PRIMARY KEY of parent
--             and must have a matching value in the PRIMARY KEY in the parent table
--
-- When adding FOREIGN KEY after data has been loaded into table, all FOREIGN KEY values must have a match in parent
--
--      ALTER TABLE dependent-table-name ADD FOREIGN KEY(for-key-column(s)) REFERENCES parent-table(pri-key-column(s)) 
--
-- Remove a constraint from a table
--
--      ALTER TABLE table-name DROP CONSTRAINT constraint_name
--
--
-- Add a column to an existing table
--
-- Cannot add a NOT NULL column to a table with existing data
--
--      ALTER TABLE table-name ADD COLUMN new_column_name data_type constraint
--
--
-- Rename an existing column in a table
--
--      ALTER TABLE table-name RENAME column-name TO new-column-name;
--
--
-- Rename a table
--
--      ALTER TABLE table-name RENAME TO new-table-name  - Will fail if table does not exist
--
--      ALTER TABLE IF EXISTS table-name RENAME TO new-table-name  - Successful if table exists or not
--
---------------------------------------------------------------------------------------------------------------
Begin transaction;
--drop any exisiting copies of the tables we are creating
drop table if exists artist;
drop table if exists painting;

create table artist                                  -- table names are usually singular
(artistId serial NOT NULL,                          --artistId unique ID for an artist| serial means postgres will generate a unique int value 
artistname character varying(50),                   --name of the artist | char varying alls for varible size names
                                                       

Constraint pk_artist_artist_id Primary Key (artistId)

)
;                                                   


-- Painting Table

create table painting
(paintingID serial not null,
paintingTitile character varying(100)not null,
purchasePrice decimal(12,2),
constraint pk_painting_paintingId Primary Key(paintingId)
)
;




rollback;


