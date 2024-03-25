# TECHSHOP
Aplicação web de um sistema de e-commerce.

## Produtos
Este microsserviço permite adicionar, atualizar e deletar produtos, assim como exibir um produto específico ou listar todos os produtos existentes. 

## Usuários
A aplicação também permite adicionar usuários ao sistema, assim como buscar usuários específicos. É possível também favoritar produto para um usuário e listar seus produtos favoritos.

## Pedidos
A aplicação oferece um endpoint com um relatório geral do sistema, exibindo o número total de pedidos ou de um pedido específico.

##Pagamento
A aplicação também dispões de opções de pagamento para o usuário, possibilitando a escolha entre: boleto, cartão de crédito, cartão de débito e pix.

## Desenvolvimento
Para subir o banco de dados localmente, é necessário o docker instalado. Para subir, usamos o seguinte comando no terminal

`docker-compose up`

Em caso de falha do docker-compose rodar separadamente os comandos:

`docker run -p 27017:27017 --name mongodb-reactive-container -d mongo`

`docker build -f ./ms_order/Dockerfile.app -t ms-order-local ./ms_order`
`docker run -p 8082:8082 -v $(pwd):/ms_order/ ms-order-local`

`docker build -t ms-product-local -f ./ms_product/Dockerfile.app ./ms_product`
`docker run -p 8084:8084 -v $(pwd):/ms_product/ ms-product-local`
`docker build -t ms-product-db-local -f ./ms_product/Dockerfile.database ./ms_product`
`docker run -p 5431:5432 -v $(pwd):/ms_product/ ms-product-db-local`

`docker build -t ms-payment-local -f ./ms_payment/Dockerfile.app ./ms_payment`
`docker run -p 8083:8083 -v $(pwd):/ms_payment/ ms-payment-local`
`docker build -t ms-payment-db-local -f ./ms_payment/Dockerfile.database ./ms_payment`
`docker run -p 5433:5432 -v $(pwd):/ms_payment/ ms-payment-db-local`

`docker build -t ms-user-local -f ./ms_user/Dockerfile.app ./ms_user`
`docker run -p 8080:8080 -v $(pwd):/ms_user/ ms-user-local`
`docker build -t ms-user-db-local -f ./ms_user/Dockerfile.database ./ms_user`
`docker run -p 5434:5432 -v $(pwd):/ms_user/ ms-user-db-local`


## Endereços da API
No link abaixo são listados os endpoints disponíveis na aplicação:

[TECHSHOP](https://documenter.getpostman.com/view/15692045/2sA35BcQ2b)
