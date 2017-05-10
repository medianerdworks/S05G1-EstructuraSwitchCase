package menuopciones;

import java.util.Scanner;

public class MenuGeneral {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("=========Menú General=========");
            System.out.println("[1]OPERACIONES MATEMÁTICAS");
            System.out.println("[2]OPERACIONES GEOMÉTRICAS");
            System.out.println("[3]SALIR ");

            do {
                System.out.print("Ingresar opcion a trabajar: ");
                opcion = sc.nextInt();
            } while (opcion < 1 || opcion > 3);

            switch (opcion) {
                case 1:
                    int numero1,
                     numero2,
                     op1;
                    double resultado;

                    do {

                        System.out.println("########### Menú Operaciones Matemáticas ###########");
                        System.out.println("[1] Sumar");
                        System.out.println("[2] Restar");
                        System.out.println("[3] Multiplicar");
                        System.out.println("[4] Dividir");
                        System.out.println("[5] Salir");

                        do {
                            System.out.print("Seleccione la opción: ");
                            op1 = sc.nextInt();
                        } while (op1 < 1 || op1 > 5);

                        switch (op1) {
                            case 1:

                                System.out.print("Ingrese el primer numero: ");
                                numero1 = sc.nextInt();

                                System.out.print("Ingrese el segundo numero: ");
                                numero2 = sc.nextInt();
                                resultado = numero1 + numero2;
                                System.out.println("La suma de los números es: " + resultado);
                                break;
                            case 2:

                                System.out.print("Ingrese el primer numero: ");
                                numero1 = sc.nextInt();

                                System.out.print("Ingrese el segundo numero: ");
                                numero2 = sc.nextInt();
                                resultado = numero1 - numero2;
                                System.out.println("La resta de los números es: " + resultado);
                                break;
                            case 3:

                                System.out.print("Ingrese el primer numero: ");
                                numero1 = sc.nextInt();

                                System.out.print("Ingrese el segundo numero: ");
                                numero2 = sc.nextInt();
                                resultado = numero1 * numero2;
                                System.out.println("La multiplicación de los números es: " + resultado);
                                break;
                            case 4:

                                System.out.print("Ingrese el primer numero: ");
                                numero1 = sc.nextInt();

                                System.out.print("Ingrese el segundo numero: ");
                                numero2 = sc.nextInt();
                                resultado = numero1 / numero2;
                                System.out.println("La división de los números es: " + resultado);
                                break;
                            default:
                                System.out.println("Eligió salir del operaciones matemáticas.");
                        }

                    } while (op1 != 5);

                    break;
                case 2:
                    int op2;
                    double radio,
                     base,
                     altura;
                    boolean calculado = true;
                    final double PI = 3.14159;

                    do {

                        System.out.println("########### Menú Operaciones Geométricas ###########");
                        System.out.println("[1]Area del Rectángulo");
                        System.out.println("[2]Area del Círculo");
                        System.out.println("[3]Salir del programa");

                        do {
                            System.out.print("Seleccione la opción: ");
                            op2 = sc.nextInt();
                        } while (op2 < 1 || op2 > 3);

                        switch (op2) {
                            case 1:
                                System.out.print("Ingrese la base del rectángulo: ");
                                base = sc.nextDouble();
                                System.out.print("Ingrese la altura del rectángulo: ");
                                altura = sc.nextDouble();
                                resultado = base * altura;
                                System.out.println("El resultado es: " + resultado);
                                break;
                            case 2:
                                System.out.print("Ingrese el radio del círculo : ");
                                radio = sc.nextDouble();
                                resultado = PI * radio * radio;
                                System.out.println("El resultado es: " + resultado);
                                break;
                            default:
                                System.out.println("Eligió salir del operaciones geométricas.");
                                calculado = false;
                        }
                    } while (op2 != 3);
                    break;
                default:
                    System.out.println("Eligió salir del programa.");
            }

        } while (opcion != 3);

    }
}
