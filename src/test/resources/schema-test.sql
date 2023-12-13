



DROP DATABASE IF EXISTS test_towns;
CREATE DATABASE IF NOT EXISTS test_towns;
USE test_towns;
/****************************************************************/

/* DROPS ALL TABLES IF THEY EXIST (they wont but just in case) */

drop table if exists locationCoordinates;
drop table if exists locations;
drop table if exists trails;
DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS stickers;
DROP TABLE IF EXISTS packs;
DROP TABLE IF EXISTS stickerProgress;



/****************************************************************/

/* CREATES ALL TABLES */

create table if not exists trails
(
    trailID varchar(128) primary key,
    trailName varchar(128),
    trailNumber varchar(128)
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
                                               username varchar(30) NOT NULL,
                                               FOREIGN KEY (username) REFERENCES users(username)
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

