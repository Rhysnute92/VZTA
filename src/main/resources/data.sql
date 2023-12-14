delete from users;
insert into users (email, name, dragonProgress) value ('hannah@gmail.com', 'Hannah', '90');
insert into users (userID, email, name, dragonProgress) value ('2', 'nigel@gmail.com', 'Nigel', '40');

delete from trails;
insert into trails ( Name) value ( 'Caerphilly Coffee Trail');
insert into trails ( Name) value ( 'Penarth Dragon Trail');

delete from locations;
insert into locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID) value ( 'St Cenydd','','Location description here','Caerphilly',0101);
insert into locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID) value ( 'The Castle','','Location description here','Caerphilly',0101);
insert into locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID) value ( 'Medieval Trades','','Location description here','Caerphilly',0101);
insert into locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID) value ( 'The Queen''s War','','Location description here','Caerphilly',0101);
insert into locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID) value ( 'The Green Lady','','Location description here','Caerphilly',0101);
insert into locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID) value ( 'Armoury','','Location description here','Caerphilly',0101);
insert into locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID) value ( 'Architecture','','Location description here','Caerphilly',0101);
insert into locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID) value ( '21st Century Landmark','','Location description here','Caerphilly',0101);

insert into locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID) value ( 'JD Wetherspoons-Malcolm Uphill','','Location description here','Caerphilly',0102);
insert into locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID) value ( 'Caerphilly Cwtch','','Location description here','Caerphilly',0102);
insert into locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID) value ( 'Caerphilly Conservative Club','','Location description here','Caerphilly',0102);
insert into locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID) value ( 'The King''s Arms','','Location description here','Caerphilly',0102);

insert into locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID) value ( 'Caerphilly Bus Station','','Location description here','Caerphilly',0103);
insert into locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID) value ( 'The Medieval Courthouse','','Location description here','Caerphilly',0103);
insert into locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID) value ('Caerphilly Castle','','Location description here','Caerphilly',0103);
insert into locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID) value ( 'Ty Vaughan House','','Location description here','Caerphilly',0103);

insert into locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID) value ( 'Risca Colliery','','Location description here','Risca',0201);
insert into locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID) value ( 'Black Vein Colliery Disaster','','Location description here','Risca',0201);


insert into locations (locationID, locationName , locationEmail,locationDescription,locationPlace, locationTrailID) value (19, 'The Esplanade','','Location description here','Penarth',0301);
insert into locations (locationID, locationName , locationEmail,locationDescription,locationPlace, locationTrailID) value (20, 'The Old Swimming Baths','','Location description here','Penarth',0301);
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

<<<<<<< HEAD
delete from stickerprogress;
insert into stickerprogress (userID, stickerID, hasSticker) value ('1', '1', true);
insert into stickerprogress (userID, stickerID, hasSticker) value ('1', '3', true);
insert into stickerprogress (userID, stickerID, hasSticker) value ('2', '2', true);

delete from localauthority;
insert into localauthority ( localAuthorityName, address1, address2, city, county, postcode, website) value ( 'Caerphilly County Borough Council', 'Tredomen Park','', 'Ystrad Mynach, Hengoed', '', 'CF82 7PG', 'https://www.caerphilly.gov.uk/main.aspx?lang=en-GB');
insert into localauthority ( localAuthorityName, address1, address2, city, county, postcode, website) value ( 'Risca Town Council', 'Unit B, 75 Tredegar Street', '', 'Risca', '', 'NP11 6BW', 'https://www.riscatowncouncil.org.uk/');
insert into localauthority ( localAuthorityName, address1, address2, city, county, postcode, website) value ( 'Penarth Town Council West House', 'Stanwell Road', '', 'Penarth', '', 'CF64 2YG', 'https://www.penarthtowncouncil.gov.uk/your-council/');
=======
delete from packs;
insert into packs (name, description) value ('Wales Football Team', 'Pack of Welsh Football Players in the National Team');
insert into packs (name, description) value ('Wales Rugby Team', 'Pack of Welsh Rugby Players in the National Team');
insert into packs (name, description) value ('Welsh Heritage', 'Pack About Welsh Heritage');


DELETE FROM stickers;
INSERT INTO stickers (packID, stickerID, name, description, rarity) VALUE (1, 1, 'wayne_hennessey', 'Wales Football Team Player', '2');
INSERT INTO stickers (packID, stickerID, name, description, rarity) VALUE (1, 2, 'neco_williams', 'Wales Football Team Player', '2');
INSERT INTO stickers (packID, stickerID, name, description, rarity) VALUE (1, 3, 'joe_morrell', 'Wales Football Team Player', '2');
INSERT INTO stickers (packID, stickerID, name, description, rarity) VALUE (1, 4, 'ethan_ampadu', 'Wales Football Team Player', '2');
INSERT INTO stickers (packID, stickerID, name, description, rarity) VALUE (1, 5, 'connor_roberts', 'Wales Football Team Player', '2');
INSERT INTO stickers (packID, stickerID, name, description, rarity) VALUE (2, 1, 'Taine_Basham', 'Wales Rugby Team Player', '1');
INSERT INTO stickers (packID, stickerID, name, description, rarity) VALUE (2, 2, 'Adam Beard', 'Wales Rugby Team Player', '1');
INSERT INTO stickers (packID, stickerID, name, description, rarity) VALUE (2, 3, 'Elliot Dee', 'Wales Rugby Team Player', '1');
INSERT INTO stickers (packID, stickerID, name, description, rarity) VALUE (2, 4, 'Corey Domachowski', 'Wales Rugby Team Player', '1');
INSERT INTO stickers (packID, stickerID, name, description, rarity) VALUE (2, 5, 'Ryan Elias', 'Wales Rugby Team Player', '1');
INSERT INTO stickers (packID, stickerID, name, description, rarity) VALUE (3, 1, 'Welsh Lady', 'Welsh Heritage', '1');
INSERT INTO stickers (packID, stickerID, name, description, rarity) VALUE (3, 2, 'Welsh Outline', 'Welsh Heritage', '1');
INSERT INTO stickers (packID, stickerID, name, description, rarity) VALUE (3, 3, 'Welsh Spoon', 'Welsh Heritage', '1');

# delete from stickerprogress;
# insert into stickerprogress (userID, stickerID, hasSticker) value ('1', '1', true);
# insert into stickerprogress (userID, stickerID, hasSticker) value ('1', '3', true);
# insert into stickerprogress (userID, stickerID, hasSticker) value ('2', '2', true);

delete from locationCoordinates;
insert into locationCoordinates(locationID, locationCoordsLat, locationCoordsLong) value (2, 51.57623, -3.21910 );
insert into locationCoordinates(locationID, locationCoordsLat, locationCoordsLong) value (3, 51.575372, -3.219186);
insert into locationCoordinates(locationID, locationCoordsLat, locationCoordsLong) value (4, 51.576363, -3.220712 );
insert into locationCoordinates(locationID, locationCoordsLat, locationCoordsLong) value (9, 51.57239, -3.21992);
insert into locationCoordinates(locationID, locationCoordsLat, locationCoordsLong) value (10, 51.57230, -3.21938 );
insert into locationCoordinates(locationID, locationCoordsLat, locationCoordsLong) value (13, 51.57168, -3.21861);
insert into locationCoordinates(locationID, locationCoordsLat, locationCoordsLong) value (14, 51.57465, -3.22022 );
insert into locationCoordinates(locationID, locationCoordsLat, locationCoordsLong) value (17, 51.61117, -3.10198 );
insert into locationCoordinates(locationID, locationCoordsLat, locationCoordsLong) value (18, 51.61655, -3.12371 );
insert into locationCoordinates(locationID, locationCoordsLat, locationCoordsLong) value (19, 51.43484, -3.16492 );
insert into locationCoordinates(locationID, locationCoordsLat, locationCoordsLong) value (20, 51.43547, -3.16789 );





# insert into stickerprogress (userID, packID, stickerID) value (1, 1, 1);
# insert into stickerprogress (userID, packID, stickerID) value (1, 1, 2);
# insert into stickerprogress (userID, packID, stickerID) value (1, 1, 3);
# insert into stickerprogress (userID, packID, stickerID) value (1, 1, 5);
# insert into stickerprogress (userID, packID, stickerID) value (1, 2, 1);
# insert into stickerprogress (userID, packID, stickerID) value (1, 2, 3);



#
delete from townsWithTrails;
insert into townsWithTrails (townName, townCentreCoordsLat, townCentreCoordsLong, townUppermostCoordsLat, townLowermostCoordsLat, townLeftmostCoordsLong, townRightmostCoordsLong) value ('Caerphilly', '51.57903','-3.22075 ','51.60418','51.55093','-3.25222','-3.17696');
insert into townsWithTrails (townName, townCentreCoordsLat, townCentreCoordsLong, townUppermostCoordsLat, townLowermostCoordsLat, townLeftmostCoordsLong, townRightmostCoordsLong) value ('Risca','51.61195','-3.09648','51.63039','51.59175','-3.12129','-3.06438');
insert into townsWithTrails (townName, townCentreCoordsLat, townCentreCoordsLong, townUppermostCoordsLat, townLowermostCoordsLat, townLeftmostCoordsLong, townRightmostCoordsLong) value ('Penarth','51.43893','-3.17354','51.44878','51.41233','-3.20271','-3.16005');
>>>>>>> 6464aaa8419c280b353cd943e44f8b09d831da64
