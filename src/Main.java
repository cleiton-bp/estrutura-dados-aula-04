public class Main {
    public static void main(String[] args) {
        VetorClientes vetorClientes = new VetorClientes(20);

        // Adiciona 30 clientes (trata o caso de exceder a capacidade do vetor)
        for (int i = 1; i <= 30; i++) {
            if (i > 20) {
                System.out.println("Não é possível adicionar mais clientes. Capacidade máxima atingida.");
                break;
            }
            Cliente cliente = new Cliente("Cliente" + i, "12345" + i, "cliente" + i + "@exemplo.com");
            vetorClientes.adicionar(cliente);
        }

        System.out.println("Todos os clientes:");
        System.out.println(vetorClientes.listarClientes());

        Cliente clienteAlterado = new Cliente("Cliente Alterado", "987654321", "alterado@exemplo.com");
        vetorClientes.alterar(0, clienteAlterado);
        System.out.println("Após alteração:");
        System.out.println(vetorClientes.listarClientes());

        vetorClientes.excluir(1);
        System.out.println("Após exclusão:");
        System.out.println(vetorClientes.listarClientes());

        Cliente clienteBuscado = vetorClientes.buscarPorNome("Cliente Alterado");
        System.out.println("Cliente buscado:");
        System.out.println(clienteBuscado);

        String dominio = "@exemplo.com";
        System.out.println("Clientes com domínio " + dominio + ":");
        System.out.println(vetorClientes.filtrarPorDominioEmail(dominio));
    }
}