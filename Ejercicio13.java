public class Ejercicio13 {
    public static void main(String args[]) {
        int dice1 = 0;
        int dice2 = 1;
        while (dice1 != dice2) {
            dice1 = ((int)(Math.random()*6)+1);
            dice2 = ((int)(Math.random()*6)+1);
            System.out.printf("El primer dado es un %d y el segundo dado un %d\n",dice1,dice2);

        }
        System.out.printf("Ambos dados dan %d",dice1);
    }
    
}
