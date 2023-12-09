DELETE FROM users;
INSERT INTO users (id, email, name) VALUE (1, 'admin@gmail.com', 'Admin');
INSERT INTO users (email, name) VALUE ('hannah@gmail.com', 'Hannah');
INSERT INTO users (email, name) VALUE ('nigel@gmail.com', 'Nigel');
INSERT INTO users (email, name) VALUE ('oscar@gmail.com', 'Nigel');

DELETE FROM trails;
INSERT INTO trails ( Name) VALUE ( 'Caerphilly Coffee Trail');
INSERT INTO trails ( Name) VALUE ( 'Penarth Dragon Trail');

DELETE FROM locations;
INSERT INTO locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID) VALUE ( 'St Cenydd','','Location description here','Caerphilly',0101);
INSERT INTO locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID) VALUE ( 'The Castle','','Location description here','Caerphilly',0101);
INSERT INTO locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID) VALUE ( 'Medieval Trades','','Location description here','Caerphilly',0101);
INSERT INTO locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID) VALUE ( 'The Queen''s War','','Location description here','Caerphilly',0101);
INSERT INTO locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID) VALUE ( 'The Green Lady','','Location description here','Caerphilly',0101);
INSERT INTO locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID) VALUE ( 'Armoury','','Location description here','Caerphilly',0101);
INSERT INTO locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID) VALUE ( 'Architecture','','Location description here','Caerphilly',0101);
INSERT INTO locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID) VALUE ( '21st Century Landmark','','Location description here','Caerphilly',0101);

INSERT INTO locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID) VALUE ( 'JD Wetherspoons-Malcolm Uphill','','Location description here','Caerphilly',0102);
INSERT INTO locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID) VALUE ( 'Caerphilly Cwtch','','Location description here','Caerphilly',0102);
INSERT INTO locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID) VALUE ( 'Caerphilly Conservative Club','','Location description here','Caerphilly',0102);
INSERT INTO locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID) VALUE ( 'The King''s Arms','','Location description here','Caerphilly',0102);

INSERT INTO locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID) VALUE ( 'Caerphilly Bus Station','','Location description here','Caerphilly',0103);
INSERT INTO locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID) VALUE ( 'The Medieval Courthouse','','Location description here','Caerphilly',0103);
INSERT INTO locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID) VALUE ('Caerphilly Castle','','Location description here','Caerphilly',0103);
INSERT INTO locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID) VALUE ( 'Ty Vaughan House','','Location description here','Caerphilly',0103);

INSERT INTO locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID) VALUE ( 'Risca Colliery','','Location description here','Risca',0201);
INSERT INTO locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID) VALUE ( 'Black Vein Colliery Disaster','','Location description here','Risca',0201);


INSERT INTO locations (locationID, locationName , locationEmail,locationDescription,locationPlace, locationTrailID) VALUE (19, 'The Esplanade','','Location description here','Penarth',0301);
INSERT INTO locations (locationID, locationName , locationEmail,locationDescription,locationPlace, locationTrailID) VALUE (20, 'The Old Swimming Baths','','Location description here','Penarth',0301);


DELETE FROM packs;
INSERT INTO packs (name, description) VALUE ('Wales Football Team', 'Pack of Welsh Football Players in the National Team');
INSERT INTO packs (name, description) VALUE ('Wales Rugby Team', 'Pack of Welsh Rugby Players in the National Team');
INSERT INTO packs (name, description) VALUE ('Welsh Heritage', 'Pack About Welsh Heritage');

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

DELETE FROM stickerprogress;
INSERT INTO stickerprogress (userID, packID, stickerID) VALUE (1, 1, 1);
INSERT INTO stickerprogress (userID, packID, stickerID) VALUE (1, 1, 2);
INSERT INTO stickerprogress (userID, packID, stickerID) VALUE (1, 1, 3);
INSERT INTO stickerprogress (userID, packID, stickerID) VALUE (1, 1, 5);
INSERT INTO stickerprogress (userID, packID, stickerID) VALUE (1, 2, 1);
INSERT INTO stickerprogress (userID, packID, stickerID) VALUE (1, 2, 3);