delete from users;
insert into users (email, name, dragonProgress) value ('hannah@gmail.com', 'Hannah', '90');
insert into users (userID, email, name, dragonProgress) value ('2', 'nigel@gmail.com', 'Nigel', '40');

delete from trails;
insert into trails ( Name,tru) value ( 'Caerphilly Coffee Trail',false);
insert into trails ( Name,tru) value ( 'Penarth Dragon Trail',true);

delete from locations;
insert into locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID, locationApproved)value ( 'St Cenydd','','Location description here','Caerphilly',0101, true);
insert into locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID, locationApproved) value ( 'The Castle','','Location description here','Caerphilly',0101, true);
insert into locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID, locationApproved) value ( 'Medieval Trades','','Location description here','Caerphilly',0101, true);
insert into locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID, locationApproved) value ( 'The Queen''s War','','Location description here','Caerphilly',0101, true);
insert into locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID, locationApproved) value ( 'The Green Lady','','Location description here','Caerphilly',0101, true);
insert into locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID, locationApproved) value ( 'Armoury','','Location description here','Caerphilly',0101, true);
insert into locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID, locationApproved) value ( 'Architecture','','Location description here','Caerphilly',0101, true);
insert into locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID, locationApproved) value ( '21st Century Landmark','','Location description here','Caerphilly',0101, true);

insert into locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID, locationApproved) value ( 'JD Wetherspoons-Malcolm Uphill','','Location description here','Caerphilly',0102, true);
insert into locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID, locationApproved) value ( 'Caerphilly Cwtch','','Location description here','Caerphilly',0102, true);
insert into locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID, locationApproved) value ( 'Caerphilly Conservative Club','','Location description here','Caerphilly',0102, true);
insert into locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID, locationApproved) value ( 'The King''s Arms','','Location description here','Caerphilly',0102, true);

insert into locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID, locationApproved) value ( 'Caerphilly Bus Station','','Location description here','Caerphilly',0103, true);
insert into locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID, locationApproved) value ( 'The Medieval Courthouse','','Location description here','Caerphilly',0103, true);
insert into locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID, locationApproved) value ('Caerphilly Castle','','Location description here','Caerphilly',0103, true);
insert into locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID, locationApproved) value ( 'Ty Vaughan House','','Location description here','Caerphilly',0103, true);

insert into locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID, locationApproved) value ( 'Risca Colliery','','Location description here','Risca',0201, true);
insert into locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID, locationApproved) value ( 'Black Vein Colliery Disaster','','Location description here','Risca',0201, true);


insert into locations (locationID, locationName , locationEmail,locationDescription,locationPlace, locationTrailID, locationApproved) value (19, 'The Esplanade','','Location description here','Penarth',0301, true);
insert into locations (locationID, locationName , locationEmail,locationDescription,locationPlace, locationTrailID, locationApproved) value (20, 'The Old Swimming Baths','','Location description here','Penarth',0301, true);
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
# insert into stickerprogress (userID, stickerID, hasSticker) value ('1', '1', true);
# insert into stickerprogress (userID, stickerID, hasSticker) value ('1', '3', true);
# insert into stickerprogress (userID, stickerID, hasSticker) value ('2', '2', true);

delete from locationsCoordinates;
insert into locationsCoordinates(locationID, locationCoordsLong, locationCoordsLat) value (2,51.57623,-3.21910 );
insert into locationsCoordinates(locationID, locationCoordsLong, locationCoordsLat) value (3,51.575372, -3.219186 );
insert into locationsCoordinates(locationID, locationCoordsLong, locationCoordsLat) value (4,51.576363, -3.220712 );
