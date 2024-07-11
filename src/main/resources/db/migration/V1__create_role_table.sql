CREATE TABLE Role (
    roleID smallInt PRIMARY KEY AUTO_INCREMENT NOT NULL,
    title varchar(100) NOT NULL
);

INSERT INTO `Role`(title) VALUES("HR"), ("Delivery"), ("Sales"), ("Management");