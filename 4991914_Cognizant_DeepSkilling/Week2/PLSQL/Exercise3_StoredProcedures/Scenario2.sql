CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
  dept_id IN NUMBER,
  bonus_pct IN NUMBER
) AS
BEGIN
  UPDATE employees
  SET salary = salary + (salary * bonus_pct / 100)
  WHERE department_id = dept_id;

  COMMIT;
  DBMS_OUTPUT.PUT_LINE('Bonus of ' || bonus_pct || '% applied to department ' || dept_id || '.');
EXCEPTION
  WHEN OTHERS THEN
    ROLLBACK;
    DBMS_OUTPUT.PUT_LINE('Error applying bonus: ' || SQLERRM);
END UpdateEmployeeBonus;
/

EXEC UpdateEmployeeBonus(10, 10);

SELECT * FROM employees;