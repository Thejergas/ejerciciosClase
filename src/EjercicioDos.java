import java.util.Scanner;

public class EjercicioDos {
    public static void main(String[] args) {

        Scanner dato = new Scanner(System.in);
        double tasaCambio = 0.00025;
        double cantidadPesos;

        System.out.println("Ingresa la cantidad");
        cantidadPesos = dato.nextDouble();

        double cantidadDolares = cantidadPesos * tasaCambio;

        System.out.printf("%.2f pesos colombianos es igual a %.5f dólares%n", cantidadPesos, cantidadDolares);
    }
}
