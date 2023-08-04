//Edgar Vicente Rodriguez Alfonso
import java.util.Scanner;

/*Diseñe un programa en java que muestre un menú al usuario con las
siguientes opciones: potenciación, raíz cuadrada y terminar, que cada opción
la realice un método.*/
public class EjercicioTres {
    public static void main(String[] args) {
        //declaramos el escaner
        Scanner sc = new Scanner(System.in);
        int seleccion;

        //hacemos un uso de un do while para que se ejecute mientras es un numero
        do {
            //vamos a llamar a nuestro primer metodo
            menuUsuario();
            seleccion = sc.nextInt(); //mandamo a guardar

            switch (seleccion){
                case 1:
                    potenciacion();
                    break;
                case 2:
                    raizCuadrada();
                    break;
                case 3:
                    terminar();
                    break;
                default:
                    System.out.println("Ingresa algo valido por favor!");

            }




        }while (seleccion != 3);
    }
    public static void menuUsuario(){
        System.out.println("Bienvenido a la calculadora");
        System.out.println("¿Que operación desea realizar?");
        System.out.println("Opcion 1: potenciación \nOpción 2: Raiz Cuadrada \nOpción 3: Terminar");
        System.out.print(" ");
    }
    public static void potenciacion(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar tu numero");
        double num = sc.nextInt();

        System.out.println("Exponente");
        double exponente = sc.nextDouble();

        double resultado = Math.pow(num, exponente);
        System.out.println("El resultado de la operacion es:" + resultado);

    }
    public static void raizCuadrada(){
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Que número le sacarás raíz?");
        double raizNumero = sc.nextDouble();
        double resultado = Math.sqrt(raizNumero);
        System.out.println("El resultado es: "+ resultado);


    }

    public static void terminar(){
        System.out.println("Se acabo el programa");
    }

}