package questao2;

public class Rotativo implements PerfilCobranca {
    private static final double VALOR_HORA = 10.0;

    @Override
    public double calcular(int minutos) {
        return Math.ceil(minutos / 60.0) * VALOR_HORA;
    }
}
