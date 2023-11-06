/*
====================================Algoritmo-05==============================================
Generar un algoritmo que permita calcular y mostrar el costo de una computadora de escritorio. 
La misma es comprada por partes, CPU, teclado, pantalla, ratón.
*/
package ape_semana4_soluciones_ricardo;
/**
 * autor: Ricardo Fabian Espinosa Largo
 */
import java.util.Scanner;
public class CostoCompu_05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Inicializamos el objeto Scanner.
        double CostoCPU, CostoTecl, CostoPant, Costoraton, total;
        //Creamos las variables necesarias.
        System.out.println("Ingresa el valor del costo del CPU");
        CostoCPU = teclado.nextDouble();
        System.out.println("Ingresa el valor del costo del teclado");
        CostoTecl = teclado.nextDouble();
        System.out.println("Ingresa el valor del costo de la pantalla");
        CostoPant = teclado.nextDouble();
        System.out.println("Ingresa el valor del costo de el raton");
        Costoraton = teclado.nextDouble();
        //Almacenamos los valores ingresados por el usuario.
        total = CostoCPU + CostoTecl + CostoPant + Costoraton;
        //Calculamos el costo total de la computadora.
        System.out.println("El valor total de la computadora de escritorio es: $" + total);
        //Mostramos en consola el resultado final.
    }
}