/*
Algoritmo-2
Generar un algoritmo que permite ingresar los gastos de tres hijos de un padre de familia; 
Calcular y mostrar el total de gastos de los hijos del padre de familia.
*/
package ape_semana4_soluciones_ricardo;
/**
 * Ricardo Fabian Espinosa Largo
 */
import java.util.Scanner;
public class GastoHijos_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double gastosHijo1, gastosHijo2, gastosHijo3,gastosTotales;
        System.out.println("Ingresa los gastos del hijo 1");
        gastosHijo1 = teclado.nextDouble();
        System.out.println("Ingresa los gastos del hijo 2");
        gastosHijo2 = teclado.nextDouble();
        System.out.println("Ingresa los gastos del hijo 3");
        gastosHijo3 = teclado.nextDouble();
        gastosTotales = gastosHijo1 + gastosHijo2 + gastosHijo3;
        System.out.println("LOS GASTOS TOTALES DE LOS TRES HIJOS SON: " + gastosTotales);
    }
}
