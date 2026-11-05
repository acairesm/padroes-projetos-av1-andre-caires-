package questao1;

import java.util.LinkedHashSet;
import java.util.Set;

public class Produto {
    private final String nome;
    private int quantidade;
    private final Set<AreaInteressada> areas = new LinkedHashSet<>();

    public Produto(String nome, int quantidade) {
        validarQuantidade(quantidade);
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public void adicionarArea(AreaInteressada area) {
        areas.add(area);
    }

    public void removerArea(AreaInteressada area) {
        areas.remove(area);
    }

    public void alterarQuantidade(int novaQuantidade) {
        validarQuantidade(novaQuantidade);
        if (novaQuantidade == quantidade) {
            return;
        }
        int quantidadeAnterior = quantidade;
        quantidade = novaQuantidade;
        for (AreaInteressada area : areas) {
            area.atualizar(nome, quantidadeAnterior, quantidade);
        }
    }

    private static void validarQuantidade(int quantidade) {
        if (quantidade < 0) {
            throw new IllegalArgumentException("Quantidade nao pode ser negativa: " + quantidade);
        }
    }
}
