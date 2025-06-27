-- Customers Table
CREATE TABLE customers (
  customer_id   NUMBER PRIMARY KEY,
  name          VARCHAR2(100),
  age           NUMBER,
  balance       NUMBER(12, 2),
  isvip         CHAR(1) DEFAULT 'N' -- 'Y' or 'N'
);

-- Loans Table
CREATE TABLE loans (
  loan_id       NUMBER PRIMARY KEY,
  customer_id   NUMBER,
  interest_rate NUMBER(5, 2),
  due_date      DATE,
  FOREIGN KEY (customer_id) REFERENCES customers(customer_id)
);

-- Insert Customers
INSERT INTO customers VALUES (1, 'Alice', 65, 15000, 'N');
INSERT INTO customers VALUES (2, 'Bob', 45, 9000, 'N');
INSERT INTO customers VALUES (3, 'Charlie', 70, 12000, 'N');
INSERT INTO customers VALUES (4, 'Diana', 30, 2000, 'N');

-- Insert Loans
INSERT INTO loans VALUES (101, 1, 6.5, SYSDATE + 15);  
INSERT INTO loans VALUES (102, 2, 7.0, SYSDATE + 45);  
INSERT INTO loans VALUES (103, 3, 5.5, SYSDATE + 10);  
INSERT INTO loans VALUES (104, 4, 8.0, SYSDATE + 5);   


