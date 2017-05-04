package estructuraWhile;

import java.util.Scanner;

public class Ejemplo03 {

    public static void main(String[] args) {
        //Usando la estructura while ingresar x numeros por
        //consola y calcular su promedio
        Scanner sc = new Scanner(System.in);
        double numeros, promedio, suma=0;
        int i = 1;
        while (i <= 3) {
            System.out.print("Ingrese número " + i + ": ");
            numeros = sc.nextDouble();
            suma+=numeros;
            i++;
            
        }
        promedio=suma/3;
        System.out.println("El promedio es: "+promedio);
    }

}
