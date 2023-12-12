drop table if exists trails;
create table if not exists trails
(
    trailID bigint auto_increment primary key,
    name varchar(128)
)   engine=InnoDB;

drop table if exists towns;


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

drop table if exists userss;
create table if not exists userss
(
    userID bigint auto_increment primary key,
    email varchar(128),
    named varchar(128),
    dragonProgress int
) engine=InnoDB;

drop table if exists badges;
create table if not exists badges
(
    badgeID bigint auto_increment primary key,
    name varchar(128),
    description varchar(128),
    difficulty bigint
) engine=InnoDB;

drop table if exists stickers;
create table if not exists stickers
(
    stickerID bigint auto_increment primary key,
    name varchar(128),
    description varchar(128),
    rarity bigint
) engine=InnoDB;

drop table if exists badgeProgress;
create table if not exists badgeProgress
(
    userID bigint,
    badgeID bigint,
    progress int /*0-100*/
) engine=InnoDB;

create table if not exists stickerProgress
(
    userID int,
    stickerID int,
    hasSticker boolean /*Has sticker or not*/
) engine=InnoDB;

create table if not exists towns
(
    townID bigint auto_increment primary key,
    townName varchar(255) ,
    townTrailNumber tinyint

) engine=InnoDB;
