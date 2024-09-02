# Projeto de Vetor de Clientes

Este projeto implementa uma estrutura de dados para armazenar e manipular objetos do tipo `Cliente` utilizando um vetor fixo. O projeto inclui a criação de uma classe `Cliente`, uma classe `VetorClientes` para gerenciar os clientes, e uma classe `Main` para demonstrar o uso das funcionalidades.

## Estrutura do Projeto

O projeto é composto por três classes principais:

1. **Cliente**: Representa um cliente com atributos como nome, telefone e email.
2. **VetorClientes**: Gerencia um vetor fixo de clientes e fornece métodos para adicionar, listar, buscar, filtrar, alterar e excluir clientes.
3. **Main**: Demonstra o uso das funcionalidades da classe `VetorClientes` e realiza operações de exemplo.

### Classe Cliente

**Atributos:**
- `nome`: Nome do cliente.
- `telefone`: Telefone do cliente.
- `email`: Email do cliente.

**Métodos:**
- Construtor para inicializar os atributos.
- Getters e Setters para acessar e modificar os atributos.
- Método `toString` que retorna uma string com detalhes do cliente.