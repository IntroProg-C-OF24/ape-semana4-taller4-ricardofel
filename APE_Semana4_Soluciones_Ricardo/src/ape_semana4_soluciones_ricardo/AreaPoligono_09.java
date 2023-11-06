/*
======================================Algoritmo-09======================================================
El programa debe calcular el área del polígono. 
La figura se compone de un cuadrado perfecto (A), tres triángulos rectángulos iguales (B, C, E), 
cuya base mide lo mismo que uno de los lados del cuadrado, y un rectángulo cuyo ancho mide lo mismo 
que uno de los lados del cuadrado mientras que la altura mide lo mismo que la altura de los triángulos. 
Se pide que haga un programa que calcule el área total.

Por cultura general, sabemos que el área de un rectángulo se calcula multiplicando su base por su altura; 
El área de un triángulo rectángulo se calcula multiplicando su base por su altura
y luego dividiendo el resultado entre dos; 
Finalmente, el área de un cuadrado se calcula elevando al cuadrado la medida de uno de sus lados.

La parte interesante de este problema es determinar el mínimo número de datos que hay que preguntar.
 */
package ape_semana4_soluciones_ricardo;
/**
 * @autor: Ricardo Fabian Espinosa Largo
 */
import java.util.Scanner;
public class AreaPoligono_09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Inicializamos el objeto Scanner.
        double valor1, valor2, areaPoligono;
        //Creamos todas las variables necesarias.
        System.out.println("Ingresa el valor correspondiente a un lado del cuadrado");
        valor1 = teclado.nextDouble();
        System.out.println("Ingresa el valor correspondiente a la altura de un triangulo");
        valor2 = teclado.nextDouble();
        //Almacenamos los valores ingresados por el usuario.
        areaPoligono = (((valor1*valor2)/2)*5) + (valor1 * valor1);
        //Calculamos el area del poligono.
        System.out.println("EL AREA DEL POLIGONO ES: " + areaPoligono);
        //Mostramos en consola el resultado final.
    }
}