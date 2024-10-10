package Atividade13;

public class Matematica {
    public static long fatorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Número deve ser não-negativo.");
        }
        long resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
