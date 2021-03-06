﻿create table if not exists tbUsuarios(
 id serial primary key not null,
 nome varchar(40) not null,
 cpf char(14) not null,
 telefone varchar(13) not null,
 email varchar(40) not null,
 sexo varchar(9) not null,
 dataNasc varchar(12) not null, -- date
 login varchar(40) not null,
 senha varchar(300) not null,
 dataCadastro varchar(12) not null, -- date
 idTipo integer not null references tbTipoUsuarios ON DELETE CASCADE
);

create table if not exists tbFuncionarios(
 idUsuario integer primary key not null references tbUsuarios ON DELETE CASCADE,
 salario float not null,  -- numeric(15,2)
 cargo varchar(40) not null,
 cargaHoraria varchar(40) not null,
 estadoCivil varchar(30) not null
);

create table if not exists tbTipoUsuarios(
  idTipo serial primary key not null,
  descricao varchar(20) NOT NULL,
  nivel integer NOT NULL
);

create table if not exists tbJogos(
 idJogos serial primary key not null,
 titulo varchar(40) not null,
 genero varchar(40) not null,
 --estado varchar(20) not null, --não será controlado
 --situacao varchar(20) not null, --controlada pela operacao
 descricao varchar(900) not null,
 plataforma varchar(40) not null,
 dataLancamento varchar(12) not null,
 publisher varchar(40) not null,
 faixaEtaria varchar(10) not null,
 imagem bytea not null
);

create table if not exists tblocacao(
 idLocacao serial primary key not null,
 idCli integer not null references tbUsuarios ON DELETE CASCADE,
 idFunc integer not null references tbFuncionarios,
 --idJogo integer not null,
 dataLocacao varchar(12) not null,
 hora varchar(12) not null,
 dataDevolucao varchar(12) not null,
 valor float not null,  -- numeric(15,2)
 formaPagamento varchar(40) not null, --cupom?
desconto integer
 --,constraint fk_tblocacao_tbjogos foreign key (idJogo) references tbJogos
);

create table if not exists tbvendas(
 idVenda serial primary key not null,
 idCli integer not null references tbUsuarios ON DELETE CASCADE,
 --idFunc integer not null references tbFuncionarios ON DELETE CASCADE, --remove not null
 --idJogo integer not null,
 dataCompra varchar(12) not null,
 hora varchar(12) not null,
 valor numeric(15,2) not null, --float not null, -- numeric(15,2)
 formaPagamento varchar(100) not null,
 tipo varchar(20) not null, --cupom?
 desconto integer
 --,constraint fk_tblocacao_tbjogos foreign key (idJogo) references tbJogos
);

create table if not exists tbendereco(
 idUsuario integer primary key not null references tbUsuarios ON DELETE CASCADE,
 pais varchar(40) not null,
 estado char(40) not null,
 cidade varchar(40) not null,
 bairro varchar(40) not null,
 rua varchar(40) not null,
 numero integer not null,
 cep varchar(9) not null,
 complemento varchar(40) null
);

create table if not exists tbQuantidade(
 idJogo integer primary key not null references tbJogos ON DELETE CASCADE,
 quantidadeAlugar integer not null,
 quantidadeVender integer not null,
 valorAlugar float not null,  -- numeric(15,2)
 valorVender float not null   -- numeric(15,2)
 );

create table if not exists tbJogoVend(
 idVenda integer not null references tbvendas ON DELETE CASCADE,
 idJogo integer not null references tbjogos ON DELETE CASCADE,
 quantidade integer not null
);

create table if not exists tbJogoLocad(
 idLocacao integer not null references tblocacao ON DELETE CASCADE,
 idJogo integer not null references tbjogos ON DELETE CASCADE,
 quantidade integer not null,
 status integer not null -- 0 - devolvido, 1 - locado
);

create table if not exists tbPlataformas(
 idplataforma serial not null primary key,
 nomeplataforma varchar(50) not null,
 dataLancamento varchar(12) not null
);

create table if not exists tbCupons(
 idCupom serial not null primary key,
 nomeCupom varchar(50) not null,
 percent integer not null
);

create table if not exists tbCuponsAtivados(
 idCupom integer not null references tbCupons ON DELETE CASCADE,
 idCli integer not null references tbUsuarios ON DELETE CASCADE
);

select * from tbusuarios;
 insert into tbtipousuarios (descricao, nivel) values ('Cliente',0);
 insert into tbtipousuarios (descricao, nivel) values ('Funcionario',1);
 insert into tbtipousuarios (descricao, nivel) values ('Administrador',2);
 select * from tbtipousuarios
 Select * from tbtipousuarios order by descricao

truncate table tbusuarios; 
ALTER SEQUENCE tbusuario_id_seq RESTART WITH 1;

truncate table tbCuponsAtivados;
drop table if exists tbjogovend_tmp1;
select * from tbjogovend_tmp2;
truncate table tbjogovend_tmp2 if exists;
SELECT EXISTS (
   SELECT 1
   FROM   information_schema.tables
   WHERE  table_schema = 'public'
   AND    table_name = 'tbjogovend_tmp1'
   );

ALTER TABLE tblocacao ADD COLUMN desconto integer;

ALTER TABLE tbJogoLocad ADD COLUMN status integer;