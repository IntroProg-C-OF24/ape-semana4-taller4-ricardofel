package ape_semana4_soluciones_ricardo;
/*
Generar un algoritmo que permita calcular y mostrar el costos de una computadora de escritorio. 
La misma es comprada por partes; CPU, teclado, pantalla, ratón.
*/
import java.util.Scanner;
public class CostoComp_5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double CostoCPU, CostoTecl, CostoPant, Costorat, Total;
        System.out.println("Ingresa el costo del CPU");
        CostoCPU = teclado.nextDouble();
        System.out.println("Ingresa el costo del teclado");
        CostoTecl = teclado.nextDouble();
        System.out.println("Ingresa el costo de la pantalla");
        CostoPant = teclado.nextDouble();
        System.out.println("Ingresa el costo de el raton");
        Costorat = teclado.nextDouble();
        Total = CostoCPU + CostoTecl + CostoPant + Costorat;
        System.out.println("El total a pagar de la computadora es: " + Total);
    }
}
