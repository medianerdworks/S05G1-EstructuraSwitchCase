package estructuraSwitchCase;
import java.util.Scanner;
public class Ejemplo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        String dia="Ud. seleccionó el día ";
        System.out.print("Ingresar día de la semana indicando el número: ");
        numero=sc.nextInt();
        switch (numero) {
            case 1:
                dia+="lunes";
                break;
            case 2:
                dia+="martes";
                break;
            case 3:
                dia+="miércoles";
                break;
            case 4:
                dia+="jueves";
                break;
            case 5:
                dia+="viernes";
                break;
            case 6:
                dia+="sabado";
                break;
            case 7:
                dia+="domingo";
                break;
            default:
                throw new AssertionError();
        }
        System.out.println(dia);
    }
}
