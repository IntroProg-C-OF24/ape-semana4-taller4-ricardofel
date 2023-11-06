/*
==========================================Algoritmo-07===============================================
Generar un algoritmo que permita calcular y mostrar el valor a cancelar de una planilla de luz. 
Se debe ingresar el valor de costo por kilovatio/hora y el número de kilovatios consumidos en el mes. 
Si el usuario tiene edad mayor a 65 años, se debe descontar el 10%.
 */
package ape_semana4_soluciones_ricardo;
/**
 * @autor: Ricardo Fabian Espinosa Largo
 */
import java.util.Scanner;
public class PlanillaLuz_07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Inicializamos el objeto Scanner.
        double kilovatioxhora, kilovatiosCons, planilla;
        int edad;
        //Creamos todas las variables requeridas.
        System.out.println("Dame el valor del costo por Kilovatio/hora");
        kilovatioxhora = teclado.nextDouble();
        System.out.println("Dame el valor de los kilovatios consumidos en el mes");
        kilovatiosCons = teclado.nextDouble();
        System.out.println("Dame tu edad");
        edad = teclado.nextInt();
        //Almacenamos los valores ingresados por el usuario.
        planilla = kilovatioxhora*kilovatiosCons;
        //Calculamos el valor de la planilla.
        if (edad >= 65) {
            planilla = planilla - (planilla*10/100);
            System.out.println("El valor de la planilla es:" + " " + planilla);
            //Si el usuario es mayor a 65 años se le hace un descuento del 10%.
        }
        else {
            System.out.println("El valor de la planilla es" + " " + planilla);
            //Si el usuario es menor a 65 años no se aplica ningun descuento.
        }
    }
}