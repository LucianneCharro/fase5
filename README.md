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

- `API de autenticação de usuário`: <br><br>
![image](https://github.com/LucianneCharro/fase5/assets/64719344/07571138-8a2c-4160-b35b-80ad8cfeb0aa)


#### 

- `API de criação de categoria`: <br><br>
![image](https://github.com/LucianneCharro/fase5/assets/64719344/370da63c-5481-43ea-9441-82a46fbfa5ac)



- `API de consulta de categorias`: <br><br>
![image](https://github.com/LucianneCharro/fase5/assets/64719344/c91195ed-0ea4-408e-b497-08b887059aff)

- `API de consulta de categorias por id`: <br><br>
![image](https://github.com/LucianneCharro/fase5/assets/64719344/f54ef616-b0d6-4fd7-9d08-b8a736ca6a78)

#### 

- `API de criação de produto`: <br><br>
![image](https://github.com/LucianneCharro/fase5/assets/64719344/c27b9091-d133-477e-a128-51f89f47b130)


- `API de consultar produtos`: <br><br>
![image](https://github.com/LucianneCharro/fase5/assets/64719344/6cdcc47a-34d1-46d4-bf18-2aa0824a551b)


- `API de consultar produtos por id`: <br><br>
![image](https://github.com/LucianneCharro/fase5/assets/64719344/4e777ccb-e0ad-4849-83b4-01d838bade43)


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
