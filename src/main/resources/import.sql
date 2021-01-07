
INSERT INTO regiones (id, nombre) VALUES (1,'Sudamérica');
INSERT INTO regiones (id, nombre) VALUES (2,'Centroamérica');
INSERT INTO regiones (id, nombre) VALUES (3,'Norteamérica');
INSERT INTO regiones (id, nombre) VALUES (4,'Europa');
INSERT INTO regiones (id, nombre) VALUES (5,'Asia');
INSERT INTO regiones (id, nombre) VALUES (6,'Africa');
INSERT INTO regiones (id, nombre) VALUES (7,'Oceanía');
INSERT INTO regiones (id, nombre) VALUES (8,'Antartida');


/* Populate tabla clientes */
INSERT INTO clientes (region_id,nombre, apellido, email, create_at) VALUES(1,'Luis Rodolfo', 'Torres C.', 'rodolfo@torres.com', '2020-12-12');
INSERT INTO clientes (region_id,nombre, apellido, email, create_at) VALUES(2,'Mr. John', 'Doe', 'john.doe@gmail.com', '2018-01-02');
INSERT INTO clientes (region_id,nombre, apellido, email, create_at) VALUES(3,'Linus', 'Torvalds', 'linus.torvalds@gmail.com', '2018-01-03');
INSERT INTO clientes (region_id,nombre, apellido, email, create_at) VALUES(4,'Rasmus', 'Lerdorf', 'rasmus.lerdorf@gmail.com', '2018-01-04');
INSERT INTO clientes (region_id,nombre, apellido, email, create_at) VALUES(5,'Erich', 'Gamma', 'erich.gamma@gmail.com', '2018-02-01');
INSERT INTO clientes (region_id,nombre, apellido, email, create_at) VALUES(4,'Richard', 'Helm', 'richard.helm@gmail.com', '2018-02-10');
INSERT INTO clientes (region_id,nombre, apellido, email, create_at) VALUES(7,'Ralph', 'Johnson', 'ralph.johnson@gmail.com', '2018-02-18');
INSERT INTO clientes (region_id,nombre, apellido, email, create_at) VALUES(8,'John', 'Vlissides', 'john.vlissides@gmail.com', '2018-02-28');
INSERT INTO clientes (region_id,nombre, apellido, email, create_at) VALUES(3,'Dr. James', 'Gosling', 'james.gosling@gmail.com', '2018-03-03');
INSERT INTO clientes (region_id,nombre, apellido, email, create_at) VALUES(2,'Magma', 'Lee', 'magma.lee@gmail.com', '2018-03-04');
INSERT INTO clientes (region_id,nombre, apellido, email, create_at) VALUES(2,'Tornado', 'Roe', 'tornado.roe@gmail.com', '2018-03-05');
INSERT INTO clientes (region_id,nombre, apellido, email, create_at) VALUES(6,'Jade', 'Doe', 'jane.doe@gmail.com', '2018-03-06');

INSERT INTO usuarios (username, password, enabled,nombre,apellido,email) VALUES ('rodo','$2a$10$t8fY3G0FcJa3MgwG6dA2Sesw2usxBGEDnvYy8E/MIjl/zqyDGkVde',1,'Rodolfo','Torres','r@g.com')
INSERT INTO usuarios (username, password, enabled,nombre,apellido,email) VALUES ('admin','$2a$10$M/mvB6JUfdhGTuaYmHp0cO83l9jZGdswAdet9kpIqJmIjxetESP4q',1,'Admin','Admin','admin@a.com')

INSERT INTO roles (nombre) VALUES ('ROLE_USER')
INSERT INTO roles (nombre) VALUES ('ROLE_ADMIN')

INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (1,1)
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2,2)
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2,1)

INSERT INTO productos(nombre, precio, create_at) VALUES ('Panasonic Pantalla 4k',25000, NOW());
INSERT INTO productos(nombre, precio, create_at) VALUES ('Camara Go Pro',60000, NOW());
INSERT INTO productos(nombre, precio, create_at) VALUES ('Xbox One',85000, NOW());
INSERT INTO productos(nombre, precio, create_at) VALUES ('Play Station 5',53000, NOW());
INSERT INTO productos(nombre, precio, create_at) VALUES ('Iphone X',125000, NOW());
INSERT INTO productos(nombre, precio, create_at) VALUES ('Xiaomi S9',23000, NOW());

INSERT INTO facturas(descripcion, observacion, cliente_id, create_at) VALUES('Factura equipos de entretenimiento', null,1,NOW());

INSERT INTO facturas_items(cantidad, factura_id, producto_id) VALUES(3, 1, 1);
INSERT INTO facturas_items(cantidad, factura_id, producto_id) VALUES(1, 1, 3);
INSERT INTO facturas_items(cantidad, factura_id, producto_id) VALUES(2, 1, 5);

INSERT INTO facturas(descripcion, observacion, cliente_id, create_at) VALUES('Factura celular', 'Semi Nuevo',1,NOW());

INSERT INTO facturas_items(cantidad, factura_id, producto_id) VALUES(2, 2, 6);


