delete from users;
insert into users (userID, Name) value ('1', 'Hannah');
insert into users (userID, Name) value ('2', 'Nigel');

delete from trails;
insert into trails (trailID, Name) value ('1', 'Caerphilly Coffee Trail');
insert into trails (trailID, Name) value ('2', 'Penarth Dragon Trail');

delete from locations;
insert into locations (locationID, locationName , locationEmail,locationDescription,locationPlace, locationTrailID) value (1, 'St Cenydd','','location description here','Caerphilly',0101);
insert into locations (locationID, locationName , locationEmail,locationDescription,locationPlace, locationTrailID) value (2, 'The Castle','','location description here','Caerphilly',0101);
insert into locations (locationID, locationName , locationEmail,locationDescription,locationPlace, locationTrailID) value (3, 'Medieval Trades','','location description here','Caerphilly',0101);
insert into locations (locationID, locationName , locationEmail,locationDescription,locationPlace, locationTrailID) value (4, 'The Queen''s War','','location description here','Caerphilly',0101);
insert into locations (locationID, locationName , locationEmail,locationDescription,locationPlace, locationTrailID) value (5, 'The Green Lady','','location description here','Caerphilly',0101);
insert into locations (locationID, locationName , locationEmail,locationDescription,locationPlace, locationTrailID) value (6, 'Armoury','','location description here','Caerphilly',0101);
insert into locations (locationID, locationName , locationEmail,locationDescription,locationPlace, locationTrailID) value (7, 'Architecture','','location description here','Caerphilly',0101);
insert into locations (locationID, locationName , locationEmail,locationDescription,locationPlace, locationTrailID) value (8, '21st Century Landmark','','location description here','Caerphilly',0101);

insert into locations (locationID, locationName , locationEmail,locationDescription,locationPlace, locationTrailID) value (9, 'JD Wetherspoons-Malcolm Uphill','','location description here','Caerphilly',0102);
insert into locations (locationID, locationName , locationEmail,locationDescription,locationPlace, locationTrailID) value (10, 'Caerphilly Cwtch','','location description here','Caerphilly',0102);
insert into locations (locationID, locationName , locationEmail,locationDescription,locationPlace, locationTrailID) value (11, 'Caerphilly Conservative Club','','location description here','Caerphilly',0102);
insert into locations (locationID, locationName , locationEmail,locationDescription,locationPlace, locationTrailID) value (12, 'The King''s Arms','','location description here','Caerphilly',0102);

insert into locations (locationID, locationName , locationEmail,locationDescription,locationPlace, locationTrailID) value (13, 'Caerphilly Bus Station','','location description here','Caerphilly',0103);
insert into locations (locationID, locationName , locationEmail,locationDescription,locationPlace, locationTrailID) value (14, 'The Medieval Courthouse','','location description here','Caerphilly',0103);
insert into locations (locationID, locationName , locationEmail,locationDescription,locationPlace, locationTrailID) value (15 ,'Caerphilly Castle','','location description here','Caerphilly',0103);
insert into locations (locationID, locationName , locationEmail,locationDescription,locationPlace, locationTrailID) value (16, 'Ty Vaughan House','','location description here','Caerphilly',0103);
#
# locationID bigint auto_increment primary key,
#     locationName varchar(128),
#     locationEmail varchar(128),
#     locationDescription varchar(255),
#     locationTrailID varchar(128)
#
#
#                     <option value=0 disabled selected>Select Trail</option>
#     <option value=0101>(Caerphilly) Castle Trail</option>
#   <option value=0102>(Caerphilly) Pub Trail</option>
#              <option value=0103>(Caerphilly) Heritage Trail</option>
#                          <option value=0201>(Risca) Heritage and Culture Trail</option>
#                                      <option value=0301>(Penarth) Esplanade Trail</option>