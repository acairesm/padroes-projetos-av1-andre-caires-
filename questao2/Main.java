package questao2;

public class Main {
    public static void main(String[] args) {
        int minutos = 130;

        System.out.println("Mesmo tempo de permanencia nos tres perfis (" + minutos + " minutos):");
        imprimir("Rotativo", new Tiquete("ABC1D23", minutos, new Rotativo()));
        imprimir("Mensalista", new Tiquete("DEF4G56", minutos, new Mensalista()));
        imprimir("Conveniado", new Tiquete("HIJ7K89", minutos, new Conveniado()));

        System.out.println("Troca de perfil em um mesmo tiquete:");
        Tiquete tiquete = new Tiquete("XYZ9W87", minutos, new Rotativo());
        imprimir("Rotativo", tiquete);
        tiquete.setPerfil(new Conveniado());
        imprimir("Conveniado", tiquete);
        tiquete.setPerfil(new Mensalista());
        imprimir("Mensalista", tiquete);

        System.out.println("Conveniado dentro dos 30 minutos gratuitos:");
        imprimir("Conveniado", new Tiquete("LMN2P34", 20, new Conveniado()));
    }

    private static void imprimir(String nomePerfil, Tiquete tiquete) {
        System.out.printf("  Placa %s, %d min, perfil %s: R$ %.2f%n",
                tiquete.getPlaca(), tiquete.getMinutos(), nomePerfil, tiquete.calcularValor());
    }
}
