/*
 Levantamiento necesidades cliente:
a) objetivos:
- solucionar redundancia de datos (hasta ahora papel y planillas excel)
- modernizar administración de datos (seguir siendo competitivos)
    - clientes
    - empleados
    - productos

b) BD, guardar info de:

- empleados                 //¿entidades fuertes?
- clientes 
- despachadores


- productos                 //¿core negocio?
- categoria
- proveedores


- ordenes de compra


c) GESTION INFO
- producto: relación con categorías y proveedores
******- compras: ordenes de compra y relación con producto+empleados+clientes+despachadores 
- detalle compra ==> registrar al realizar venta (está incluído dato de vendedor?)

d) obj estratégicos/proyecciones negocio:
- mapeo distribucion geográfica proveedores (eventualmente implementar gestión y evaluación proveedores???)
- adm categorias y productos (estructura, )
- producto: control stock
- mapeo compras realizadas (qué producto se vendió + quién lo vendió + a qué cliente + quién lo entregó) 
- gestión empleados: n° ventas realizadas




*/

1)identificar entidades, modelo entidad relacion + cardinalidades + tipos de datos de las variables + asignar claves....
MODELO CONCEPTUAL
- identificar entidades
- agrupar entidades con atributos
- nombrar la relación


-- 2) crear usuario para desarrollar los scripts
SQL> alter session set "_oracle_script"=true;
==> Sesi¾n modificada.

SQL> create user pruebaMHB identified by 1234;
==> Usuario creado.

SQL> grant all privileges to pruebaMHB;
==> Concesi¾n terminada correctamente.

SQL> disconnect;
==>Desconectado de Oracle Database 19c Enterprise Edition Release 19.0.0.0.0 - Production
Version 19.3.0.0.0
SQL> connect pruebaMHB;
Introduzca la contrase±a:
==>Conectado.

--2) crear tablas y estructura necesaria

CREATE TABLE empleados
( RUN_empleado VARCHAR2(15),
cargo VARCHAR2(20),
nombre VARCHAR2(20),
apellido VARCHAR2(25),
fechaNac DATE,
telefono VARCHAR2(15),
direccion VARCHAR2(40),
==> Table EMPLEADOS created.

CREATE TABLE clientes
( RUN_cliente VARCHAR2(15),
nombreCia VARCHAR2(40),
nombreContacto VARCHAR2(30),
email VARCHAR2(20),
telefono VARCHAR2(15),
direccion VARCHAR2(40),
PRIMARY KEY (RUN_cliente) );
==> Table CLIENTES created.

CREATE TABLE proveedores
( RUN_proveedor VARCHAR2(15),
nombreCia VARCHAR2(40),
nombreContacto VARCHAR2(30),
telefono VARCHAR2(15),
dire VARCHAR2(40),
PRIMARY KEY (RUN_proveedor));
==> Table PROVEEDORES created.

CREATE TABLE despachadores
( RUN_despachador VARCHAR2(15),
nombre VARCHAR2(40),
fonoCia VARCHAR2(15),
PRIMARY KEY (RUN_despachador));
==> Table DESPACHADORES created.

CREATE TABLE productos
(id_producto NUMBER,
nombreProducto VARCHAR2(20),
precio NUMBER,
descontinuado NUMBER(1),
stock NUMBER,
nombreCategoria VARCHAR2(20),
PRIMARY KEY (id_producto) );
==>Table PRODUCTOS created.

CREATE TABLE detalleCompra
(id_detalle NUMBER,
valorCompra NUMBER,
cantProducto NUMBER,
descuentos NUMBER,
id_OCompra NUMBER,
id_product NUMBER);
==> Table DETALLECOMPRA created.

CREATE TABLE OrdenesCompra
(id_OrdenCompra NUMBER,
FechaRequerimiento DATE,
responsableRequerimiento VARCHAR2(20),
totalCOMPRA NUMBER,
id_cliente VARCHAR2(30),
nombreDestinatario VARCHAR2(40),
direEnv VARCHAR2(20),
fechaEnvio DATE,
viaEnvio VARCHAR2(30) );
==> Table ORDENESCOMPRA created.

CREATE TABLE domicilio
(codPostal NUMBER,
direccion VARCHAR2(20),
ciudad VARCHAR2(15),
region VARCHAR2(20), 
pais VARCHAR2(15),
viaEnvio VARCHAR2(40),
PRIMARY KEY (direccion) );
==> Table DOMICILIO created.

CREATE TABLE categoria
(nombreCategoria VARCHAR2(30),
PRIMARY KEY (nombreCategoria) );
==> Table CATEGORIA created.


--AGREGAR CLAVES PRIMARIAS Y FORANEAS
ALTER TABLE CLIENTES ADD FOREIGN KEY(DIRECCION) REFERENCES DOMICILIO(DIRECCION);
==>Table CLIENTES altered.

ALTER TABLE EMPLEADOS ADD PRIMARY KEY (RUN_EMPLEADO);
ALTER TABLE ORDENESCOMPRA ADD PRIMARY KEY (ID_ORDENCOMPRA);
ALTER TABLE ORDENESCOMPRA ADD FOREIGN KEY(NOMBREDESTINATARIO) REFERENCES CLIENTES(RUN_CLIENTE);
ALTER TABLE ORDENESCOMPRA ADD FOREIGN KEY(direenvi) REFERENCES domicilio(direccion);
ALTER TABLE DETALLECOMPRA ADD PRIMARY KEY (ID_detalle);
ALTER TABLE DETALLECOMPRA ADD FOREIGN KEY(ID_OCOMPRA) REFERENCES ORDENESCOMPRA(ID_ORDENCOMPRA);
ALTER TABLE DETALLECOMPRA ADD FOREIGN KEY (ID_PRODUCT) REFERENCES PRODUCTOS(ID_PRODUCTO);





--3) realizar 5 inserciones a cada tabla

--CLIENTES
INSERT INTO CLIENTES (run_cliente, nombrecia, nombrecontacto, email, telefono,direccion)VALUES ('1111-1', 'CiaUno', 'ContactoCiaUno', 'ciaUno@gmail.com', '+569111', 'AVENIDA MATUCANA 100');
INSERT INTO CLIENTES (run_cliente, nombrecia, nombrecontacto, email, telefono,direccion)VALUES ('2222-1', 'CiaDos', 'ContactoCiaDos', 'ciaDos@gmail.com', '+5692222', 'EDUARDO FREI 1320');
INSERT INTO CLIENTES (run_cliente, nombrecia, nombrecontacto, email, telefono,direccion)VALUES ('3333-1', 'CiaTres', 'ContactoCiaTres', 'ciaTres@gmail.com', '+5693333', 'LOS AVELLANOS 333');
INSERT INTO CLIENTES (run_cliente, nombrecia, nombrecontacto, email, telefono,direccion)VALUES ('4444-1', 'CiaCuatro', 'ContactoCiaCuatro', 'ciaCuatro@gmail.com', '+5694444', 'Av. San Martin 120');
INSERT INTO CLIENTES (run_cliente, nombrecia, nombrecontacto, email, telefono,direccion)VALUES ('5555-1', 'CiaCinco', 'ContactoCiaCinco', 'ciaCinco@gmail.com', '+5695555', 'CALETA BUENA 111');
==> 1 row inserted. (x5)

--EMPLEADOS
INSERT INTO EMPLEADOS (run_empleado, cargo, nombre, apellido, fechanac, telefono, direccion) VALUES ('v1111-1', 'VENDEDOR', 'Employee1', 'EmployeeLastName1', TO_DATE('01-01-1980','DD-MM-YYYY'), '+5696666', 'losVendedores 66');              
INSERT INTO EMPLEADOS (run_empleado, cargo, nombre, apellido, fechanac, telefono, direccion) VALUES ('v2222-1', 'REPONEDOR', 'Employee2', 'EmployeeLastName2', TO_DATE('02-02-1982','DD-MM-YYYY'), '+5697777', 'losVendedores 77');               
INSERT INTO EMPLEADOS (run_empleado, cargo, nombre, apellido, fechanac, telefono, direccion) VALUES ('v3333-1', 'RECEPCIONISTA', 'Employee3', 'EmployeeLastName3', TO_DATE('03-03-1983','DD-MM-YYYY'), '+5698888', 'losVendedores 66');               
INSERT INTO EMPLEADOS (run_empleado, cargo, nombre, apellido, fechanac, telefono, direccion) VALUES ('v4444-1', 'RRHH', 'Employee4', 'EmployeeLastName4', TO_DATE('04-04-1984','DD-MM-YYYY'), '+5629999', 'AIRES 44');               
INSERT INTO EMPLEADOS (run_empleado, cargo, nombre, apellido, fechanac, telefono, direccion) VALUES ('v5555-1', 'VENDEDOR', 'Employee5', 'EmployeeLastName5', TO_DATE('05-05-1985','DD-MM-YYYY'), '+56321414', 'valdivia 88');      
==> 1 row inserted. (x5)

-- DESPACHADORES
INSERT INTO DESPACHADORES (run_despachador,nombre,fonocia)VALUES('D111','AcaDespacho1','+d38-555');
INSERT INTO DESPACHADORES (run_despachador,nombre,fonocia)VALUES('D222','AcaDespacho2','+d38-666');
INSERT INTO DESPACHADORES (run_despachador,nombre,fonocia)VALUES('D333','AcaDespacho3','+d56-555');
INSERT INTO DESPACHADORES (run_despachador,nombre,fonocia)VALUES('D444','AcaDespacho4','+d88-555');
INSERT INTO DESPACHADORES (run_despachador,nombre,fonocia)VALUES('D555','AcaDespacho5','+d77-555');
==> 1 row inserted. (x5)

--PROVEEDORES
INSERT INTO PROVEEDORES (run_proveedor,nombrecia,nombrecontacto,telefono,dire)VALUES ('P111', 'PROVEO1', 'SRAPROVEO1', '+P333', 'AVENIDA MATUCANA 100');
INSERT INTO PROVEEDORES (run_proveedor,nombrecia,nombrecontacto,telefono,dire)VALUES ('P222', 'PROVEO2', 'SRAPROVEO2', '+P222', 'AVENIDA MATUCANA 222');
INSERT INTO PROVEEDORES (run_proveedor,nombrecia,nombrecontacto,telefono,dire)VALUES ('P333', 'PROVEO3', 'SRAPROVEO3', '+P333', 'AVENIDA MATUCANA 333');
INSERT INTO PROVEEDORES (run_proveedor,nombrecia,nombrecontacto,telefono,dire)VALUES ('P444', 'PROVEO4', 'SRAPROVEO4', '+P444', 'AVENIDA MATUCANA 444');
INSERT INTO PROVEEDORES (run_proveedor,nombrecia,nombrecontacto,telefono,dire)VALUES ('P555', 'PROVEO5', 'SRAPROVEO5', '+P555', 'AVENIDA MATUCANA 555');
==> 1 row inserted. (x5)

--DOMICILIO
INSERT INTO DOMICILIO (codpostal,direccion,ciudad,region,pais,viaenvio)VALUES(9170023, 'AVENIDA MATUCANA 100', 'SANTIAGO', 'METROPOLITANA', 'CHILE', 'ACADESPACHO1');
INSERT INTO DOMICILIO (codpostal,direccion,ciudad,region,pais,viaenvio)VALUES(4371034, 'EDUARDO FREI 1320', 'CURANILAHUE', 'BIO-BIO', 'CHILE', 'ACADESPACHO2');
INSERT INTO DOMICILIO (codpostal,direccion,ciudad,region,pais,viaenvio)VALUES(5370000, 'LOS AVELLANOS 333', 'PUERTO OCTAY', 'LOS LAGOS', 'CHILE', 'ACADESPACHO2');
INSERT INTO DOMICILIO (codpostal,direccion,ciudad,region,pais,viaenvio)VALUES(11111, 'Av. San Martin 1203', 'Comallo', 'Río Negro', 'Argentina', 'SIN DESPACHADOR FORMAL');
INSERT INTO DOMICILIO (codpostal,direccion,ciudad,region,pais,viaenvio)VALUES(1340962, 'CALETA BUENA 111', 'TOCOPILLA', 'ANTOFAGASTA', 'CHILE', 'ACADESPACHO4');
==> 1 row inserted. (x5)

--PRODUCTOS (descontinuado.... no existe tipo boolean, por lo que se agrega n° 0descontinuado o 1continuaManufacturacion )
INSERT INTO PRODUCTOS (id_producto,nombreproducto,precio,descontinuado,stock,nombrecategoria)VALUES (1,'PROD1', 9900,1,8, 'BAÑO');
INSERT INTO PRODUCTOS (id_producto,nombreproducto,precio,descontinuado,stock,nombrecategoria)VALUES (2,'PROD2', 2220,1,23, 'DECORACION');
INSERT INTO PRODUCTOS (id_producto,nombreproducto,precio,descontinuado,stock,nombrecategoria)VALUES (3,'PROD3', 5000,1,10, 'COCINA');
INSERT INTO PRODUCTOS (id_producto,nombreproducto,precio,descontinuado,stock,nombrecategoria)VALUES (4,'PROD4', 8000,0,5, 'VESTUARIO');
INSERT INTO PRODUCTOS (id_producto,nombreproducto,precio,descontinuado,stock,nombrecategoria)VALUES (5,'PROD5', 19900,1,8, 'COCINA');
==> 1 row inserted. (x5)

--CATEGORIA
INSERT INTO categoria(nombrecategoria)VALUES('COCINA');
INSERT INTO categoria(nombrecategoria)VALUES('BAÑO');
INSERT INTO categoria(nombrecategoria)VALUES('DECORACION');
INSERT INTO categoria(nombrecategoria)VALUES('VESTUARIO');
INSERT INTO categoria(nombrecategoria)VALUES('MENAJE');
==> 1 row inserted. (x5)

--DETALLE COMPRA
INSERT INTO detallecompra (id_detalle, valorcompra, cantproducto, descuentos,id_ocompra,id_product) VALUES (11, 7200,1,0,1,2);
INSERT INTO detallecompra (id_detalle, valorcompra, cantproducto, descuentos,id_ocompra,id_product) VALUES (12, 7200,1,0,1,3);
INSERT INTO detallecompra (id_detalle, valorcompra, cantproducto, descuentos,id_ocompra,id_product) VALUES (13, 30000,2,9800,2,5);
INSERT INTO detallecompra (id_detalle, valorcompra, cantproducto, descuentos,id_ocompra,id_product) VALUES (14, 3400,2,1000,3,2);
INSERT INTO detallecompra (id_detalle, valorcompra, cantproducto, descuentos,id_ocompra,id_product) VALUES (15, 6100,3,500,4,2);
INSERT INTO detallecompra (id_detalle, valorcompra, cantproducto, descuentos,id_ocompra,id_product) VALUES (16, 4000,2,440,5,2);
==> 1 row inserted. (x5)

--ORDENES COMPRA
insert INTO ordenescompra (id_ordencompra, fecharequerimiento, responsablerequerimiento, totalCOMPRA, id_cliente, nombredestinatario, direEnv, fechaenvio, viaenvio) VALUES (1,TO_DATE('22-01-2022','DD-MM-YYYY'),'v1111-1', 7200,'3333-1', 'CIATRES','LOS AVELLANOS 333',TO_DATE('30-01-2022','DD-MM-YYYY'), 'ACADESPACHO2'); 
insert INTO ordenescompra (id_ordencompra, fecharequerimiento, responsablerequerimiento, totalCOMPRA, id_cliente, nombredestinatario, direEnv, fechaenvio, viaenvio) VALUES (2,TO_DATE('11-10-2021','DD-MM-YYYY'),'5555-1', 30000,'3333-1','CIATRES','LOS AVELLANOS 333', TO_DATE('15-10-2021','DD-MM-YYYY'),'ACADESPACHO2');
insert INTO ordenescompra (id_ordencompra, fecharequerimiento, responsablerequerimiento, totalCOMPRA, id_cliente, nombredestinatario, direEnv, fechaenvio, viaenvio) VALUES (3,TO_DATE('02-02-2022','DD-MM-YYYY'),'v1111-1', 3400,'2222-1', 'CIADOS','EDUARDO FREI 1320', TO_DATE('22-02-2022','DD-MM-YYYY'),'ACADESPACHO2');
insert INTO ordenescompra (id_ordencompra, fecharequerimiento, responsablerequerimiento, totalCOMPRA, id_cliente, nombredestinatario, direEnv, fechaenvio, viaenvio) VALUES (4,TO_DATE('17-01-2022','DD-MM-YYYY'),'5555-1', 6100,'4444-1', 'CIACUATRO','Av. San Martin 1203',TO_DATE('13-02-2022','DD-MM-YYYY'), 'SIN DESPACHADOR FORMAL');
insert INTO ordenescompra (id_ordencompra, fecharequerimiento, responsablerequerimiento, totalCOMPRA, id_cliente, nombredestinatario, direEnv, fechaenvio, viaenvio) VALUES (5,TO_DATE('30-12-2021','DD-MM-YYYY'),'v1111-1', 4000, '5555-1','CIACINCO', 'CALETA BUENA 111',TO_DATE('17-01-2022','DD-MM-YYYY'),'ACADESPACHO4');
==> 1 row inserted. (x5)

SAVEPOINT AFTER_AGREGARinfo;
==> Savepoint created.

--4) consultas
--4a) clientes con compras más altas y en qué ciudad. (para evaluar futuros convenios despachos)
SELECT 
ordenescompra.nombredestinatario,
ORDENESCOMPRA.totalcompra,
ordenescompra.direenvi,
domicilio.ciudad,
domicilio.region
FROM ORDENESCOMPRA JOIN domicilio ON ordenescompra.direenvi=domicilio.direccion
ORDER BY ordenescompra.totalcompra DESC;
==>
NOMBREDESTINATARIO  totalCOMPRA     direEnv             ciudad             region
CiaTres	            30000	      LOS AVELLANOS 333	    PUERTO OCTAY	PUERTO OCTAY
CiaTres	            7200	       LOS AVELLANOS 333	PUERTO OCTAY	PUERTO OCTAY
CiaCuatro	        6100	Av. San Martin 1203	        Comallo	        Río Negro
CiaCinco	        4000	    CALETA BUENA 111	    TOCOPILLA	    ANTOFAGASTA
CiaDos	            3400	    EDUARDO FREI 1320	    CURANILAHUE	    BIO-BIO

--4b)
SELECT 
ordenescompra.nombredestinatario,
ORDENESCOMPRA.totalcompra,
ordenescompra.direenvi,
domicilio.viaenvio,
domicilio.ciudad,
domicilio.region
FROM ORDENESCOMPRA JOIN domicilio ON ordenescompra.direenvi=domicilio.direccion
ORDER BY ordenescompra.totalcompra DESC;
==>
NOMBREDESTINATARIO  totalCOMPRA     direEnv             viaEnvio                 ciudad             region
CiaTres	            30000	      LOS AVELLANOS 333	    ACADESPACHO2	        PUERTO OCTAY	PUERTO OCTAY
CiaTres	            7200	       LOS AVELLANOS 333	ACADESPACHO2	        PUERTO OCTAY	PUERTO OCTAY
CiaCuatro	        6100	Av. San Martin 1203	        SIN DESPACHADOR FORMAL	Comallo	        Río Negro
CiaCinco	        4000	    CALETA BUENA 111	    ACADESPACHO4	        TOCOPILLA	    ANTOFAGASTA
CiaDos	            3400	    EDUARDO FREI 1320	    ACADESPACHO2	        CURANILAHUE	    BIO-BIO