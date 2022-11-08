import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int secretnum = (int)(Math.random()*101);
        int attempts = 5;
        boolean success = false;
        while (attempts>0 && success == false) {
            System.out.print("Diga un numero: ");
            int guess = sc.nextInt();
            if (guess == secretnum) {
                System.out.print("Has acertado!");
                success = true;
            } else {
                attempts--;
                if (attempts>0) {
                System.out.println("Te quedan "+attempts+" intentos");
                if (guess > secretnum) {
                    System.out.printf("El número que estoy pensando es menor que el que has introducido\n\n");
                } else {
                    System.out.printf("El número que estoy pensando es mayor que el que has introducido\n\n");
                } }
            }
        }
        if (success==false) {
            System.out.println("Lo siento, no has acertado. El número era el "+secretnum);
        }
    }
    
}
