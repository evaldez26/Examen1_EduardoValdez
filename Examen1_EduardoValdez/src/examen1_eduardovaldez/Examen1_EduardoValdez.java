/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1_eduardovaldez;

import java.util.Scanner;

/**
 *
 * @author guali
 */
public class Examen1_EduardoValdez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        char resp = 's';
        String historial = "";
        int cont = 0;

        while (resp == 's') {
            System.out.print("**********Menu**********\n1. Ejercicios String\n2. Respuestas a preguntas\n3. Mostrar el historial del menu\n4. Salir\nIngrese una opcion: ");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    cont = cont + 1;
                    if (cont == 1) {
                        historial += "Ejercicios String";
                    } else {
                        historial += " - Ejercicios String";
                    }

                    System.out.println("*****Ejercicios String*****\nIngrese una cadena: ");
                    leer.nextLine();
                    String cadena = leer.nextLine();
                    int total = cadena.length();

                    if (total % 2 == 0) {
                        par(cadena);

                    } else {
                        System.out.println("Ingrese una nueva cadena: ");
                        String cad2 = leer.nextLine();
                        impar(cadena, cad2);

                    }
                    break;
                case 2:
                    cont = cont + 1;
                    if (cont == 1) {
                        historial += "Respuesta a Preguntas";
                    } else {
                        historial += " - Respuesta a Preguntas";
                    }

                    System.out.println("*****Respuesta a Preguntas*****");
                    System.out.println("1. Describa el funcionamiento y diferencias del if y del switch case\nR//: El if puede evaluar variables boolean y permite condiciones más complejas, mientras que el switch solo puede evaluar valores exactos\n ");
                    System.out.println("2. Describa el funcionamiento de .substring(), equalsIgNoreCase() y .equals()\nR//:\n(a).substring(): este metodo extrae una subcadena de una cadena principal\n(b)equalsIgNoreCase: este metodo compara y evalua si dos cadenas son iguales sin importar que los caracteres esten en mayuscula o miniscula\n(c).equals: este metodo compara y evalua si dos cadenas son exactamente iguales, evaluando si ambos caracteres que estan siendo evaluados estan en mayuscula o miniscula\n");
                    System.out.println("3. Defina a que se refiere la concatenación\nR//: Es la accion de unir dos o mas strings en un solo string mas grande ");
                    break;
                case 3:
                    System.out.println(historial);
                    break;
                case 4:
                    System.out.println("Salio del programa");
                    resp = 'n';
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;

            }

        }

    }

    public static String impar(String a, String b) {
        String cadena = "";
        String cad3 = a + b;
        System.out.println("Cadena ingresada: " + a);
        System.out.println("Nueva cadena ingresada: " + b);
        System.out.println("Cadena resultante: " + cad3);
        System.out.println("Tamaño de la nueva cadena: " + cad3.length());

        return cadena;
    }

    public static String par(String a) {
        String cadena = "";
        int mitad = a.length() / 2;

        String mitad1 = "";
        String mitad2 = "";
        System.out.println("Primera mitad en la cadena: " + a.substring(0, mitad));
        System.out.println("Segunda mitad de la cadena: " + a.substring(mitad, a.length()));
        for (int i = 0; i < a.length(); i++) {
            if (i < (a.length() / 2)) {
                mitad1 += a.charAt(i) + "-";
            } else {
                if (i == a.length()) {
                    mitad2 += a.charAt(i);
                } else {
                    mitad2 += a.charAt(i) + "/";
                }

            }

        }
        System.out.println(mitad1 + mitad2);
        return cadena;
    }

}
