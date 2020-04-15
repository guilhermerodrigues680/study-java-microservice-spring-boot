# Estudos sobre microserviço em Java usando o Spring Boot

### Quickstart

[Eclipse IDE for Enterprise Java Developers (includes Incubating components)](https://www.eclipse.org/downloads/packages/)  

- Vá no https://spring.io/quickstart e gere o projeto base  
- Extraia o arquivo zip para alguma pasta
- Abra o Eclipe IDE
- File >> Import >> "Maven > Exiting Maven Project" >> 
  Em Root Directory coloque o endereco da raiz do projeto (onde há o aqruivo pom.xml) >> Finish
- Neste arquivo a funcao principal "main()" se encontra em `src/main/java/com/example/demo/DemoApplication.java`

- Para executar o projeto entre na raiz (onde há o arquivo pom.xml) e execute: `./mvnw spring-boot:run` ou 
`mvnw spring-boot:run` se for windows.

- Pelo eclipse é possivel a execucao da aplicacao tambem, basta clicar com o botao direito sobre o 
  `DemoApplication.java` e ir em "Run As >> Java Aplicattion"


### Docker

- https://spring.io/guides/gs/spring-boot-docker/
- Gere o compilado jar com: `./mvnw package`
- Teste a execucao localmente com: `java -jar target/demo-0.0.1-SNAPSHOT.jar`
- Consulte o dockerfile na documentacao ofical (Já esta incluso neste repositorio)
- Gere a imagem `docker build -t springio/gs-spring-boot-docker .`
- Execute a imagem com comandos padroes do Docker

**Docker-compose**

- `docker-compose up`

### Links

[Implementação de MicroServices com Java EE ou Spring - Programação / Arquitetura - GUJ](https://www.guj.com.br/t/implementacao-de-microservices-com-java-ee-ou-spring/324776/2)

[Microservices - java ee vs spring boot and spring cloud](https://www.slideshare.net/BenWilcock1/microservices-java-ee-vs-spring-boot-and-spring-cloud)

[Which Java Microservice Framework Should You Choose in 2020?](https://medium.com/better-programming/which-java-microservice-framework-should-you-choose-in-2020-4e306a478e58)

