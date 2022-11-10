public class Ejercicio13 {
    public static void main(String args[]) {
        int dado1 = 0;
        int dado2 = 1;
        while (dado1 != dado2) {
            dado1 = ((int)(Math.random()*6)+1);
            dado2 = ((int)(Math.random()*6)+1);
            System.out.printf("El primer dado es un %d y el segundo dado un %d\n",dado1,dado2);

        }
        System.out.printf("Ambos dados dan %d",dado1);
    }
    
}
