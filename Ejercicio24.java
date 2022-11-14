import java.util.Scanner;
public class Ejercicio24 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero entero positivo: ");
        int number = sc.nextInt();
        int aux = number;
        int digits = 0;

        while (aux>0) {
            aux /= 10;
            digits++;
        }

        int position = ((int)(Math.random()*(digits)))+1;
        aux = number;

        for (int i = 1; i<=position-1; i++) {
            aux /= 10;
        }

        System.out.print(aux%10);
    }
    
}
