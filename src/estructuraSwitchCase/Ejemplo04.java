package estructuraSwitchCase;

import java.util.Scanner;

public class Ejemplo04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero1, numero2;
        String op;
        double resultado=0.0;
        boolean calculado=true;

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
                break;
            case "r":
            case "R":
                resultado = numero1 - numero2;
                break;
            case "m":
            case "M":
                resultado = numero1 * numero2;
                break;
            case "d":
            case "D":
                resultado = numero1 / numero2;
                break;
            default:
                System.out.println("Elija una opción válida.");
                calculado=false;
        }
        if (calculado) {
            System.out.println("El resultado es: " + resultado);
        }
    }
}
