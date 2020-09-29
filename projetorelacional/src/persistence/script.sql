create database BDontheline;

use BDontheline;

create table cliente(idCliente int primary key auto_increment,
 nome varchar(50),
 email varchar(50));
 
 create table endereco(idEndereco int primary key auto_increment,
 logradouro varchar(50),
 bairro varchar (50),
 cidade varchar(50),
 estado varchar (20),
 cep varchar (25),
 id_cliente int, 
 foreign key(id_cliente) references cliente(idCliente)
 );
 
 desc cliente;
 desc endereco;
 
 
 ALTER USER 'root'@'localhost' indentified WITH mysql_native_password BY 'fabiana';
 
 ALTER USER 'root'@'localhost' IDENTIFIED BY 'fabiana'