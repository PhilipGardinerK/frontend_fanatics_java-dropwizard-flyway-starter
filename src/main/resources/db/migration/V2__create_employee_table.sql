create table Employee(
	employeeID smallint auto_increment not null,
    roleID smallInt not null,
    employeeFname VARCHAR(50) not null,
    employeeLname VARCHAR(50) not null,
    bankAcctNo VARCHAR(8) not null,
    niNo CHAR(9) not null,
    salary decimal(9,2) not null,
    commRate decimal(4,2) default 00.00,
    PRIMARY KEY (employeeID),
    FOREIGN KEY (roleID) REFERENCES Role(roleID)
);

INSERT INTO Employee (roleID, employeeFname, employeeLname, bankAcctNo, niNo, salary, commRate)
    VALUES (1, 'Adam','Bowman',12345678, 11111111, 100000.00, 0),
     (2, 'John','Smith',22345678, 22222222, 50000.00, 0),
     (3, 'Andrew','Brown',3245678, 33333333, 200000.00, 10),
     (4, 'Thomas','Yellow',42345678, 44444444, 30000.00, 0);
    
