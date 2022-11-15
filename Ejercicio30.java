import java.util.Scanner;
public class Ejercicio30 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
        int height = sc.nextInt();
        System.out.print("Ahora introduzca la anchura (como mínimo 4): ");
        int width = sc.nextInt();
        int hfish = 1;
        int hcarac = 1;
        int hhorse = 1;
        int wcarac = 1;
        int wfish = 1;
        int whorse = 1;
        while ((hfish == hcarac && wfish == wcarac) || (hcarac == hhorse && wcarac == whorse) || (hhorse == hfish && whorse == wfish)) {
            hfish = (int)((Math.random()*(height-2)+2));
            hcarac = (int)((Math.random()*(height-2)+2));
            hhorse = (int)((Math.random()*(height-2)+2));
            wfish = (int)((Math.random()*(width-2)+2));
        
        wcarac = (int)((Math.random()*(width-2)+2));
        
        whorse = (int)((Math.random()*(width-2)+2));
        }
        for (int i = 1; i<=width; i++) {
            System.out.print("* ");       
        } System.out.println();
        for (int i = 1; i<=height-2; i++) {
            System.out.print("*");
            for (int j = 1; j<=(width*2)-3; j++) {
                if (hfish == i+1 && (wfish*2)-3 == j) {
                    System.out.print("&");
                } else if (hcarac == i+1 && (wcarac*2)-3 == j) {
                    System.out.print("@");
                } else if (hhorse == i+1 && (whorse*2)-3 == j) {
                    System.out.print("$");
                }else {
                System.out.print(" "); } 
            }
            System.out.println("*");
        }
        for (int i = 1; i<=width; i++) {
            System.out.print("* ");       
        } System.out.println();
    }
    
}
