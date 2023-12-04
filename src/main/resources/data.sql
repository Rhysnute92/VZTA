delete from users;
insert into users (email, name, dragonProgress) value ('hannah@gmail.com', 'Hannah', '90');
insert into users (userID, email, name, dragonProgress) value ('2', 'nigel@gmail.com', 'Nigel', '40');

delete from trails;
insert into trails (trailID, Name) value ('1', 'Caerphilly Coffee Trail');
insert into trails (trailID, Name) value ('2', 'Penarth Dragon Trail');

delete from locations;
insert into locations (locationID, locationName , locationEmail,locationDescription,locationPlace, locationTrailID) value (1, 'St Cenydd','','Location description here','Caerphilly',0101);
insert into locations (locationID, locationName , locationEmail,locationDescription,locationPlace, locationTrailID) value (2, 'The Castle','','Location description here','Caerphilly',0101);
insert into locations (locationID, locationName , locationEmail,locationDescription,locationPlace, locationTrailID) value (3, 'Medieval Trades','','Location description here','Caerphilly',0101);
insert into locations (locationID, locationName , locationEmail,locationDescription,locationPlace, locationTrailID) value (4, 'The Queen''s War','','Location description here','Caerphilly',0101);
insert into locations (locationID, locationName , locationEmail,locationDescription,locationPlace, locationTrailID) value (5, 'The Green Lady','','Location description here','Caerphilly',0101);
insert into locations (locationID, locationName , locationEmail,locationDescription,locationPlace, locationTrailID) value (6, 'Armoury','','Location description here','Caerphilly',0101);
insert into locations (locationID, locationName , locationEmail,locationDescription,locationPlace, locationTrailID) value (7, 'Architecture','','Location description here','Caerphilly',0101);
insert into locations (locationID, locationName , locationEmail,locationDescription,locationPlace, locationTrailID) value (8, '21st Century Landmark','','Location description here','Caerphilly',0101);

insert into locations (locationID, locationName , locationEmail,locationDescription,locationPlace, locationTrailID) value (9, 'JD Wetherspoons-Malcolm Uphill','','Location description here','Caerphilly',0102);
insert into locations (locationID, locationName , locationEmail,locationDescription,locationPlace, locationTrailID) value (10, 'Caerphilly Cwtch','','Location description here','Caerphilly',0102);
insert into locations (locationID, locationName , locationEmail,locationDescription,locationPlace, locationTrailID) value (11, 'Caerphilly Conservative Club','','Location description here','Caerphilly',0102);
insert into locations (locationID, locationName , locationEmail,locationDescription,locationPlace, locationTrailID) value (12, 'The King''s Arms','','Location description here','Caerphilly',0102);

insert into locations (locationID, locationName , locationEmail,locationDescription,locationPlace, locationTrailID) value (13, 'Caerphilly Bus Station','','Location description here','Caerphilly',0103);
insert into locations (locationID, locationName , locationEmail,locationDescription,locationPlace, locationTrailID) value (14, 'The Medieval Courthouse','','Location description here','Caerphilly',0103);
insert into locations (locationID, locationName , locationEmail,locationDescription,locationPlace, locationTrailID) value (15 ,'Caerphilly Castle','','Location description here','Caerphilly',0103);
insert into locations (locationID, locationName , locationEmail,locationDescription,locationPlace, locationTrailID) value (16, 'Ty Vaughan House','','Location description here','Caerphilly',0103);

insert into locations (locationID, locationName , locationEmail,locationDescription,locationPlace, locationTrailID) value (17, 'Risca Colliery','','Location description here','Risca',0201);
insert into locations (locationID, locationName , locationEmail,locationDescription,locationPlace, locationTrailID) value (18, 'Black Vein Colliery Disaster','','Location description here','Risca',0201);


insert into locations (locationID, locationName , locationEmail,locationDescription,locationPlace, locationTrailID) value (19, 'The Esplanade','','Location description here','Penarth',0301);
insert into locations (locationID, locationName , locationEmail,locationDescription,locationPlace, locationTrailID) value (20, 'The Old Swimming Baths','','Location description here','Penarth',0301);

insert into locations (locationID, Name) value ('1', 'Caerphilly');
insert into locations (locationID, Name) value ('2', 'Penarth');

delete from badges;
insert into badges (name, description, difficulty) value ('TownConnoisseur', 'You know the town very well!', '2');
insert into badges (name, description, difficulty) value ('TownRegular', 'You visited the town 3 days in a row!', '1');
insert into badges (name, description, difficulty) value ('TownMaster', 'You visited the town 7 days in a row!', '1');
insert into badges (name, description, difficulty) value ('TownRegular', 'You visited the town 3 days in a row!', '1');
insert into badges (name, description, difficulty) value ('TownRegular', 'You visited the town 3 days in a row!', '1');

delete from stickers;
insert into stickers (name, description, rarity) value ('TownConnoisseur', 'You know the town very well!', '2');
insert into stickers (name, description, rarity) value ('TownRegular', 'You visited the town 3 days in a row!', '1');
insert into stickers (name, description, rarity) value ('TownMaster', 'You visited the town 7 days in a row!', '1');
insert into stickers (name, description, rarity) value ('TownRegular', 'You visited the town 3 days in a row!', '1');
insert into stickers (name, description, rarity) value ('TownRegular', 'You visited the town 3 days in a row!', '1');

delete from badgeprogress;
insert into badgeprogress (userID, badgeID, progress) value ('1', '1', '40');
insert into badgeprogress (userID, badgeID, progress) value ('1', '2', '70');
insert into badgeprogress (userID, badgeID, progress) value ('2', '2', '70');

delete from stickerprogress;
insert into stickerprogress (userID, stickerID, hasSticker) value ('1', '1', true);
insert into stickerprogress (userID, stickerID, hasSticker) value ('1', '3', true);
insert into stickerprogress (userID, stickerID, hasSticker) value ('2', '2', true);