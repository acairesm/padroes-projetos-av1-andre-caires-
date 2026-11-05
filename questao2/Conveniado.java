package questao2;

public class Conveniado implements PerfilCobranca {
    private static final int MINUTOS_GRATUITOS = 30;
    private static final double VALOR_HORA = 10.0;
    private static final double DESCONTO_PERCENTUAL = 20.0;

    @Override
    public double calcular(int minutos) {
        int minutosCobrados = Math.max(0, minutos - MINUTOS_GRATUITOS);
        double horasIniciadas = Math.ceil(minutosCobrados / 60.0);
        return horasIniciadas * VALOR_HORA * (1 - DESCONTO_PERCENTUAL / 100);
    }
}
