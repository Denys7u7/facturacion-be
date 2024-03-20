create database facturacion;

use facturacion;

create table if not exists T_ORDEN_COMPRA (
	id int auto_increment,
	fecha date,
	total float,
	primary key(id)
);

insert into t_orden_compra (fecha, total) values (now(), 0.0);

select * from t_orden_compra ;

create table if not exists T_PRODUCTO (
	id int auto_increment,
	nombre varchar(100) not null,
	precio float;
	primary key(id)
)

create table if not exists T_DET_ORDEN_COMPRA (
	id int auto_increment,
	t_orden_compra_id int not null,
	t_producto_id int not null,
	primary key(id),
	foreign key (t_orden_compra_id) references T_ORDEN_COMPRA(id),
	foreign key (t_producto_id) references T_PRODUCTO(id)
)


create procedure actualizar_precio(in precio float, in id_producto int)
begin
	update T_PRODUCTO set precio = precio where id = id_producto;
end