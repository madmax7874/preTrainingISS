INSERT INTO branch VALUES(4, "Buffalo", NULL, NULL);

SELECT employee.emp_id, employee.first_name, branch.branch_name FROM employee
JOIN branch ON employee.emp_id = branch.mgr_id;

SELECT employee.first_name AS Employee_Branch_Names FROM employee
UNION
SELECT branch.branch_name FROM branch;

-- Find a list of all clients & branch suppliers' names
SELECT clients.client_name AS Non_Employee_Entities, clients.branch_id AS Branch_ID FROM clients
UNION
SELECT branch_supplier.supplier_name, branch_supplier.branch_id FROM branch_supplier;