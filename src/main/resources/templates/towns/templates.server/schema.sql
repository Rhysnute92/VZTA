create table if not exists users
(
    userId    bigint auto_increment primary key,
    title     varchar(10),
    firstName varchar(64),
    lastName  varchar(64),
    emailAddress varchar(128)
    ) engine =InnoDB;
