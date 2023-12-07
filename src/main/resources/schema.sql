drop table if exists trails;
create table if not exists trails
(
    trailID bigint auto_increment primary key,
    name varchar(128)
)   engine=InnoDB;

drop table if exists locations;

create table if not exists locations
(
    locationID bigint auto_increment primary key,
    locationName varchar(128),
    locationEmail varchar(128),
    locationDescription longtext,
    locationPlace varchar(255),
    locationTrailID varchar(128)
)   engine=InnoDB;


drop table if exists users;
drop table if exists stickers;
drop table if exists packs;
drop table if exists stickerProgress;

create table if not exists users
(
    id bigint auto_increment primary key,
    email varchar(128),
    name varchar(30),
    name varchar(128),
    dragonProgress int,
    dragonsLandmarkIDs longtext
) engine=InnoDB;


create table if not exists packs
(
    id bigint auto_increment primary key,
    name varchar(20),
    description text
) engine=InnoDB;

create table if not exists stickers
(
    id bigint auto_increment primary key,
    packID bigint,
    FOREIGN KEY (packID) REFERENCES packs(id)
        ON DELETE CASCADE
        ON UPDATE RESTRICT,
    stickerID bigint, /*STICKER ID NUMBER WITHIN ITS OWN PACK*/
    name varchar(30),
    description text,
    rarity tinyint

) engine=InnoDB;

create table if not exists stickerProgress
(
    id bigint auto_increment primary key,
    userID bigint,
    packID bigint,
    stickerID bigint

) engine=InnoDB;
