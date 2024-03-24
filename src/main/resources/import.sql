INSERT INTO "user" (username, name, password, role) VALUES ('lballico', 'lucianne ballico', '$2a$10$uCEJwEg9oOtgD5dbY.QfAuohQMAgtHE8gMn8rP8C1auIoESOAgVne', 'ROLE_CUSTOMER');
INSERT INTO "user" (username, name, password, role) VALUES ('lrocha', 'lucas rocha', '$2a$10$wj0LoBCzeBu4L6Au4JcsruxnpxYHsTcDrw8zLRSI8XS.fKbJ8dMHK', 'ROLE_ASSISTANT_ADMINISTRATOR');

-- CRIACAO DE CATEGORIAS
INSERT INTO category (name, status) VALUES ('Eletronica', 'ENABLED');
INSERT INTO category (name, status) VALUES ('Roupa', 'ENABLED');
INSERT INTO category (name, status) VALUES ('Esportes', 'ENABLED');

-- CRIACAO DE PRODUCTOS
INSERT INTO product (name, price, status, category_id) VALUES ('Smartphone', 500.00, 'ENABLED', 1);
INSERT INTO product (name, price, status, category_id) VALUES ('Tablet', 300.00, 'ENABLED', 1);

INSERT INTO product (name, price, status, category_id) VALUES ('Camiseta', 25.00, 'ENABLED', 2);
INSERT INTO product (name, price, status, category_id) VALUES ('Sapatos', 45.00, 'ENABLED', 2);

INSERT INTO product (name, price, status, category_id) VALUES ('Bola de Futebol', 20.00, 'ENABLED', 3);
INSERT INTO product (name, price, status, category_id) VALUES ('Raquete de Tenis', 80.00, 'DISABLED', 3);

