
INSERT INTO Attendant (name, type) VALUES ('Antonio', 0);
INSERT INTO Attendant (name, type) VALUES ('Valdinar', 1);
INSERT INTO Attendant (name, type) VALUES ('Junior', 2);
--
INSERT INTO Orders (description, type, status, attendant_id, created_on) VALUES ('Descricao 1', 0, 1, 1, CURRENT_TIMESTAMP());
INSERT INTO Orders (description, type, status, created_on) VALUES ('Descricao 2', 0, 0, CURRENT_TIMESTAMP() + 1);
INSERT INTO Orders (description, type, status, created_on) VALUES ('Descricao 3', 0, 0, CURRENT_TIMESTAMP() + 2);