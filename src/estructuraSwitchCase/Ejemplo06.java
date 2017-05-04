package estructuraSwitchCase;

import java.io.IOException;
import java.util.Scanner;

public class Ejemplo06 {
    public static void main(String[] args) throws IOException {
        double num1,num2,resultado;
        char operador;
        Scanner sc=new Scanner(System.in);
        System.out.print("Ingresar primer número: ");
        num1=sc.nextDouble();
        System.out.print("Ingresar segundo número: ");
        num2=sc.nextDouble();
        System.out.print("Ingresar un operador [+,-,*,/]: ");
        operador=(char) System.in.read();
        switch (operador) {
            case 43: //Tabla Ascii -->'+'
                resultado=num1+num2;
                System.out.println("La suma de los números es: "+resultado);
                break;
            case 45: //Tabla Ascii -->'-'
                resultado=num1-num2;
                System.out.println("La resta de los números es: "+resultado);
                break;

            case 42: //Tabla Ascii -->'*'
                resultado=num1*num2;
                System.out.println("La multiplicación de los números es: "+resultado);
                break;

            case 47: //Tabla Ascii -->'/'
                resultado=num1/num2;
                System.out.println("La división de los números es: "+resultado);
                break;
            default:
                throw new AssertionError();
        }
    }
}