USE test_towns;
INSERT INTO users (username, password) VALUE ('Admin', 'admin');
INSERT INTO users (username, password) VALUE ('Hannah', 'root');
INSERT INTO users (username, password) VALUE ('Nigel', 'root');
INSERT INTO users (username, password) VALUE ('Oscar', 'root');

INSERT INTO authorities (username, authority) VALUE ('Admin', 'ADMIN');
INSERT INTO authorities (username, authority) VALUE ('Hannah', 'USER');

# delete from users;
# insert into users (email, name) value ('hannah@gmail.com', 'Hannah');
# insert into users (email, name) value ('nigel@gmail.com', 'Nigel');
#
#
# insert into trails ( trailID, trailName, trailNumber) value ( 0101,'Caerphilly Castle Trail','0101');
# insert into trails ( trailID, trailName, trailNumber) value ( 0102,'Caerphilly Pub Trail','0102');
# insert into trails ( trailID, trailName, trailNumber) value ( 0103,'Caerphilly Heritage Trail','0103');
# insert into trails ( trailID, trailName, trailNumber) value ( 0201,'Risca Heritage Trail','0201');
# insert into trails ( trailID, trailName, trailNumber) value ( 0301,'Penarth Esplanade Trail','0301');
#
#
# insert into locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID, locationApproved) value ( 'St Cenydd','','Location description here','Caerphilly',0101, true);
# insert into locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID, locationApproved) value ( 'The Castle','','Location description here','Caerphilly',0101, true);
# insert into locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID, locationApproved) value ( 'Medieval Trades','','Location description here','Caerphilly',0101, true);
# insert into locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID, locationApproved) value ( 'The Queen''s War','','Location description here','Caerphilly',0101, true);
# insert into locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID, locationApproved) value ( 'The Green Lady','','Location description here','Caerphilly',0101, true);
# insert into locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID, locationApproved) value ( 'Armoury','','Location description here','Caerphilly',0101, true);
# insert into locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID, locationApproved) value ( 'Architecture','','Location description here','Caerphilly',0101, true);
# insert into locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID, locationApproved) value ( '21st Century Landmark','','Location description here','Caerphilly',0101, true);
#
# insert into locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID, locationApproved) value ( 'JD Wetherspoons-Malcolm Uphill','','Location description here','Caerphilly',0102, true);
# insert into locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID, locationApproved) value ( 'Caerphilly Cwtch','','Location description here','Caerphilly',0102, true);
# insert into locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID, locationApproved) value ( 'Caerphilly Conservative Club','','Location description here','Caerphilly',0102, true);
# insert into locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID, locationApproved) value ( 'The King''s Arms','','Location description here','Caerphilly',0102, true);
#
# insert into locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID, locationApproved) value ( 'Caerphilly Bus Station','','Location description here','Caerphilly',0103, true);
# insert into locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID, locationApproved) value ( 'The Medieval Courthouse','','Location description here','Caerphilly',0103, true);
# insert into locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID, locationApproved) value ('Caerphilly Castle','','Location description here','Caerphilly',0103, true);
# insert into locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID, locationApproved) value ( 'Ty Vaughan House','','Location description here','Caerphilly',0103, true);
# insert into locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID, locationApproved) value ( 'Risca Colliery','','Location description here','Risca',0201, true);
# insert into locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID, locationApproved) value ( 'Black Vein Colliery Disaster','','Location description here','Risca',0201, true);
# insert into locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID, locationApproved) value ( 'The Esplanade','','Location description here','Penarth',0301, true);
# insert into locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID, locationApproved) value ( 'The Old Swimming Baths','','Location description here','Penarth',0301, true);
#
#
#
# insert into packs (name, description) value ('Wales Football Team', 'Pack of Welsh Football Players in the National Team');
# insert into packs (name, description) value ('Wales Rugby Team', 'Pack of Welsh Rugby Players in the National Team');
# insert into packs (name, description) value ('Welsh Heritage', 'Pack About Welsh Heritage');
#
#
#
# insert into stickers (packID, stickerID, name, description, rarity) value (1, 1, 'wayne_hennessey', 'Wales Football Team Player', '2');
# insert into stickers (packID, stickerID, name, description, rarity) value (1, 2, 'neco_williams', 'Wales Football Team Player', '2');
# insert into stickers (packID, stickerID, name, description, rarity) value (1, 3, 'joe_morrell', 'Wales Football Team Player', '2');
# insert into stickers (packID, stickerID, name, description, rarity) value (1, 4, 'ethan_ampadu', 'Wales Football Team Player', '2');
# insert into stickers (packID, stickerID, name, description, rarity) value (1, 5, 'connor_roberts', 'Wales Football Team Player', '2');
# insert into stickers (packID, stickerID, name, description, rarity) value (2, 1, 'Taine_Basham', 'Wales Rugby Team Player', '1');
# insert into stickers (packID, stickerID, name, description, rarity) value (2, 2, 'Adam Beard', 'Wales Rugby Team Player', '1');
# insert into stickers (packID, stickerID, name, description, rarity) value (2, 3, 'Elliot Dee', 'Wales Rugby Team Player', '1');
# insert into stickers (packID, stickerID, name, description, rarity) value (2, 4, 'Corey Domachowski', 'Wales Rugby Team Player', '1');
# insert into stickers (packID, stickerID, name, description, rarity) value (2, 5, 'Ryan Elias', 'Wales Rugby Team Player', '1');
# insert into stickers (packID, stickerID, name, description, rarity) value (3, 1, 'Welsh Lady', 'Welsh Heritage', '1');
# insert into stickers (packID, stickerID, name, description, rarity) value (3, 2, 'Welsh Outline', 'Welsh Heritage', '1');
# insert into stickers (packID, stickerID, name, description, rarity) value (3, 3, 'Welsh Spoon', 'Welsh Heritage', '1');
#
#
# insert into locationCoordinates(locationID, locationCoordsLat, locationCoordsLong) value (2, 51.57623, -3.21910 );
# insert into locationCoordinates(locationID, locationCoordsLat, locationCoordsLong) value (3, 51.575372, -3.219186);
# insert into locationCoordinates(locationID, locationCoordsLat, locationCoordsLong) value (4, 51.576363, -3.220712 );
# insert into locationCoordinates(locationID, locationCoordsLat, locationCoordsLong) value (9, 51.57239, -3.21992);
# insert into locationCoordinates(locationID, locationCoordsLat, locationCoordsLong) value (10, 51.57230, -3.21938 );
# insert into locationCoordinates(locationID, locationCoordsLat, locationCoordsLong) value (13, 51.57168, -3.21861);
# insert into locationCoordinates(locationID, locationCoordsLat, locationCoordsLong) value (14, 51.57465, -3.22022 );
# insert into locationCoordinates(locationID, locationCoordsLat, locationCoordsLong) value (17, 51.61117, -3.10198 );
# insert into locationCoordinates(locationID, locationCoordsLat, locationCoordsLong) value (18, 51.61655, -3.12371 );
# insert into locationCoordinates(locationID, locationCoordsLat, locationCoordsLong) value (19, 51.43484, -3.16492 );
# insert into locationCoordinates(locationID, locationCoordsLat, locationCoordsLong) value (20, 51.43547, -3.16789 );
#
#
# insert into townsWithTrails (townName, townCentreCoordsLat, townCentreCoordsLong, townUppermostCoordsLat, townLowermostCoordsLat, townLeftmostCoordsLong, townRightmostCoordsLong) value ('Caerphilly', '51.57903','-3.22075 ','51.60418','51.55093','-3.25222','-3.17696');
# insert into townsWithTrails (townName, townCentreCoordsLat, townCentreCoordsLong, townUppermostCoordsLat, townLowermostCoordsLat, townLeftmostCoordsLong, townRightmostCoordsLong) value ('Risca','51.61195','-3.09648','51.63039','51.59175','-3.12129','-3.06438');
# insert into townsWithTrails (townName, townCentreCoordsLat, townCentreCoordsLong, townUppermostCoordsLat, townLowermostCoordsLat, townLeftmostCoordsLong, townRightmostCoordsLong) value ('Penarth','51.43893','-3.17354','51.44878','51.41233','-3.20271','-3.16005');