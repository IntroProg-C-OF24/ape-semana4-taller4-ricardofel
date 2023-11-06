/*
===============================Algoritmo_01===================================
Generar un algoritmo que permite calcular y presentar el área de un triángulo. 
Los datos deben ser pedidos al usuario.
*/
package ape_semana4_soluciones_ricardo;
/**
 * @autor: Ricardo Fabian Espinosa Largo
 */
import java.util.Scanner;
public class AreaTriangulo_01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Inicializamos el objeto Scanner.
        double baseTriangulo, alturaTriangulo, areaTriangulo;
        //Creamos todas las variables necesarias.
        System.out.println("Ingrese el valor correspondiente a la base del triangulo");
        baseTriangulo = teclado.nextDouble();
        System.out.println("Ingrese el valor correspondiente a la altura del triangulo");
        alturaTriangulo = teclado.nextDouble(); 
        //Almacenamos los valores ingresados por el usuario.
        areaTriangulo = (baseTriangulo * alturaTriangulo)/2; 
        //Se calcula el area con la formula.
        System.out.println("AREA DEL TRIANGULO: " + areaTriangulo);
        //Se muestra en consola el resultado final.
    }
}