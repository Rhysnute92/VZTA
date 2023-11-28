drop table if exists trails;
create table if not exists trails(
    trailID bigint auto_increment primary key
) engine=InnoDB;
drop table if exists location;
create table if not exists location(
    locationID bigint auto_increment primary key
) engine=InnoDB;
drop table if exists users;
create table if not exists users(
    userID bigint auto_increment primary key
) engine=InnoDB;