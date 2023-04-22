--Создаем таблицу с вопросами
CREATE TABLE Questions
(
	question_id serial PRIMARY KEY,
	description VARCHAR(100) NOT NULL UNIQUE
);

--Создаем таблицу с вариантами ответа
CREATE TABLE Answer_Options
(
	answer_Description VARCHAR(50) NOT NULL,
	question_id INT NOT NULL,
	FOREIGN KEY (question_id) REFERENCES Questions (question_id)
);

--Создаем таблицу с ответами
CREATE TABLE true_Answers
(
	question_id INT NOT NULL,
	true_answer_number INT NOT NULL,
	FOREIGN KEY (question_id) REFERENCES Questions (question_id)
);

--Заполнение таблицы Questions
INSERT INTO Questions VALUES (1, 'В какой файл скомпилируется java-файл?');
INSERT INTO Questions VALUES (2, 'Сколько будет 2+2?');
INSERT INTO Questions VALUES (3, 'Какой из перечисленных типов данных относится к целочисленным?');

--Заполнение таблицы Answer_Options
INSERT INTO Answer_Options VALUES ('.java', 1);
INSERT INTO Answer_Options VALUES ('.exe', 1);
INSERT INTO Answer_Options VALUES ('.cs', 1);
INSERT INTO Answer_Options VALUES ('.class', 1);
INSERT INTO Answer_Options VALUES ('4', 2);
INSERT INTO Answer_Options VALUES ('2', 2);
INSERT INTO Answer_Options VALUES ('3', 2);
INSERT INTO Answer_Options VALUES ('5', 2);
INSERT INTO Answer_Options VALUES ('float', 3);
INSERT INTO Answer_Options VALUES ('double', 3);
INSERT INTO Answer_Options VALUES ('int', 3);
INSERT INTO Answer_Options VALUES ('char', 3);

--Заполнение таблицы true_Answers
INSERT INTO true_Answers VALUES (1, 4); --Вопрос номер 1, ответ под номером 4
INSERT INTO true_Answers VALUES (2, 1);
INSERT INTO true_Answers VALUES (3, 3);


SELECT * FROM Questions;
SELECT * FROM Answer_Options;
SELECT q.description, tr.true_answer_number FROM Questions q INNER JOIN true_Answers tr ON q.question_id = tr.question_id;