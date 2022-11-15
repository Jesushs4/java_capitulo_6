import java.util.Scanner;
public class Ejercicio31 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        boolean lose = false;
        boolean win = false;
        int dice1 = (int)(Math.random()*6)+1;
        int dice2 = (int)(Math.random()*6)+1;
        System.out.print("Introduzca el dinero que quiere apostar: ");
        int bet = sc.nextInt();

        int totaldice = dice1+dice2;
        int aux = totaldice;
        System.out.printf("Dado 1: %d  Dado 2: %d  Total: %d",dice1,dice2,totaldice);

        if ((totaldice==11) || (totaldice==7)) {
            System.out.printf("\nFelicidades, ha ganado %d euros", bet*2);

        } else if ((totaldice==2) || (totaldice==3) || (totaldice==12)) {
            System.out.print("\nLo siento, ha perdido.");

        } else {
        System.out.print("\n\nSEGUNDA ETAPA\n-------------\n");
        while (lose == false && win == false) {
            dice1 = (int)(Math.random()*6)+1;
            dice2 = (int)(Math.random()*6)+1;
            totaldice = dice1+dice2;
            System.out.printf("Dado 1: %d  Dado 2: %d  Total: %d\n",dice1,dice2,totaldice);
            if (totaldice == aux) {
                win = true;
            } else if (totaldice == 7) {
                lose = true;
            }
        }
        if (win == true) {
            System.out.printf("\nFelicidades, ha ganado %d euros", bet*2);
        }
        if (lose == true) {
            System.out.print("\nLo siento, ha perdido.");
        }
    }

        
    }
    
}
