import java.util.Scanner;
public class Ejercicio14 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int chances = 5;
        boolean success = false;
        int rangemax = 101;
        int rangemin = 0;
        while (chances>=1 && success == false) {
            int guess = ((int)(Math.random()*(rangemax-rangemin))+rangemin);
            System.out.printf("¿El número es %d, o es mayor o menor? 1. Si  2. Mayor  3. Menor\n",guess);
            int userinput = sc.nextInt();
            switch (userinput) {
                case 1:
                success = true;
                System.out.print("Bien, he acertado!");
                break;

                case 2:
                rangemin = guess+1;
                break;

                case 3:
                rangemax = guess-1;
                break;


                default:
                System.out.printf("Elija una opción entre 1 y 3\n");
                break;
            }
            chances--;
        }
        if (success==false) {
            System.out.println("No he acertado...");
        }
        sc.close();
    }
    
}
