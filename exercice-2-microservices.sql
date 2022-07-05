-- CREATE SCHEMA exercise2_microservices;

USE exercise2_microservices;

DROP TABLE inventory;
DROP TABLE price_table;

CREATE TABLE inventory(
	serial_number BIGINT NOT NULL AUTO_INCREMENT,
    quantity INT,
    PRIMARY KEY (serial_number)
);

INSERT INTO inventory (quantity) VALUES
(50),
(10),
(15);

CREATE TABLE price_table(
	serial_number BIGINT NOT NULL AUTO_INCREMENT,
    product_name VARCHAR(255),
    price DOUBLE,
    PRIMARY KEY (serial_number)
);

INSERT INTO price_table (product_name, price) VALUES
("shirt", 15.00),
("pants",30.00),
("socks",1.50);