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

Request: <br>
![image](https://github.com/LucianneCharro/fase5/assets/64719344/5a4d7225-e17b-4b04-b551-8116ca5a4bdd) <br>
![image](https://github.com/LucianneCharro/fase5/assets/64719344/401e2556-02a1-4883-acfd-8eaec9043add)
<br><br>
#### 

- `API de validação Token`:

Response:
<br>
![image](https://github.com/LucianneCharro/fase5/assets/64719344/e6d142be-5a80-475c-97ef-c446d794c9f5)


#### 

- `API de autenticação de usuário`: <br>
![image](https://github.com/LucianneCharro/fase5/assets/64719344/07571138-8a2c-4160-b35b-80ad8cfeb0aa)


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
