sET SERVEROUTPUT ON;

-- Create the procedure
CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest AS
BEGIN
  UPDATE savings_accounts
  SET balance = balance + (balance * 0.01);

  COMMIT;
  DBMS_OUTPUT.PUT_LINE('Monthly interest processed for all savings accounts.');
EXCEPTION
  WHEN OTHERS THEN
    ROLLBACK;
    DBMS_OUTPUT.PUT_LINE('Error processing interest: ' || SQLERRM);
END ProcessMonthlyInterest;
/

EXEC ProcessMonthlyInterest;
SELECT * FROM savings_accounts;
