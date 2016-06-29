package bruno.workshop;

public class Venda {
    String cliente;
    Produto produto;
    Integer quantidadeVendida;

    public Venda(String cliente, Produto produto, Integer quantidadeVendida){
        this.cliente = cliente;
        this.produto = produto;
        this.quantidadeVendida = quantidadeVendida;
    }

}
