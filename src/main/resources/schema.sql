drop table if exists trails;
create table if not exists trails(
    trailID bigint auto_increment primary key,
    name varchar(100)
) engine=InnoDB;

drop table if exists users;
create table if not exists users(
    userID bigint auto_increment primary key,
    name varchar(100)
) engine=InnoDB;