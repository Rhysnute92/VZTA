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
create table if not exists users
(
    userID bigint auto_increment primary key,
    email varchar(128),
    name varchar(128),
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
    userID bigint,
    stickerID bigint,
    hasSticker boolean /*Has sticker or not*/
) engine=InnoDB;

drop table if exists localAuthority;
create table if not exists localAuthority
(
    localAuthorityID bigint auto_increment primary key,
    localAuthorityName varchar(250),
    address1 varchar(250),
    address2 varchar(250),
    city varchar(100),
    county varchar(75),
    postcode varchar(15),
    website varchar(250)
) engine=InnoDB;
=======
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

