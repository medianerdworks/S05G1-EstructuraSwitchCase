package estructuraDoWhile;

public class Ejemplo01 {
    public static void main(String[] args) {
        int x=0;
        do {
            System.out.println("Valor de x: "+x);
            x++;
        } while (x<=3);
        
        System.out.println("Valor final de x: "+x);
    }
}
