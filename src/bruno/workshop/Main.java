package bruno.workshop;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        ArrayList<Venda> listaVenda = new ArrayList<>();

        Produto produto = new Produto("Coca cola", 20);
        Venda venda = new Venda("Jose", produto, 5);
        listaVenda.add(venda);

        Venda venda2 = new Venda("Maria", produto, 5);
        listaVenda.add(venda2);

        Integer totalVendas = 0;
        for(Venda item : listaVenda){
            System.out.println(item.cliente + " comprou " + item.quantidadeVendida + " " + item.produto.nome);

            totalVendas += item.quantidadeVendida;
        }

        Integer sobraEstoque = produto.quantidade - totalVendas;
        if(sobraEstoque <= produto.quantidadeMinima) {
            System.out.println("Você precisa comprar mais " + produto.nome + " para seu estoque. Você só tem " + sobraEstoque + " itens no estoque");
        } else {
            System.out.println("Vende que o estoque tá cheio. =)");
        }
    }
}
