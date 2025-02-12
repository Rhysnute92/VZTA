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
# drop table if exists locationCoordinates;
# drop table if exists locations;
# drop table if exists trails;
#
# create table if not exists trails
# (
#     trailID varchar(128) primary key,
#     trailName varchar(128),
#     trailNumber varchar(128)
# )   engine=InnoDB;
#
#
# create table if not exists locations
# (
#     locationID bigint auto_increment primary key,
#     locationName varchar(128),
#     locationEmail varchar(128),
#     locationDescription longtext,
#     locationPlace varchar(255),
#     locationTrailID varchar(128),
#     Foreign Key (locationTrailID) REFERENCES trails(trailID)
#         ON DELETE CASCADE
#         ON UPDATE RESTRICT,
#     locationApproved boolean
# )   engine=InnoDB;
#
#
# drop table if exists users;
# drop table if exists stickers;
# drop table if exists packs;
# drop table if exists stickerProgress;
#
# create table if not exists users
# (
#     id bigint auto_increment primary key,
#     email varchar(128),
#     name varchar(30),
#     dragonProgress int,
#     dragonsLandmarkIDs longtext
# ) engine=InnoDB;
#
#
# create table if not exists packs
# (
#     id bigint auto_increment primary key,
#     name varchar(20),
#     description text
# ) engine=InnoDB;
#
# create table if not exists stickers
# (
#     id bigint auto_increment primary key,
#     packID bigint,
#     FOREIGN KEY (packID) REFERENCES packs(id)
#         ON DELETE CASCADE
#         ON UPDATE RESTRICT,
#     stickerID bigint, /*STICKER ID NUMBER WITHIN ITS OWN PACK*/
#     name varchar(30),
#     description text,
#     rarity tinyint
#
# ) engine=InnoDB;
#
# create table if not exists stickerProgress
# (
#     id bigint auto_increment primary key,
#     userID bigint,
#     stickerID bigint
# ) engine=InnoDB;
#
#
#
#
#
# create table if not exists locationCoordinates
# (
#     locationCoordID bigint auto_increment primary key,
#     locationID bigint,
#     Foreign Key (locationID) REFERENCES locations(locationID)
#         ON DELETE CASCADE
#         ON UPDATE RESTRICT,
#     locationCoordsLat DECIMAL(8,6),
#     locationCoordsLong DECIMAL(8,6)
#
#
# )engine=InnoDB;
#
#
# drop table if exists townsWithTrails;
# create table if not exists townsWithTrails
# (
#     townID bigint auto_increment primary key,
#     townName varchar(128),
#     townCentreCoordsLat varchar(128),
#     townCentreCoordsLong varchar(128),
#     townUppermostCoordsLat varchar(128),
#     townLowermostCoordsLat varchar(128),
#     townLeftmostCoordsLong varchar(128),
#     townRightmostCoordsLong varchar(128)
#
# )engine=InnoDB;
#
#
