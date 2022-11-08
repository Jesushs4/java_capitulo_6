public class Ejercicio1 {
    public static void main(String args[]) {
        int dice1 = ((int)(Math.random()*6)+1);
        int dice2 = ((int)(Math.random()*6)+1);
        int dice3 = ((int)(Math.random()*6)+1);
        System.out.printf("Dado 1: %d\nDado 2: %d\nDado 3: %d\nTotal: %d",dice1,dice2,dice3,dice1+dice2+dice3);
}
}