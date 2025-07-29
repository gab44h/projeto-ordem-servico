create table ordem_servico (
	id integer primary key,
	setor varchar(50),
	responsavel_execucao varchar(50),
	codigo_empresa varchar(50),
	nome_contato varchar(50),
	tel_contato varchar(50),
	email_cliente varchar(50),
	tipo_servico varchar(50),
	desc_servico text,
	observacoes text,
	forma_pagamento varchar(50),
	data_abertura date,
	prazo_entrega date,
	val_servico double precision,
	val_desconto double precision
);