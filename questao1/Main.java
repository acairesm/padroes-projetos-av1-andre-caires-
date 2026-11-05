package questao1;

public class Main {
    public static void main(String[] args) {
        Compras compras = new Compras();
        Vendas vendas = new Vendas();
        Auditoria auditoria = new Auditoria();

        Produto teclado = new Produto("Teclado", 10);
        teclado.adicionarArea(compras);
        teclado.adicionarArea(vendas);
        teclado.adicionarArea(auditoria);

        System.out.println("Teclado: 10 -> 3 (Compras alerta)");
        teclado.alterarQuantidade(3);

        System.out.println("Teclado: 3 -> 3 (sem mudanca, ninguem e avisado)");
        teclado.alterarQuantidade(3);

        System.out.println("Teclado: 3 -> 0 (Compras alerta)");
        teclado.alterarQuantidade(0);

        System.out.println("Teclado: 0 -> 8 (Vendas alerta)");
        teclado.alterarQuantidade(8);

        System.out.println("Removendo Compras do Teclado");
        teclado.removerArea(compras);

        System.out.println("Teclado: 8 -> 2 (Compras removida, sem alerta)");
        teclado.alterarQuantidade(2);

        Produto mouse = new Produto("Mouse", 20);
        mouse.adicionarArea(auditoria);

        System.out.println("Mouse: 20 -> 1 (somente Auditoria acompanha o Mouse)");
        mouse.alterarQuantidade(1);

        Produto monitor = new Produto("Monitor", 0);
        monitor.adicionarArea(vendas);

        System.out.println("Monitor: 0 -> 4 (cadastrado zerado, Vendas alerta)");
        monitor.alterarQuantidade(4);

        auditoria.imprimirRegistros();
    }
}
