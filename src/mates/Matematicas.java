package mates;

public class Matematicas {

    public static double generarNumeroPiRecursivo(long pasos, int aciertos) {
        // Caso base: si no quedan más pasos, se devuelve la aproximación de Pi
        if (pasos == 0) {
            return 4.0 * aciertos / (aciertos + pasos);
        }

        double x = Math.random();
        double y = Math.random();
        double radio = 1;
        
        // Si el punto cae dentro del círculo, incrementar aciertos
        if (Math.pow(x, 2) + Math.pow(y, 2) <= Math.pow(radio, 2)) {
            return generarNumeroPiRecursivo(pasos - 1, aciertos + 1);
        } else {
            return generarNumeroPiRecursivo(pasos - 1, aciertos);
        }
    }
}
