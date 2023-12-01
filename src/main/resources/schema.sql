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
    locationDescription varchar(255),
    locationPlace varchar(255),
    locationTrailID varchar(128)
)   engine=InnoDB;
drop table if exists users;
create table if not exists users
(
    userID bigint auto_increment primary key,
    name varchar(128)
) engine=InnoDB;