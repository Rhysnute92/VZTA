/* DELETES AND RECREATES DATABASE EVERY TIME THE SYSTEM IS BOOTED*/
DROP DATABASE IF EXISTS towns;
CREATE DATABASE IF NOT EXISTS towns;
USE towns;
/****************************************************************/

/* DROPS ALL TABLES IF THEY EXIST (they wont but just in case) */
DROP TABLE IF EXISTS trails;
DROP TABLE IF EXISTS locations;
DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS stickers;
DROP TABLE IF EXISTS packs;
DROP TABLE IF EXISTS stickerProgress;
/****************************************************************/

/* CREATES ALL TABLES */

CREATE TABLE IF NOT EXISTS trails (
    trailID bigint auto_increment primary key,
    name varchar(128),
    tru boolean
)   engine=InnoDB;

drop table if exists locationCoordinates;
drop table if exists locations;
create table if not exists locations
(
    locationID bigint auto_increment primary key,
    locationName varchar(128),
    locationEmail varchar(128),
    locationDescription longtext,
    locationPlace varchar(255),
    locationTrailID varchar(128),
    locationApproved boolean
)   engine=InnoDB;


CREATE TABLE IF NOT EXISTS users (
    id bigint auto_increment primary key,
    email varchar(128) NOT NULL ,
    name varchar(30) NOT NULL,
    password varchar(30) NOT NULL,
    dragonProgress int,
    dragonsLandmarkIDs longtext
);

CREATE TABLE IF NOT EXISTS packs (
    id bigint auto_increment primary key,
    name varchar(20) NOT NULL,
    description text
);

CREATE TABLE IF NOT EXISTS stickers (
    id bigint auto_increment primary key,
    packID bigint NOT NULL,
    FOREIGN KEY (packID) REFERENCES packs(id)
        ON DELETE CASCADE
        ON UPDATE RESTRICT,
    stickerID bigint NOT NULL, /*STICKER ID NUMBER WITHIN ITS OWN PACK*/
    name varchar(30) NOT NULL,
    description text NOT NULL,
    rarity tinyint
);

CREATE TABLE IF NOT EXISTS stickerProgress (
    id bigint auto_increment primary key,
    userID bigint NOT NULL,
    FOREIGN KEY (userID) REFERENCES users(id)
        ON DELETE CASCADE
        ON UPDATE RESTRICT,
    packID bigint NOT NULL,
    FOREIGN KEY (packID) REFERENCES packs(id)
        ON DELETE CASCADE
        ON UPDATE RESTRICT,
    stickerID bigint NOT NULL,
        FOREIGN KEY (stickerID) REFERENCES stickers(id)
        ON DELETE CASCADE
        ON UPDATE RESTRICT
);

create table if not exists locationCoordinates
(
    locationCoordID bigint auto_increment primary key,
    locationID bigint,
    Foreign Key (locationID) REFERENCES locations(locationID)
        ON DELETE CASCADE
        ON UPDATE RESTRICT,
    locationCoordsLat DECIMAL(8,6),
    locationCoordsLong DECIMAL(8,6)


)engine=InnoDB;


drop table if exists townsWithTrails;
create table if not exists townsWithTrails
(
    townID bigint auto_increment primary key,
    townName varchar(128),
    townCentreCoordsLat varchar(128),
    townCentreCoordsLong varchar(128),
    townUppermostCoordsLat varchar(128),
    townLowermostCoordsLat varchar(128),
    townLeftmostCoordsLong varchar(128),
    townRightmostCoordsLong varchar(128)

)engine=InnoDB;

