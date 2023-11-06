/*
========================================Algoritmo-04==============================================
Generar un algoritmo que permita calcular y mostrar el valor de la planilla de teléfono de un casa. 
Se debe ingresar el costo por minutos, el número de minutos consumidos en el mes.
*/
package ape_semana4_soluciones_ricardo;
/**
 *autor: Ricardo Fabian Espinosa Largo
 */
import java.util.Scanner;
public class PlanillaTel_04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Inicializamos el objeto Scanner.
        double costoxmin, minconsumidos, totalPagar;
        //Creamos todas las variables necesarias.
        System.out.println("Ingresa el valor correspondiente al costo por minuto");
        costoxmin = teclado.nextDouble();
        System.out.println("Ingresa el valor correspondiente a los minutos consumidos en el mes");
        minconsumidos = teclado.nextDouble();
        //Leemos los valores ingresados por el usuario.
        totalPagar = costoxmin * minconsumidos;
        //Calculamos el total a pagar.
        System.out.println("El valor de la planilla es: $" + totalPagar);
        //Mostramos en consola el resultado final.
    }
}