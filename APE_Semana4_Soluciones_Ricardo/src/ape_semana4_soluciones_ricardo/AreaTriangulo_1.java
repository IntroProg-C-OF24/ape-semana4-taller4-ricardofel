/*
Algoritmo-1
Generar un algoritmo que permite calcular y presentar el área de un triángulo. 
Los datos deben ser pedidos al usuario.
 */
package ape_semana4_soluciones_ricardo;
/**
 * Ricardo Fabian Espinosa Largo
 */
import java.util.Scanner;
public class AreaTriangulo_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); //INICIALIZAR
        double baseTriangulo;
        double alturaTriangulo;
        double areaTriangulo;
        System.out.println("Ingrese la base del triangulo");
        baseTriangulo = teclado.nextDouble();
        System.out.println("Ingrese la altura del Triangulo");
        alturaTriangulo = teclado.nextDouble();
        areaTriangulo = (baseTriangulo * alturaTriangulo)/2;
        System.out.println("El area del triangulo es: " + areaTriangulo);
    }
}