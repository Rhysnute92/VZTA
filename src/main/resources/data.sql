delete from users;
insert into users (userID, email, name) value ('1', 'hannah@gmail.com', 'Hannah');
insert into users (userID, email, name) value ('2', 'nigel@gmail.com', 'Nigel');

delete from trails;
insert into trails (trailID, Name) value ('1', 'Caerphilly Coffee Trail');
insert into trails (trailID, Name) value ('2', 'Penarth Dragon Trail');

delete from locations;
insert into locations (locationID, Name) value ('1', 'Caerphilly');
insert into locations (locationID, Name) value ('2', 'Penarth');

delete from badges;
insert into badges (badgeID, name, description, difficulty) value ('1', 'TownConnoisseur', 'You know the town very well!', '2');
insert into badges (badgeID, name, description, difficulty) value ('2', 'TownRegular', 'You visited the town 3 days in a row!', '1');
insert into badges (badgeID, name, description, difficulty) value ('3', 'TownMaster', 'You visited the town 7 days in a row!', '1');
insert into badges (badgeID, name, description, difficulty) value ('4', 'TownRegular', 'You visited the town 3 days in a row!', '1');
insert into badges (badgeID, name, description, difficulty) value ('5', 'TownRegular', 'You visited the town 3 days in a row!', '1');