delete from users;
insert into users (email, name) value ('hannah@gmail.com', 'Hannah');
insert into users (email, name) value ('nigel@gmail.com', 'Nigel');

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


delete from packs;
insert into packs (name, description) value ('Wales National Team', 'Pack of Welsh Football Players in the National Team');
insert into packs (name, description) value ('Pack2', 'This is pack 2');
insert into packs (name, description) value ('Pack3', 'This is pack 2');
insert into packs (name, description) value ('Pack3', 'This is pack 2');
insert into packs (name, description) value ('Pack3', 'This is pack 2');
insert into packs (name, description) value ('Pack3', 'This is pack 2');
insert into packs (name, description) value ('Pack3', 'This is pack 2');
insert into packs (name, description) value ('Pack3', 'This is pack 2');


delete from stickers;
insert into stickers (name, description, rarity, packID) value ('wayne_hennessey', 'Wales Football Team Player', '2', 1);
insert into stickers (name, description, rarity, packID) value ('neco_williams', 'Wales Football Team Player', '2', 1);
insert into stickers (name, description, rarity, packID) value ('joe_morrell', 'Wales Football Team Player', '2', 1);
insert into stickers (name, description, rarity, packID) value ('ethan_ampadu', 'Wales Football Team Player', '2', 1);
insert into stickers (name, description, rarity, packID) value ('connor_roberts', 'Wales Football Team Player', '2', 1);
insert into stickers (name, description, rarity, packID) value ('TownRegular', 'You visited the town 3 days in a row!', '1', 2);
insert into stickers (name, description, rarity, packID) value ('TownRegular', 'You visited the town 3 days in a row!', '1', 2);

delete from stickerprogress;
insert into stickerprogress (userID, stickerID, hasSticker) value ('1', '1', true);
insert into stickerprogress (userID, stickerID, hasSticker) value ('1', '2', true);
insert into stickerprogress (userID, stickerID, hasSticker) value ('1', '3', true);
insert into stickerprogress (userID, stickerID, hasSticker) value ('1', '5', true);
insert into stickerprogress (userID, stickerID, hasSticker) value ('2', '2', true);