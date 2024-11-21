package Conversiones;

import java.util.Scanner;

public class Conversiones {
    public static void main(String[] args) {
        //Crear la instancia
        Scanner ingreso = new Scanner(System.in);
        int opcion = 0; //Inicializar la variable para entrar al bucle

        System.out.println("-----------Menú de Conversiones------------");

        //Elegir una opción del 1 al 3
        while (opcion != 3) {
            System.out.println("¿Qué acción desea realizar?");
            System.out.println("1. Conversión Implícita");
            System.out.println("2. Conversión Explícita");
            System.out.println("3. Salir");
            System.out.print("Opción: ");
            opcion = ingreso.nextInt();

            if (opcion == 1) {
                conversionImplicita(ingreso);
            } else if (opcion == 2) {
                conversionExplicita(ingreso);
            } else if (opcion == 3) {
                System.out.println("Ha salido del programa.");
            } else {
                System.out.println("Opción no válida. Intente de nuevo.");
            }

            System.out.println(); //Salto de linea
        }

        ingreso.close();
    }

    public static void conversionImplicita(Scanner scanner) {
        //Definir el atributo que se va a convertir
        int numero_entero;
        System.out.println("-----Conversion Implicita-----");
        System.out.print("Ingrese un número entero: ");
        numero_entero = scanner.nextInt();

        //Conversión implícita de entero a decimal
        double numeroDouble = numero_entero;

        System.out.println("El número entero " + numero_entero + " fue convertido a double: " + numeroDouble);
    }

    public static void conversionExplicita(Scanner scanner) {
        //Definir el atributo que se va a convertir
        double num_double;
        System.out.println("-------Conversión Explícita------");
        System.out.print("Ingrese un número decimal: ");
        num_double  = scanner.nextDouble();

        //Conversión explícita de double a int
        int num_int = (int) num_double;       //Convierte manualmente el valor de num_double a un int.

        System.out.println("El número decimal " + num_double + " fue convertido a entero: " + num_int);
    }
}

