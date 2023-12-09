delete from users;
insert into users (email, name) value ('hannah@gmail.com', 'Hannah');
insert into users (email, name) value ('nigel@gmail.com', 'Nigel');

delete from trails;
insert into trails ( Name,tru) value ( 'Caerphilly Coffee Trail',false);
insert into trails ( Name,tru) value ( 'Penarth Dragon Trail',true);

delete from locations;
insert into locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID, locationApproved) value ( 'St Cenydd','','Location description here','Caerphilly',0101, true);
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
insert into locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID, locationApproved) value ( 'The Esplanade','','Location description here','Penarth',0301, true);
insert into locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID, locationApproved) value ( 'The Old Swimming Baths','','Location description here','Penarth',0301, true);


# delete from badges;
# insert into badges (name, description, difficulty) value ('TownConnoisseur', 'You know the town very well!', '2');
# insert into badges (name, description, difficulty) value ('TownRegular', 'You visited the town 3 days in a row!', '1');
# insert into badges (name, description, difficulty) value ('TownMaster', 'You visited the town 7 days in a row!', '1');
# insert into badges (name, description, difficulty) value ('TownRegular', 'You visited the town 3 days in a row!', '1');
# insert into badges (name, description, difficulty) value ('TownRegular', 'You visited the town 3 days in a row!', '1');



delete from packs;
insert into packs (name, description) value ('Wales Football Team', 'Pack of Welsh Football Players in the National Team');
insert into packs (name, description) value ('Wales Rugby Team', 'Pack of Welsh Rugby Players in the National Team');
insert into packs (name, description) value ('Welsh Heritage', 'Pack About Welsh Heritage');


delete from stickers;
insert into stickers (packID, stickerID, name, description, rarity) value (1, 1, 'wayne_hennessey', 'Wales Football Team Player', '2');
insert into stickers (packID, stickerID, name, description, rarity) value (1, 2, 'neco_williams', 'Wales Football Team Player', '2');
insert into stickers (packID, stickerID, name, description, rarity) value (1, 3, 'joe_morrell', 'Wales Football Team Player', '2');
insert into stickers (packID, stickerID, name, description, rarity) value (1, 4, 'ethan_ampadu', 'Wales Football Team Player', '2');
insert into stickers (packID, stickerID, name, description, rarity) value (1, 5, 'connor_roberts', 'Wales Football Team Player', '2');
insert into stickers (packID, stickerID, name, description, rarity) value (2, 1, 'Taine_Basham', 'Wales Rugby Team Player', '1');
insert into stickers (packID, stickerID, name, description, rarity) value (2, 2, 'Adam Beard', 'Wales Rugby Team Player', '1');
insert into stickers (packID, stickerID, name, description, rarity) value (2, 3, 'Elliot Dee', 'Wales Rugby Team Player', '1');
insert into stickers (packID, stickerID, name, description, rarity) value (2, 4, 'Corey Domachowski', 'Wales Rugby Team Player', '1');
insert into stickers (packID, stickerID, name, description, rarity) value (2, 5, 'Ryan Elias', 'Wales Rugby Team Player', '1');
insert into stickers (packID, stickerID, name, description, rarity) value (3, 1, 'Welsh Lady', 'Welsh Heritage', '1');
insert into stickers (packID, stickerID, name, description, rarity) value (3, 2, 'Welsh Outline', 'Welsh Heritage', '1');
insert into stickers (packID, stickerID, name, description, rarity) value (3, 3, 'Welsh Spoon', 'Welsh Heritage', '1');

# delete from stickerprogress;
# insert into stickerprogress (userID, stickerID, hasSticker) value ('1', '1', true);
# insert into stickerprogress (userID, stickerID, hasSticker) value ('1', '3', true);
# insert into stickerprogress (userID, stickerID, hasSticker) value ('2', '2', true);

delete from locationCoordinates;
insert into locationCoordinates(locationID, locationCoordsLat, locationCoordsLong) value (2,'51.57623','-3.21910' );
insert into locationCoordinates(locationID, locationCoordsLat, locationCoordsLong) value (3,'51.575372','-3.219186');
insert into locationCoordinates(locationID, locationCoordsLat, locationCoordsLong) value (4, '51.576363','-3.220712' );
#
# insert into stickerprogress (userID, packID, stickerID) value (1, 1, 1);
# insert into stickerprogress (userID, packID, stickerID) value (1, 1, 2);
# insert into stickerprogress (userID, packID, stickerID) value (1, 1, 3);
# insert into stickerprogress (userID, packID, stickerID) value (1, 1, 5);
# insert into stickerprogress (userID, packID, stickerID) value (1, 2, 1);
# insert into stickerprogress (userID, packID, stickerID) value (1, 2, 3);

delete from townsWithTrails;
#                                                                                                                                                                                                                                          LAT=X LONG=Y
insert into townsWithTrails (townName, townCentreCoordsLat, townCentreCoordsLong, townLeftmostCoordsLat, townRightmostCoordsLat, townUppermostCoordsLong, townLowermostCoordsLong) value ('Caerphilly', '51.57903','-3.22075','51.57224','51.58856','-3.24597','-3.22496');
insert into townsWithTrails (townName, townCentreCoordsLat, townCentreCoordsLong, townLeftmostCoordsLat, townRightmostCoordsLat, townUppermostCoordsLong, townLowermostCoordsLong) value ('Risca','51.61195','-3.09648','51.61483','51.60566','-3.09853','-3.09377');
insert into townsWithTrails (townName, townCentreCoordsLat, townCentreCoordsLong, townLeftmostCoordsLat, townRightmostCoordsLat, townUppermostCoordsLong, townLowermostCoordsLong) value ('Penarth','51.43893','-3.17354','51.34750','51.44365','-3.18830','-3.18187');