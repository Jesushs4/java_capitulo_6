import java.util.Scanner;
public class Ejercicio32 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura del sendero: ");
        int height = sc.nextInt();
        int spaces1 = 6;
        int spaces2 = 4;
        int obstacleposition;
        char obstacle;
        
        for (int sendero=1; sendero<=height; sendero++) {
            
            for (int i=1; i<=spaces1; i++) {
                System.out.print(" ");
            }
            System.out.print("|");

            obstacleposition = -1;
            obstacle = '*';
            if (((int)(Math.random()*2))==0) {
                obstacleposition = ((int)(Math.random()*4))+1;
                if (((int)(Math.random()*2))==0) {
                    obstacle = 'O';
                }
            }

            for (int j = 1; j<=spaces2; j++) {
                System.out.print(j == obstacleposition ? obstacle : " ");
            }

            System.out.print("|");

            System.out.println();
            spaces1 += ((int)(Math.random()*3)-1);
            
        }
    }
    
}
