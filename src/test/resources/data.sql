USE test_towns;
INSERT INTO users (username, password) VALUE ('Admin', 'admin');
INSERT INTO users (username, password) VALUE ('Hannah', 'root');
INSERT INTO users (username, password) VALUE ('Nigel', 'root');
INSERT INTO users (username, password) VALUE ('Oscar', 'root');

INSERT INTO authorities (username, authority) VALUE ('Admin', 'ADMIN');
INSERT INTO authorities (username, authority) VALUE ('Hannah', 'USER');
