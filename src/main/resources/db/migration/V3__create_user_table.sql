CREATE TABLE `User` (
    username VARCHAR(50) PRIMARY KEY NOT NULL,
    password VARCHAR(50) NOT NULL,
    employeeID smallInt NOT NULL,
    FOREIGN KEY employeeID REFERENCES Employee(employeeID)
)