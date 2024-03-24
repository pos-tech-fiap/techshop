-- Criar database
-- CREATE DATABASE mspayment;

-- Conectar ao database
\c mspayment;

CREATE TABLE tb_payment (
    id serial PRIMARY KEY,
    status VARCHAR(255) not null,
    method VARCHAR(255) not null,
    user_id BIGINT not null,
    value double precision not null
);
