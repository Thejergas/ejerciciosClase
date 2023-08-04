import java.util.Scanner;

/*Crear un programa en java que permita a través de un método  llamado cambio() que
 tenga un parámetro en número entero y seis parámetros de referencia en número entero
 nombrados cien, cincuenta, veinte, diez, cinco y uno, respectivamente.  la cantidad inicial
 a cambiar debe ingresarse al inicio,considerar el valor entero ingresado como una cantidad en
 dólares y
convertir el valor en el número menor de billetes equivalentes.*/
public class EjercicioUno {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad en dólares: ");
        int cantidadDolares = scanner.nextInt();

        int[] billetesDisponibles = { 1000, 100, 50, 20, 10, 5, 1 };
        //nos ayudara para guardar los billetes como es 1 billete de 100 u 2 de 100 y asi
        int[] billetesC = new int[billetesDisponibles.length];

        cambio(cantidadDolares, billetesDisponibles, billetesC);

        //imprimir
        for (int i = 0; i < billetesDisponibles.length; i++) {
            System.out.println("Billetes de $" + billetesDisponibles[i] + ": " + billetesC[i]);
        }
    }
    //cambiar y separar los billetes
    public static void cambio(int ingreso, int[] billetesDisponibles, int[] billetes) {
        for (int i = 0; i < billetesDisponibles.length; i++) {
            billetes[i] = ingreso / billetesDisponibles[i];
            //nos ayudara a ir separando los billetes conforme itera
            ingreso %= billetesDisponibles[i];
        }
    }
}