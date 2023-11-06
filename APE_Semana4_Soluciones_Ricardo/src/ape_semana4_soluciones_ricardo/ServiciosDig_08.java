/*
===========================Algoritmo-08==================================
Se debe generar un algoritmo que permite calcular y mostrar el valor total 
a pagar mensual de servicios digitales de una persona. 
Los servicios digitales son: netflix, youtube premium, dropbox, spotify. 
Si la persona es menor a 30 años se descuenta el 20% del total mensual.
 */
package ape_semana4_soluciones_ricardo;
/**
 * @autor: Ricardo Fabian Espinosa Largo
 */
import java.util.Scanner;
public class ServiciosDig_08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Inicializamos el objeto Scanner.
        double costoNetflix, costoYP, costoDropbox, costoSpotify, planilla;
        int edad;
        //Creamos las variables necesarias.
        System.out.println("Ingresa el valor del costo de Netflix");
        costoNetflix = teclado.nextDouble();
        System.out.println("Ingresa el valor del costo de Youtube Premium");
        costoYP = teclado.nextDouble();
        System.out.println("Ingresa el valor del costo de Dropbox");
        costoDropbox = teclado.nextDouble();
        System.out.println("Ingresa el valor del costo de Spotify");
        costoSpotify = teclado.nextDouble();
        System.out.println("Ingresa tu edad");
        edad = teclado.nextInt();
        //Almacenamos los valores ingresados por el usuario.
        planilla = costoNetflix + costoYP + costoDropbox + costoSpotify;
        //Calculamos el valor de la planilla.
        if (edad < 30) {
            planilla = planilla - (planilla * 30/100);
            System.out.println("El valor de la planilla es " + planilla);
            //Si el usuario es menor a 30 años se le hace un descuento del 30%.
        }
        else {
            System.out.println("El valor de la planilla es " + planilla);
            //Si el usuario es mayor a 30 años no se le aplica ningun descuento. 
        }
    }
}