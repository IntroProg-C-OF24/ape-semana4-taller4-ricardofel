/*
=====================================Algoritmo-02========================================
Generar un algoritmo que permite ingresar los gastos de tres hijos de un padre de familia; 
Calcular y mostrar el total de gastos de los hijos del padre de familia.
*/
package ape_semana4_soluciones_ricardo;
/**
 * @autor: Ricardo Fabian Espinosa Largo
 */
import java.util.Scanner;
public class GastosHijos_02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Inicializamos el objeto Scanner.
        double gastosHijo1, gastosHijo2, gastosHijo3, gastosTotales;
        //Creamos todas las variables necesarias.
        System.out.println("Ingresa el valor de los gastos del hijo 1");
        gastosHijo1 = teclado.nextDouble();
        System.out.println("Ingresa el valor de los gastos del hijo 2");
        gastosHijo2 = teclado.nextDouble();
        System.out.println("Ingresa el valor de los gastos del hijo 3");
        gastosHijo3 = teclado.nextDouble();
        //Almacenamos los valores ingresados por el usuario.
        gastosTotales = gastosHijo1 + gastosHijo2 + gastosHijo3;
        //Calculamos los gastos totales.
        System.out.println("LOS GASTOS TOTALES DE LOS TRES HIJOS SON: $" + gastosTotales);
        //Mostramos en consola el resultado final.
    }
}