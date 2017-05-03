package estructuraSwitchCase;

import java.util.Scanner;

public class Ejemplo03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero1, numero2;
        String op;
        double resultado;

        System.out.print("Ingrese el primer numero: ");
        numero1 = sc.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        numero2 = sc.nextInt();

        System.out.println("Seleccione la opción:");
        System.out.println("[S]umar");
        System.out.println("[R]estar");
        System.out.println("[M]ultiplicar");
        System.out.println("[D]ividir");
        System.out.print("Seleccione la opción [S-R-M-D]: ");

        op = sc.next();

        switch (op) {
            case "s":
            case "S":
                resultado = numero1 + numero2;
                System.out.println("La suma de los números es: " + resultado);
                break;
            case "r":
            case "R":
                resultado = numero1 - numero2;
                System.out.println("La resta de los números es: " + resultado);
                break;
            case "m":
            case "M":
                resultado = numero1 * numero2;
                System.out.println("La multiplicación de los números es: " + resultado);
                break;
            case "d":
            case "D":
                resultado = numero1 / numero2;
                System.out.println("La división de los números es: " + resultado);
                break;
            default:
                System.out.println("Elija una opción válida.");
        }
    }
}
