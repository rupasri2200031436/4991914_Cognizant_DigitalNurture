SET SERVEROUTPUT ON;

-- Create the procedure
CREATE OR REPLACE PROCEDURE TransferFunds (
  from_account IN NUMBER,
  to_account IN NUMBER,
  amount IN NUMBER
) AS
  from_balance NUMBER;
BEGIN
  SELECT balance INTO from_balance FROM accounts WHERE account_id = from_account;

  IF from_balance < amount THEN
    DBMS_OUTPUT.PUT_LINE('Transfer failed: insufficient funds in account ' || from_account);
  ELSE
    UPDATE accounts SET balance = balance - amount WHERE account_id = from_account;
    UPDATE accounts SET balance = balance + amount WHERE account_id = to_account;

    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Transferred ' || amount || ' from account ' || from_account || ' to account ' || to_account);
  END IF;
EXCEPTION
  WHEN NO_DATA_FOUND THEN
    DBMS_OUTPUT.PUT_LINE('Transfer failed: one or both accounts not found.');
  WHEN OTHERS THEN
    ROLLBACK;
    DBMS_OUTPUT.PUT_LINE('Transfer failed: ' || SQLERRM);
END TransferFunds;
/

EXEC TransferFunds(1001, 1002, 2000);

SELECT * FROM accounts;
