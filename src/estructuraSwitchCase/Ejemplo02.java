package estructuraSwitchCase;

import java.util.Scanner;

public class Ejemplo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numero1,numero2,op;
        double resultado;
        
        System.out.print("Ingrese el primer numero: ");
        numero1=sc.nextInt();
        
        System.out.print("Ingrese el segundo numero: ");
        numero2=sc.nextInt();
        
        System.out.println("Seleccione la opción:");
        System.out.println("[1] Sumar");
        System.out.println("[2] Restar");
        System.out.println("[3] Multiplicar");
        System.out.println("[4] Dividir");
        op=sc.nextInt();
        
        switch (op) {
            case 1:
                resultado=numero1+numero2;
                System.out.println("La suma de los números es: "+resultado);
                break;
            case 2:
                resultado=numero1-numero2;
                System.out.println("La resta de los números es: "+resultado);
                break;
            case 3:
                resultado=numero1*numero2;
                System.out.println("La multiplicación de los números es: "+resultado);
                break;
            case 4:
                resultado=numero1/numero2;
                System.out.println("La división de los números es: "+resultado);
                break;
            default:
                System.out.println("Elija una opción válida del 1 al 4.");
        }
    }
}
