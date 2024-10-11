CREATE TABLE Worker (
    WORKER_ID SERIAL PRIMARY KEY,
    FIRST_NAME VARCHAR(50),
    LAST_NAME VARCHAR(50),
    SALARY DECIMAL(10, 2),
    JOINING_DATE DATE,
    DEPARTMENT VARCHAR(50)
);

CREATE TABLE Title (
    WORKER_REF_ID INTEGER,
    WORKER_TITLE VARCHAR(50),
    AFFECTED_FROM DATE,
    FOREIGN KEY (WORKER_REF_ID) REFERENCES Worker(WORKER_ID)
);

CREATE TABLE Bonus (
    WORKER_REF_ID INTEGER,
    BONUS_AMOUNT DECIMAL(10, 2),
    BONUS_DATE DATE,
    FOREIGN KEY (WORKER_REF_ID) REFERENCES Worker(WORKER_ID)
);


INSERT INTO Worker (FIRST_NAME, LAST_NAME, SALARY, JOINING_DATE, DEPARTMENT) VALUES
('John', 'Doe', 50000.00, '2022-01-15', 'HR'),
('Jane', 'Smith', 60000.00, '2021-11-01', 'Marketing'),
('Mike', 'Johnson', 55000.00, '2022-03-10', 'IT');

INSERT INTO Title (WORKER_REF_ID, WORKER_TITLE, AFFECTED_FROM) VALUES
(1, 'HR Specialist', '2022-01-15'),
(2, 'Marketing Manager', '2021-11-01'),
(3, 'Software Developer', '2022-03-10');

INSERT INTO Bonus (WORKER_REF_ID, BONUS_AMOUNT, BONUS_DATE) VALUES
(1, 1000.00, '2022-12-25'),
(2, 1500.00, '2022-12-25'),
(3, 1200.00, '2022-12-25');

SELECT * FROM Title;

SELECT w.FIRST_NAME, w.SALARY, t.WORKER_TITLE
FROM Worker w
JOIN Title t ON w.WORKER_ID = t.WORKER_REF_ID;

CREATE OR REPLACE FUNCTION count_workers_with_nth_highest_salary(n INTEGER)
RETURNS INTEGER AS $$
DECLARE
    nth_highest_salary DECIMAL(10, 2);
    worker_count INTEGER;
BEGIN
    SELECT DISTINCT salary INTO nth_highest_salary
    FROM (
        SELECT salary, 
               DENSE_RANK() OVER (ORDER BY salary DESC) as salary_rank
        FROM Worker
    ) ranked_salaries
    WHERE salary_rank = n;

    SELECT COUNT(*) INTO worker_count
    FROM Worker
    WHERE salary = nth_highest_salary;
    RETURN worker_count;
END;
$$ LANGUAGE plpgsql;

SELECT count_workers_with_nth_highest_salary(1) AS workers_with_highest_salary;