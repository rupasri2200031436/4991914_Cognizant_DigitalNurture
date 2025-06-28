SET SERVEROUTPUT ON;

BEGIN
  FOR cust_rec IN (SELECT customer_id, name, balance FROM customers) LOOP
    IF cust_rec.balance > 10000 THEN
      UPDATE customers
      SET isvip = 'Y'
      WHERE customer_id = cust_rec.customer_id;

      DBMS_OUTPUT.PUT_LINE('Promoted to VIP: ' || cust_rec.name || 
                           ' (Customer ID: ' || cust_rec.customer_id || ')');
    ELSE
      DBMS_OUTPUT.PUT_LINE('Not eligible for VIP: ' || cust_rec.name);
    END IF;
  END LOOP;

  COMMIT;
END;
/

