# padroes-projetos-av1-andre-caires-

Avaliação de Padrões de Projeto em Java. Cada questão está em um pacote próprio.

## Questão 1: Monitor de Estoque (Observer)

Avisa automaticamente as áreas interessadas em um produto sempre que a quantidade em estoque dele muda.

- **Compras:** alerta quando o estoque fica abaixo de 5 unidades.
- **Vendas:** alerta quando o produto volta a ter estoque após zerar.
- **Auditoria:** registra toda alteração de estoque.

As áreas podem ser incluídas e removidas em tempo de execução, e uma nova área não exige alterar a classe `Produto`.

## Questão 2: Tarifa de Estacionamento (Strategy)

Calcula o valor do tíquete conforme o perfil de cobrança, que pode ser trocado em tempo de execução.

- **Rotativo:** R$ 10,00 por hora iniciada.
- **Mensalista:** R$ 200,00 fixos.
- **Conveniado:** 30 minutos grátis; depois, R$ 10,00 por hora iniciada com 20% de desconto.

Cada regra fica em uma classe própria, sem `if/else` ou `switch` sobre o perfil, e um novo perfil não exige alterar o código existente.

## Questão 3: Pedido de Café (Decorator)

Monta o pedido a partir de uma bebida base e de complementos, em qualquer combinação e quantidade.

- **Bebidas:** Espresso (R$ 6,00) e Chá (R$ 5,00).
- **Complementos:** Leite (R$ 2,00), Chantilly (R$ 3,50) e Calda (R$ 2,50).

Cada complemento acrescenta seu nome à descrição e seu valor ao preço total. Não há classes de combinações prontas, e um novo complemento não exige alterar as classes existentes.

## Como executar

Na raiz do repositório, troque `questao1` pela questão desejada:

```bash
javac -d out questao1/*.java
java -cp out questao1.Main
```
