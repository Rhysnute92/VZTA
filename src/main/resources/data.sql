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