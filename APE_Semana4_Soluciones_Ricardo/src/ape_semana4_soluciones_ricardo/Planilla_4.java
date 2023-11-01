/*
Generar un algoritmo que permita calcular y mostrar el valor de la planilla de teléfono de un casa. 
Se debe ingresar el costo por minutos, el número de minutos consumidos en el mes.
*/
package ape_semana4_soluciones_ricardo;
/**
 *Ricardo Fabian Espinosa Largo
 */
import java.util.Scanner;
public class Planilla_4 {public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    double costoxmin, minconsumidos, TotalPagar;
            System.out.println("Ingresa el valor del costo por minuto");
            costoxmin = teclado.nextDouble();
            System.out.println("Ingresa el valor de los minutos consumidos");
            minconsumidos = teclado.nextDouble();
            TotalPagar = costoxmin * minconsumidos;
            System.out.println("El valor de la planilla a pagar es: " + TotalPagar);
        
    }
}
