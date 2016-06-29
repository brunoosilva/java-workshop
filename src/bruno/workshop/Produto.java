package bruno.workshop;

public class Produto {

    String nome;
    Integer quantidade;
    Integer quantidadeMinima = 10;

    public Produto(String nome, Integer quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }
}
