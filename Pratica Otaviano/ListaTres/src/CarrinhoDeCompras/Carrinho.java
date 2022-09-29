package CarrinhoDeCompras;

public class Carrinho {
    public static void main(String[] args) {
        Lista carrinho = new Lista(10);

        Item um = new Item(8, 2.50, "Tomate", "Valor por Kg");
        Item dois = new Item(5, 3.00, "Maça", "Valor por Kg");
        Item tres = new Item(2, 15.50, "Arroz", "Valor por Pacote");
        Item quatro = new Item(10, 1.10, "Salsinha", "Valor por Pacote");
        Item cinco = new Item(3, 5.25, "Mamão", "Valor por Kg");
        Item seis = new Item(7, 2.00, "Laranja", "Valor por Kg");
        Item sete = new Item(4, 8.99, "Sal", "Valor por Pacote");
        Item oito = new Item(1, 25.00, "Feijão", "Valor por Pacote");
        Item nove = new Item(6, 3.50, "Pêra", "Valor por Kg");
        Item dez = new Item(9, 4.29, "Abacaxi", "Valor por Kg");

        carrinho.add(um);
        carrinho.add(dois);
        carrinho.add(tres);
        carrinho.add(quatro);
        carrinho.add(cinco);
        carrinho.add(seis);
        carrinho.add(sete);
        carrinho.add(oito);
        carrinho.add(nove);
        carrinho.add(dez);

        System.out.println("LISTA DE COMPRAS DO GABRIEL: ");
        System.out.println("===========================");

        carrinho.print();
    }

}
