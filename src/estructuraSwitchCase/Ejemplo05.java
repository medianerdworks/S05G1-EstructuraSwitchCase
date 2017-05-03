package estructuraSwitchCase;

import java.util.Scanner;

public class Ejemplo05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String op;
        double radio,base,altura,resultado=0.0;
        boolean calculado=true;
        final double PI=3.14159;
        
        System.out.println("Escoger operación a realizar: ");
        System.out.println("[1]Area del Rectángulo");
        System.out.println("[2]Area del Círculo");

        System.out.print("Ingrese la operación a realizar: ");
        op = sc.next();

        switch (op) {
            case "1":
                System.out.print("Ingrese la base del rectángulo: ");
                base = sc.nextDouble();
                System.out.print("Ingrese la altura del rectángulo: ");
                altura = sc.nextDouble();
                resultado = base*altura;
                break;
            case "2":
                System.out.print("Ingrese el radio del círculo : ");
                radio = sc.nextDouble();
                resultado = PI*radio*radio;
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
