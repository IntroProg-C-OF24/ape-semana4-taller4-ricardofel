/*
=======================================Algoritmo-06=================================================
Generar un solución que permita calcular y mostrar el pago mensual de un préstamo de 1 año de plazo. 
Se debe ingresar el monto del préstamo y el interés mensual a cobrar.
 */
package ape_semana4_soluciones_ricardo;
/**
 * @autor: Ricardo Fabian Espinosa Largo
 */
import java.util.Scanner;
public class PagoPrestamo_06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Inicializamos el objeto Scanner.
        double MontoPrestamo, InteresMensual, PagoMensual;
        //Creamos las variables necesarias.
        System.out.println("Ingresa el monto del prestamo");
        MontoPrestamo = teclado.nextDouble();
        System.out.println("Ingresa el valor del interes mensual");
        InteresMensual = teclado.nextDouble();
        //Almacenamos los valores ingresados por el usuario.
        PagoMensual = (MontoPrestamo/12) + InteresMensual;
        //Calculamos el pago mensual.
        System.out.println("El valor del pago mensual es: " + PagoMensual);
        //Mostramos en consola el resultado final.
    }
}