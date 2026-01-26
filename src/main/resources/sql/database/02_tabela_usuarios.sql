use lavacao;

create table tbusuarios(
iduser int primary key,
usuario varchar(50) not null,
fone varchar(15),
login varchar(15) not null unique,
senha varchar(15) not null,
perfil varchar(20) not null default 'user'
);

describe tbusuarios;

insert into tbusuarios(iduser,usuario,fone,login,senha,perfil)
values(1,'Administrador','9999-9999','admin','admin','admin');

select * from tbusuarios;