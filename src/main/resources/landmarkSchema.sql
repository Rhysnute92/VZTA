drop table if exists landmarks;
create table if not exists landmarks(
landmarksId bigint auto_increment primary key,
name varchar(100)
) engine=InnoDB;