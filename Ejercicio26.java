import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la anchura de la tableta: ");
        int width = sc.nextInt();
        System.out.print("Introduzca la altura de la tableta: ");
        int height = sc.nextInt();
        int randheight = ((int)(Math.random()*height))+1;
        int randwidth = ((int)(Math.random()*width))+1;
        for (int i = 1; i<=randheight-1; i++) {
            for (int j = 1; j<=width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i<=randwidth; i++) {
            System.out.print("*");
        } System.out.print(" ");
        for (int i = 1; i<=width-randwidth-1; i++) {
            System.out.print("*"); }
        System.out.println();
        for (int i = 1; i<=height-randheight; i++) {
            for (int j = 1; j<=width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
