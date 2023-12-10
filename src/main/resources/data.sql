DELETE FROM users;
INSERT INTO users (id, email, name, password) VALUE (1, 'admin@gmail.com', 'Admin', 'admin');
INSERT INTO users (email, name, password) VALUE ('hannah@gmail.com', 'Hannah', 'root');
INSERT INTO users (email, name, password) VALUE ('nigel@gmail.com', 'Nigel', 'root');
INSERT INTO users (email, name, password) VALUE ('oscar@gmail.com', 'Oscar', 'root');

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