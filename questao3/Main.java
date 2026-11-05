package questao3;

public class Main {
    public static void main(String[] args) {
        Bebida pedido1 = new Chantilly(new Leite(new Espresso()));
        Bebida pedido2 = new Leite(new Cha());
        Bebida pedido3 = new Chantilly(new Calda(new Calda(new Espresso())));

        imprimir(pedido1);
        imprimir(pedido2);
        imprimir(pedido3);
    }

    private static void imprimir(Bebida pedido) {
        System.out.printf("%s: R$ %.2f%n", pedido.getDescricao(), pedido.getPreco());
    }
}
