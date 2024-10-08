CREATE TABLE tblcustomers (
    customerid SERIAL PRIMARY KEY,
    companyname VARCHAR(40) NOT NULL,
    contactname VARCHAR(30),
    contacttitle VARCHAR(30),
    address VARCHAR(60),
    city VARCHAR(15),
    region VARCHAR(15),
    postalcode VARCHAR(10),
    country VARCHAR(15) DEFAULT 'india',
    phone VARCHAR(24)
);

CREATE TABLE tblshippers (
    shipperid SERIAL PRIMARY KEY,
    companyname VARCHAR(40) NOT NULL UNIQUE
);

CREATE TABLE tblproducts (
    productid SERIAL PRIMARY KEY,
    productname VARCHAR(40) NOT NULL,
    supplierid INTEGER,
    categoryid INTEGER,
    quantityperunit VARCHAR(20),
    unitprice NUMERIC(10,2)
);

CREATE TABLE tblorders (
    orderid SERIAL PRIMARY KEY,
    customerid INTEGER,
    employeeid INTEGER,
    orderdate DATE,
    requireddate DATE,
    shippeddate DATE,
    shipvia INTEGER,
    freight NUMERIC(10,2),
    shipname VARCHAR(40),
    shipaddress VARCHAR(60),
    FOREIGN KEY (customerid) REFERENCES tblcustomers(customerid),
    FOREIGN KEY (shipvia) REFERENCES tblshippers(shipperid),
    CONSTRAINT chk_shippeddate CHECK (shippeddate > orderdate)
);

CREATE TABLE tblorderdetails (
    orderid INTEGER,
    productid INTEGER,
    unitprice NUMERIC(10,2) NOT NULL,
    quantity SMALLINT NOT NULL,
    discount REAL NOT NULL,
    PRIMARY KEY (orderid, productid),
    FOREIGN KEY (orderid) REFERENCES tblorders(orderid),
    FOREIGN KEY (productid) REFERENCES tblproducts(productid),
    CONSTRAINT chk_quantity CHECK (quantity > 0)
);

INSERT INTO tblcustomers (companyname, contactname, contacttitle, address, city, region, postalcode, country, phone)
VALUES 
('Sharma Enterprises', 'Rahul Sharma', 'Owner', '15 MG Road', 'Mumbai', 'Maharashtra', '400001', 'India', '022-22356789'),
('Patel Foods Pvt Ltd', 'Priya Patel', 'Sales Manager', '7 Jubilee Hills', 'Hyderabad', 'Telangana', '500033', 'India', '040-66889900'),
('Singh Textiles', 'Amarjeet Singh', 'Managing Director', '22 Civil Lines', 'Delhi', 'Delhi', '110054', 'India', '011-43215678');

INSERT INTO tblshippers (companyname)
VALUES 
('Bharat Express'),
('IndiaPost Couriers'),
('Desi Logistics');

INSERT INTO tblproducts (productname, supplierid, categoryid, quantityperunit, unitprice)
VALUES 
('Basmati Rice', 1, 1, '5 kg bag', 250.00),
('Masala Chai', 1, 1, '100 tea bags', 180.00),
('Mango Pickle', 2, 2, '500 g jar', 120.00);

INSERT INTO tblorders (customerid, employeeid, orderdate, requireddate, shippeddate, shipvia, freight, shipname, shipaddress)
VALUES 
(1, 5, '2024-07-04', '2024-07-10', '2024-07-06', 3, 150.00, 'Sharma Enterprises', '15 MG Road, Mumbai'),
(2, 4, '2024-07-05', '2024-07-12', '2024-07-07', 1, 100.00, 'Patel Foods Pvt Ltd', '7 Jubilee Hills, Hyderabad'),
(3, 3, '2024-07-08', '2024-07-15', '2024-07-10', 2, 200.00, 'Singh Textiles', '22 Civil Lines, Delhi');

INSERT INTO tblorderdetails (orderid, productid, unitprice, quantity, discount)
VALUES 
(1, 1, 250.00, 10, 0.05),
(1, 2, 180.00, 15, 0),
(2, 3, 120.00, 20, 0.1),
(3, 1, 250.00, 5, 0),
(3, 2, 180.00, 25, 0.15);

select * from tblcustomers;


INSERT INTO tblcustomers (companyname, contactname, contacttitle, address, city, region, postalcode, phone)
VALUES 
('Sharma Enterprises', 'Rahul Sharma', 'Owner', '15 MG Road', 'Mumbai', 'Maharashtra', '400001', '022-22356789');

INSERT INTO tblorders (customerid, employeeid, orderdate, requireddate, shippeddate, shipvia, freight, shipname, shipaddress)
VALUES 
(1, 5, '2024-07-04', '2024-07-10', '2024-07-02', 3, 150.00, 'Sharma Enterprises', '15 MG Road, Mumbai');
