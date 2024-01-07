# **Descrição do Repositório**

Este repositório apresenta um projeto simples de CRUD (Create, Read, Update, Delete) desenvolvido em Java, utilizando o banco de dados MySQL e a biblioteca JDBC para interação com o banco de dados. O design do projeto segue o padrão de projetos DAO (Data Access Object), proporcionando uma separação eficiente entre a lógica de negócios e o acesso aos dados.

## **Funcionalidades:**

1. **Operações CRUD:**
    - **Create (Criação):** Adição de novos registros tanto para entidade Seller quanto para Department.
    - **Read (Leitura):** Consulta e exibição de informações sobre Sellers e Departments.
    - **Update (Atualização):** Modificação de dados existentes para entidade Seller e Department.
    - **Delete (Exclusão):** Remoção de registros de Seller e Department.
2. **Entidades:**
    - **Seller:** Representa informações relacionadas a vendedores, incluindo detalhes como nome, salário, etc.
    - **Department:** Representa informações sobre departamentos, como nome.
3. **Padrão de Projetos DAO:**
    - O código segue o padrão DAO para separar as operações de acesso ao banco de dados das regras de negócios. Isso facilita a manutenção, escalabilidade e entendimento do código.

## **Tecnologias Utilizadas:**

- **Java:** Linguagem de programação principal.
- **MySQL:** Banco de dados utilizado para armazenar os dados.
- **JDBC (Java Database Connectivity):** Biblioteca Java para interação com o banco de dados.

## **Como Utilizar:**

1. Clone o repositório para sua máquina local.
2.  Crie o arquivo chamado “db.properties” na raiz projeto e configure as credenciais do banco de dados. Ex:. 
    - user= seuUserNameDeAcessoABase
    - password=suaSenhaDeAcessoABase
    - dburl=urlDeAcessoABase
    - useSSL=false
    
4. Execute o programa principal para interagir com as operações CRUD.

Este projeto oferece uma base sólida para iniciantes que desejam entender e praticar conceitos essenciais de persistência de dados em Java, aplicando boas práticas de design de software. Sinta-se à vontade para contribuir, reportar problemas ou utilizar este projeto como ponto de partida para suas próprias aplicações.
