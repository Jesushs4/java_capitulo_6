import java.util.Scanner;
public class Ejercicio22 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la longitud de la serpiente en caracteres contando la cabeza: ");
        int snake = sc.nextInt();
        int spaces = 12;
        int randnum;

        for (int i = 1; i<=spaces; i++) {
            System.out.print(" ");
        }
        System.out.println("0");
        for (int i = 1; i<=snake-1; i++) {
            randnum = (int)(Math.random()*3)-1;
            spaces += randnum;
            for (int j = 1; j<=spaces; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
}
