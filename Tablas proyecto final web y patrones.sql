create database BookGeekShop;
use BookGeekShop;

create user 'usuario_practica'@'%' identified by 'la_Clave';
grant all privileges on BookGeekShop.* to  'usuario_practica'@'%';
flush privileges;
drop user usuario_practica;

create table empleado
(id_empleado int primary key auto_increment not null,
nombre varchar(20) not null,
primer_apellido varchar(30) not null,
segundo_apellido varchar(30) not null,
correo varchar(25) not null,
telefono varchar(25) not null,
puesto varchar (20) not null,
antiguedad varchar(10)not null);

create table cliente 
(id_cliente int primary key auto_increment not null,
nombre varchar(20) not null,
primer_apellido varchar(30) not null,
segundo_apellido varchar(30) not null,
correo varchar(25) not null,
telefono varchar(25) not null);

create table novelaGrafica 
(id_novelaG int primary key auto_increment not null,
nombre varchar(30) not null,
tipo varchar(30) not null,
autor varchar(30) not null,
editorial varchar(30) not null,
fecha_publicacion date not null,
cantidad int not null,
precio decimal not null);

create table libro 
(id_libro int primary key auto_increment not null,
nombre varchar(50) not null,
autor varchar(30) not null,
editorial varchar(30) not null,
fecha_publicacion date not null,
cantidad int not null,
precio decimal not null);

insert into empleado (id_empleado,nombre,primer_apellido,segundo_apellido,correo,telefono,puesto,antiguedad)
values
(1,'Carlos','Perez','Duran','cperez@gmail.com','8456-7120','Gerente general','5 años'),
(2,'Teresa','Murillo','Fernandez','tmurrilo@gmail.com','6490-7831','Cajero','2 años'),
(3,'Pedro','Muñoz','Solis','pmuñoz@gmail.com','7251-9086','Cajero','5 meses');

insert into cliente (id_cliente,nombre,primer_apellido,segundo_apellido,correo,telefono)
values
(1,'Gloriana','Guevara','Vargas','gguevara@gmail.com','4114-7565'),
(2,'Elena','Gutiérrez','Campos','egutierrez@gmail.com','6129-5146'),
(3,'Maureen','Fonseca','Quiros','mfonseca@gmail.com','8118-9492');

insert into libro(id_libro,nombre,autor,editorial,fecha_publicacion,cantidad,precio)
values
(1,'Maze Runner Correr o Morir','James Dashner','V&R','20090106',3,12800.00),
(2,'Divergente','Veronica Roth','RBA','20110426',1,10800.00),
(3,'El Hobbit','J.R.R. Tolkien','Booket','19370109',5,10800.00);

insert into novelaGrafica(id_novelaG,nombre,tipo,autor,editorial,fecha_publicacion,cantidad,precio)
values
(1,'V For Vendetta','Comic estadounidense','Alan Moore & David Lloyd','Vertigo','20081024',3,21000.00),
(2,'Flashpoint','Comic estaunidense','Geoff Johns et al.','DC Comics','20120313',1,1450.00),
(3,'Steins;Gate Vol 1','Manga Japones','Yomi Sarachi','Kamite','20151110',5,7200.00);

select * from empleado;

select * from cliente;

select * from libro;

select * from novelaGrafica;