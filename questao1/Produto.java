package questao1;

import java.util.LinkedHashSet;
import java.util.Set;

public class Produto {
    private final String nome;
    private int quantidade;
    private final Set<AreaInteressada> areas = new LinkedHashSet<>();

    public Produto(String nome, int quantidade) {
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
        if (novaQuantidade == quantidade) {
            return;
        }
        quantidade = novaQuantidade;
        for (AreaInteressada area : areas) {
            area.atualizar(nome, quantidade);
        }
    }
}
