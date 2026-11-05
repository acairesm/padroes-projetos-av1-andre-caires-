package questao1;

public class Compras implements AreaInteressada {
    private static final int ESTOQUE_MINIMO = 5;

    @Override
    public void atualizar(String nomeProduto, int quantidadeAnterior, int novaQuantidade) {
        if (novaQuantidade < ESTOQUE_MINIMO) {
            System.out.println("[Compras] ALERTA: " + nomeProduto + " abaixo de " + ESTOQUE_MINIMO
                    + " unidades (estoque: " + novaQuantidade + ")");
        }
    }
}
