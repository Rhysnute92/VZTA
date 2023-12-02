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
    name varchar(128)
)   engine=InnoDB;
drop table if exists users;
create table if not exists users
(
    userID bigint auto_increment primary key,
    email varchar(128),
    name varchar(128)
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