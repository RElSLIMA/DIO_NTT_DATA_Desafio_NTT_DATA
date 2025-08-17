# Projeto Catálogo e Pedidos Spring Boot

Este projeto simula um sistema de catálogo de produtos e pedidos utilizando Spring Boot. Ele contém dois microsserviços independentes que se comunicam via HTTP, com API Gateway e Service Discovery.  

## Microsserviços

1. **catalogo-service**: Lista produtos e detalhes por ID.  
2. **pedido-service**: Cria pedidos e lista pedidos existentes.  
3. **gateway-service**: Centraliza as requisições dos microsserviços.

## Como rodar

- Cada serviço pode ser iniciado com:  
```bash
mvn spring-boot:run
