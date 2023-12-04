delete from users;
insert into users (userID, Name) value ('1', 'Hannah');
insert into users (userID, Name) value ('2', 'Nigel');

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


insert into locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID) value ( 'The Esplanade','','Location description here','Penarth',0301);
insert into locations ( locationName , locationEmail,locationDescription,locationPlace, locationTrailID) value ( 'The Old Swimming Baths','','Location description here','Penarth',0301);
