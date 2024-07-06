# PedidoService

## Descrição

O PedidoService é um aplicativo Java Spring Boot simples que simula a criação de pedidos e calcula o valor final aplicando descontos e taxas de frete com base no valor do pedido. Ele utiliza injeção de dependência para gerenciar serviços de cálculo de pedidos e frete.

## Estrutura do Projeto

- **PedidoserviceApplication**: Classe principal que inicializa o aplicativo Spring Boot e contém a lógica de interação com o usuário.
- **Pedido**: Entidade que representa um pedido, contendo código, valor e desconto.
- **PedidoService**: Serviço que calcula o valor final do pedido, aplicando o desconto como porcentagem.
- **FreteService**: Serviço que calcula o valor do frete com base em faixas de valor do pedido.

## Funcionalidades

- Inserção do número do pedido.
- Inserção do valor do pedido.
- Inserção do percentual de desconto.
- Cálculo do valor final do pedido com o desconto aplicado.
- Cálculo do frete baseado nas faixas de valor do pedido.
- Exibição do valor final do pedido, valor do frete e total com frete.

## Lógica de Frete

- Pedidos abaixo de R$ 100,00 têm uma taxa de frete de R$ 20,00.
- Pedidos de R$ 100,00 até R$ 199,99 têm uma taxa de frete de R$ 12,00.
- Pedidos de R$ 200,00 ou mais têm frete grátis.

## Como Executar

1. **Clone o repositório**:
   ```sh
   git clone https://github.com/seu-usuario/pedidoservice.git
   ```

2. **Navegue até o diretório do projeto**:
   ```sh
   cd pedidoservice
   ```

3. **Compile e execute o projeto**:
   ```sh
   ./mvnw spring-boot:run
   ```

4. **Siga as instruções no console para inserir os detalhes do pedido**.

## Exemplo de Uso

```sh
============================================================
============ Seja Bem vindo ao PedidoService! ==============
============================================================

============================================================
=============== Digite o numero do pedido: =================
============================================================
1
============================================================
================ Digite o valor do pedido: =================
============================================================
150.00

============================================================
================ Digite o percentual de desconto: ==========
============================================================
10.0
============================================================
================ Valor Final do Pedido: ====================
============================================================
Valor Final (com desconto): 135.00
Frete: 12.00
Total com Frete: 147.00
```

## Requisitos

- Java 11 ou superior
- Maven

## Dependências

- Spring Boot Starter Web
- Spring Boot Starter

## Contribuição

1. Faça um fork do projeto.
2. Crie uma nova branch (`git checkout -b feature/nova-funcionalidade`).
3. Faça commit das suas alterações (`git commit -m 'Adiciona nova funcionalidade'`).
4. Faça push para a branch (`git push origin feature/nova-funcionalidade`).
5. Abra um Pull Request.
