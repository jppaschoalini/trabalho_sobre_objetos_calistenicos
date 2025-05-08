

//Exemplo antes de usar Objetos Calistrnicos (violando a regra):

public class PedidoService {
    public void processar(Pedido pedido) {
        String cidade = pedido.getCliente().getEndereco().getCidade();
        System.out.println("Processando pedido para cidade: " + cidade);
    }
}






//Exemplo depois de usar Objetos Calistrnicos (respeitando a regra):

public class Pedido {
    private Cliente cliente;

    public String getCidadeDoPedido() {
        return cliente.getCidade();
    }
}

public class Cliente {
    private Endereco endereco;

    public String getCidade() {
        return endereco.getCidade();
    }
}

public class Endereco {
    private String cidade;

    public String getCidade() {
        return cidade;
    }
}

public class PedidoService {
    public void processar(Pedido pedido) {
        String cidade = pedido.getCidadeDoPedido();
        System.out.println("Processando pedido para cidade: " + cidade);
    }
}