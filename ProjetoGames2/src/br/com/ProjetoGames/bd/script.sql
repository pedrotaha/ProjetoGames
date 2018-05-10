create table if not exists tbUsuarios(
 id serial primary key not null,
 nome varchar(40) not null,
 cpf char(14) not null,
 telefone varchar(13) not null,
 email varchar(40) not null,
 sexo varchar(9) not null,
 dataNasc date not null,
 login varchar(40) not null,
 senha varchar(40) not null,
 dataCadastro date not null,
 idTipo integer not null,
 constraint fk_tbusuarios_tbtipousuarios foreign key (idTipo) references tbTipoUsuarios
);

create table if not exists tbFuncionarios(
 idUsuario integer primary key not null,
 salario float not null,
 cargo varchar(40) not null,
 cargaHoraria varchar(40) not null,
 estadoCivil varchar(10) not null,
 constraint fk_tbfuncionarios_tbusuarios foreign key (idUsuario) references tbUsuarios
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
 estado varchar(20) not null,
 situacao varchar(20) not null,
 descricao varchar(900) not null,
 plataforma varchar(13) not null,
 dataLancamento date not null,
 publisher varchar(40) not null,
 faixaEtaria varchar(10) not null,
 imagem bytea not null
);

create table if not exists tblocacao(
 idLocacao serial primary key not null,
 idCli integer not null,
 idFunc integer not null,
 --idJogo integer not null,
 dataLocacao date not null,
 hora time not null,
 dataDevolucao date not null,
 valor float not null,
 formaPagamento varchar(40) not null,
 constraint fk_tblocacao_tbusuario foreign key (idCli) references tbUsuarios,
 constraint fk_tblocacao_tbfuncionario foreign key (idFunc) references tbFuncionarios
 --,constraint fk_tblocacao_tbjogos foreign key (idJogo) references tbJogos
);

create table if not exists tbvendas(
 idVenda serial primary key not null,
 idCli integer not null,
 idFunc integer not null,
 --idJogo integer not null,
 dataCompra date not null,
 hora time not null,
 valor float not null,
 formaPagamento varchar(40) not null,
 tipo varchar(20) not null,
 constraint fk_tblocacao_tbusuario foreign key (idCli) references tbUsuarios,
 constraint fk_tblocacao_tbfuncionario foreign key (idFunc) references tbFuncionarios
 --,constraint fk_tblocacao_tbjogos foreign key (idJogo) references tbJogos
);

create table if not exists tbendereco(
 idUsuario integer primary key not null,
 pais varchar(40) not null,
 estado char(40) not null,
 cidade varchar(40) not null,
 bairro varchar(40) not null,
 rua varchar(40) not null,
 numero integer not null,
 cep varchar(9) not null,
 complemento varchar(40) null,
 constraint fk_tbendereco_tbusuario foreign key (idUsuario) references tbUsuarios
);

create table if not exists tbQuantidade(
 idJogo integer primary key not null,
 quantidadeAlugar integer not null,
 quantidadeVender integer not null,
 valorAlugar float not null,
 valorVender float not null,
 constraint fk_tbQuantidade_tbJogos foreign key (idJogo) references tbJogos
 );

create table if not exists tbJogoVend(
 idVenda integer not null,
 idJogo integer not null,
 quantidade integer not null,
 constraint fk_tbProdComp_tbvendas foreign key (idVenda) references tbvendas
);

create table if not exists tbJogoLocad(
 idLocacao integer not null,
 idJogo integer not null,
 quantidade integer not null,
 constraint fk_tbProdComp_tblocacao foreign key (idLocacao) references tblocacao
);
 
 insert into tbtipousuarios (descricao, nivel) values ('Cliente',0);
 insert into tbtipousuarios (descricao, nivel) values ('Funcionario',1);
 insert into tbtipousuarios (descricao, nivel) values ('Administrador',2);
 select * from tbtipousuarios
 Select * from tbtipousuarios order by descricao