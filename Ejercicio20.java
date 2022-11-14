import java.util.Scanner;
public class Ejercicio20 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la capacidad de la cuba: ");
        int capacity = sc.nextInt();
        int fill = (int)(Math.random()*capacity)+1;
        for (int i = 1; i<=capacity-fill; i++) {
            System.out.println("*   *");
        }
        for (int i = 1; i<=fill; i++) {
            System.out.println("*===*");
        }
        System.out.println("*****");
        System.out.printf("\nLa cuba contiene una capacidad de %d litros y contiene %d litros de agua",capacity,fill);
    }
    
}
