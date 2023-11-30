drop table if exists trail;
create table if not exists trail(
    trailID bigint auto_increment primary key,
    name varchar(100)
) engine=InnoDB;
drop table if exists locations;
create table if not exists locations(
locationID bigint auto_increment primary key,
name varchar(100)
) engine=InnoDB;
drop table if exists users;
create table if not exists users(
    userID bigint auto_increment primary key,
    name varchar(100)
) engine=InnoDB;