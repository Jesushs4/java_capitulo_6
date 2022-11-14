import java.util.Scanner;
public class Ejercicio17 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
        int height = sc.nextInt();
        System.out.print("Ahora introduzca la anchura (como mínimo 4): ");
        int width = sc.nextInt();
        int hfish = (int)((Math.random()*(height-2)+2));
        int wfish = (int)((Math.random()*(width-2)+2));
        System.out.println(hfish+" "+wfish);
        for (int i = 1; i<=width; i++) {
            System.out.print("* ");       
        } System.out.println();
        for (int i = 1; i<=height-2; i++) {
            System.out.print("*");
            for (int j = 1; j<=(width*2)-3; j++) {
                if (hfish == i+1 && (wfish*2)-3 == j) {
                    System.out.print("&");
                } else {
                System.out.print(" "); } 
            }
            System.out.println("*");
        }
        for (int i = 1; i<=width; i++) {
            System.out.print("* ");       
        } System.out.println();
    }
    
}
