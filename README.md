O objetivo do sistema desenvolvido é a criação de um CRUD para ordens de serviço.

Tecnologias utilizadas:
- Java 23
- Spring Boot
- Thymeleaf
- PostgreSQL
- HTML/CSS
- Maven

Configuração Banco de Dados:
  Para total funcionamento de programa, crie um banco de dados no PostgreSQL e utilize o arquivo "schema.sql" localizado em "src/main/resources" para criar a tabela. Após isso, modifique o arquivo "application.properties" com os dados de acesso ao seu banco.

Execução do Programa:
  Para executar o programa, existem 2 opções -> Executar a classe "OrdemServicoMainApplication" localizado em "src/main/java/com/ordemServico/ordemServico".
                                             -> Digitar "./mvnw spring-boot:run" no terminal.
  Após executar um dos dois métodos, acesse no navegador "localhost:8080".
