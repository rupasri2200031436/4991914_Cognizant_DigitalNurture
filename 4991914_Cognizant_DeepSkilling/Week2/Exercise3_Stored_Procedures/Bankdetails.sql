-- Drop existing tables if needed
BEGIN
  EXECUTE IMMEDIATE 'DROP TABLE employees';
  EXECUTE IMMEDIATE 'DROP TABLE accounts';
  EXECUTE IMMEDIATE 'DROP TABLE savings_accounts';
EXCEPTION
  WHEN OTHERS THEN NULL;
END;
/

-- Table for savings accounts 
CREATE TABLE savings_accounts (
  account_id     NUMBER PRIMARY KEY,
  customer_id    NUMBER,
  balance        NUMBER(12, 2)
);

-- Table for employees 
CREATE TABLE employees (
  emp_id         NUMBER PRIMARY KEY,
  emp_name       VARCHAR2(100),
  department_id  NUMBER,
  salary         NUMBER(10, 2)
);

-- Table for customer accounts 
CREATE TABLE accounts (
  account_id     NUMBER PRIMARY KEY,
  customer_id    NUMBER,
  balance        NUMBER(12, 2)
);

-- Savings Accounts
INSERT INTO savings_accounts VALUES (1, 101, 10000);
INSERT INTO savings_accounts VALUES (2, 102, 15000);
INSERT INTO savings_accounts VALUES (3, 103, 5000);

-- Employees
INSERT INTO employees VALUES (201, 'Alice', 10, 50000);
INSERT INTO employees VALUES (202, 'Bob', 10, 60000);
INSERT INTO employees VALUES (203, 'Charlie', 20, 45000);

-- Customer Accounts
INSERT INTO accounts VALUES (1001, 101, 20000);
INSERT INTO accounts VALUES (1002, 101, 5000);
INSERT INTO accounts VALUES (1003, 102, 8000);

COMMIT;
