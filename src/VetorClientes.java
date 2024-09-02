public class VetorClientes {
    private Cliente[] clientes;
    private int tamanho;

    // Construtor
    public VetorClientes(int capacidade) {
        clientes = new Cliente[capacidade];
        tamanho = 0;
    }

    // Adiciona um cliente ao vetor
    public void adicionar(Cliente cliente) {
        if (tamanho < clientes.length) {
            clientes[tamanho++] = cliente;
        } else {
            System.out.println("Vetor está cheio! Não é possível adicionar mais clientes.");
        }
    }

    // Listar todos os clientes
    public String listarClientes() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tamanho; i++) {
            sb.append(clientes[i].toString()).append("\n");
        }
        return sb.toString();
    }

    // Buscar cliente pelo nome
    public Cliente buscarPorNome(String nome) {
        for (int i = 0; i < tamanho; i++) {
            if (clientes[i].getNome().equalsIgnoreCase(nome)) {
                return clientes[i];
            }
        }
        return null;
    }

    // Filtrar clientes por domínio de email
    public String filtrarPorDominioEmail(String dominio) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tamanho; i++) {
            if (clientes[i].getEmail().endsWith(dominio)) {
                sb.append(clientes[i].toString()).append("\n");
            }
        }
        return sb.toString();
    }

    // Alterar cliente em uma posição específica
    public void alterar(int index, Cliente cliente) {
        if (index >= 0 && index < tamanho) {
            clientes[index] = cliente;
        } else {
            System.out.println("Índice fora dos limites!");
        }
    }

    // Excluir cliente em uma posição específica
    public void excluir(int index) {
        if (index >= 0 && index < tamanho) {
            for (int i = index; i < tamanho - 1; i++) {
                clientes[i] = clientes[i + 1];
            }
            clientes[tamanho - 1] = null;
            tamanho--;
        } else {
            System.out.println("Índice fora dos limites!");
        }
    }
}
