package questao1;

import java.util.ArrayList;
import java.util.List;

public class Auditoria implements AreaInteressada {
    private final List<String> registros = new ArrayList<>();

    @Override
    public void atualizar(String nomeProduto, int novaQuantidade) {
        registros.add(nomeProduto + " -> nova quantidade: " + novaQuantidade);
    }

    public void imprimirRegistros() {
        System.out.println("[Auditoria] Registros de alteracao de estoque:");
        for (String registro : registros) {
            System.out.println("  " + registro);
        }
    }
}
