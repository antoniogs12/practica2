package aplicacion;

public class Principal {
    public static void main(String[] args) {
        long pasos = Long.parseLong(args[0]);
        double pi = Matematicas.generarNumeroPiRecursivo(pasos, 0);
        System.out.println("El número PI es " + pi);
    }
}

