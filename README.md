## Resumo do projeto
- Projeto realizado no curso POSTECH da FIAP, visando a entrega de um sistema e-commerce com APIs para cadastro, autenticação e autorização de Usuários, além da gestão de produtos e suas respectivas categorias.
  Serão construidas APIs que um portal poderá consumir para controle de acesso de usuários e gestão de produtos. 

## 🔨 Funcionalidades do projeto nessa quinta fase
- `Funcionalidade 1` `3 API de controle de usuário`: A API tem como objetivo permitir o cadastro de um novo usuário, validação de token e autorização em nosso sistema. 
#### 
- `Funcionalidade 2` `4 API de gestão de produtos`: A API tem como objetivo permitir o controle dos produtos no sistema. 
  Receber informações através do Controller em formato HTTP POST/GET/PUT.
#### 
- `Funcionalidade 3` `4 API de gestão de categorias`: A API tem como objetivo permitir o controle das categorias no sistema.
  Receber informações através do Controller em formato HTTP POST/GET/PUT.

## ✔️ Técnicas e tecnologias utilizadas

- ``Java 18``
- ``InteliJ IDEA``
- ``Testes via INSONMIA``
- ``framework Spring boot, Spring Security``
- ``Persistencia Banco de dados``

## 🛠️ Exemplo Json/Rotas de cada API

Em anexo estão as collections do Insomnia.

1. #### Request/Response:

- `API de criação usuário`:

Request:
  {
  "id":1235,
  "name": "luis",
  "username": "ballico7",
  "password": "10101010",
  "repetedPassword":"10101010"
  }

Response:
  {
  "id": 3,
  "username": "ballico7",
  "name": "ballico7",
  "role": "ROLE_CUSTOMER",
  "jwt": "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYWxsaWNvNyIsImlhdCI6MTcxMTMxNTE4NSwiZXhwIjoxNzExMzE1MzY1LCJyb2xlIjoiUk9MRV9DVVNUT01FUiIsIm5hbWUiOiJiYWxsaWNvNyIsImF1dGhvcml0aWVzIjpbeyJhdXRob3JpdHkiOiJSRUFEX01ZX1BST0ZJTEUifV19.sJGo24ljnIFzSIDpjLkyJdF_DfJq2ERHKl-OIKtSIog"
  }

#### 

- `API de validação Token`:

Response:
true

#### 

- `API de autenticação de usuário`:

Request:
{
"username": "ballico7",
"password": "10101010"
}

Response:
{
"jwt": "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYWxsaWNvNyIsImlhdCI6MTcxMTMxNTIxMCwiZXhwIjoxNzExMzE1MzkwLCJyb2xlIjoiUk9MRV9DVVNUT01FUiIsIm5hbWUiOiJiYWxsaWNvNyIsImF1dGhvcml0aWVzIjpbeyJhdXRob3JpdHkiOiJSRUFEX01ZX1BST0ZJTEUifV19.20AAMNYSgVx58z_FGhn1WoSD4ZGCGsKTwssQxoYbwW8"
}

#### 

- `API de criação de categoria`:

Request:
{
"name": "lu",
"status":"ENABLED",
"categoryId": "ENABLED"
}

Response:
{
"id": 4,
"name": "lu",
"status": "ENABLED"
}

#### 

- `API de consulta de categoria`:

Response:

	"content": [
		{
			"id": 1,
			"name": "Eletronica",
			"status": "ENABLED"
		}
	],
	"pageable": {
		"pageNumber": 0,
		"pageSize": 20,
		"sort": {
			"empty": true,
			"sorted": false,
			"unsorted": true
		},
		"offset": 0,
		"paged": true,
		"unpaged": false
	},
	"last": true,
	"totalPages": 1,
	"totalElements": 4,
	"size": 20,
	"number": 0,
	"sort": {
		"empty": true,
		"sorted": false,
		"unsorted": true
	},
	"first": true,
	"numberOfElements": 4,
	"empty": false
}

#### 

- `API de criação de produto`:

Request:
{
"name": "xx",
"price": 10.0,
"categoryId": 1
}

Response:
{
"id": 8,
"name": "xx",
"price": 10.0,
"status": "ENABLED",
"category": null
}

#### 

- `API de consulta de produto`:

Response:

{
"content": [

{
"id": 8,
"name": "lu",
"price": 10.00,
"status": "ENABLED",
"category": null
}
],
"pageable": {
"pageNumber": 0,
"pageSize": 20,
"sort": {
"empty": true,
"sorted": false,
"unsorted": true
},
"offset": 0,
"paged": true,
"unpaged": false
},
"last": true,
"totalPages": 1,
"totalElements": 8,
"size": 20,
"number": 0,
"sort": {
"empty": true,
"sorted": false,
"unsorted": true
},
"first": true,
"numberOfElements": 8,
"empty": false
}

2. #### Rotas de cada API:
- `API de criação usuário`: http://localhost:9191/api/v1/customers
- `API de validação Token`: http://localhost:9191/api/v1/auth/validate-token
- `API de autenticação de usuário`: http://localhost:9191/api/v1/auth/authenticate
- `API de criação de categoria`: http://localhost:9191/api/v1/categories
- `API de consulta de categoria`: http://localhost:9191/api/v1/categories
- `API de criação de produtos`: http://localhost:9191/api/v1/products
- `API de consulta de produtos`: http://localhost:9191/api/v1/products
- 
## 🎯 Desafios encontrados:
- Aplicar técnicas do Spring Security.
-
## 📁 Acesso ao projeto
Você pode acessar os arquivos do projeto clicando [aqui](https://github.com/LucianneCharro/fase5).
