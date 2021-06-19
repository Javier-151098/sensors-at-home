create database sensoresHome;

use sensoresHome;

create table usuarios(
	id_usuario int primary key auto_increment not null,
    nombre varchar(45),
    ap_paterno varchar(45),
    ap_materno varchar(45),
    direccion varchar(100),
    num_telefono varchar(10),
    email varchar(45),
    contraseña varchar(15)
);

create table sensor(
	sku int primary key auto_increment not null,
    marca varchar(45),
    lugar_posicion char(1),    
    id_usuario int,
    foreign key(id_usuario) references  usuarios(id_usuario) on update cascade on delete cascade
);

create table tecnico(
	id_tecnico int primary key auto_increment not null,
    nombre_tecnico varchar(45),
    ocupacion_tecnico varchar(45),
    telefono varchar(10),
    email varchar(45)
);

create table usuario_tecnico (
	fecha date,
    descripcion varchar(200),
    id_usuario int,
    id_tecnico int,
    foreign key(id_usuario) references  usuarios(id_usuario) on update cascade on delete cascade,
    foreign key(id_tecnico) references  tecnico(id_tecnico) on update cascade on delete cascade
);

create table tecnico_sensor(
	fecha date,
    descripcion varchar(200),
    sku int,
    id_tecnico int,
    foreign key(sku) references  sensor(sku) on update cascade on delete cascade,
    foreign key(id_tecnico) references  tecnico(id_tecnico) on update cascade on delete cascade
);

