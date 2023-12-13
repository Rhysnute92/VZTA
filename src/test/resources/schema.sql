/* DELETES AND RECREATES DATABASE EVERY TIME THE SYSTEM IS BOOTED*/
DROP DATABASE IF EXISTS test_towns;
CREATE DATABASE IF NOT EXISTS test_towns;
USE test_towns;
/****************************************************************/

CREATE TABLE IF NOT EXISTS users (
    username varchar(30) primary key NOT NULL,
    id bigint auto_increment unique, /*DEPRECATED COLUMN, LEFT IN WHILE SOME OTHER FUNCTIONS STILL USE IT*/
    email varchar(128),
    password varchar(30) NOT NULL,
    enabled boolean default true
);

CREATE TABLE IF NOT EXISTS authorities (
    id bigint primary key auto_increment NOT NULL,
    username varchar(30) NOT NULL ,
    authority varchar(45) NOT NULL
);