public class Ejercicio12 {
    public static void main(String args[]) throws InterruptedException {
        System.out.print("\033[32m");
    for (int i=1; i<=8000; i++) {
        System.out.print((char)((int)(Math.random()*127-32)+32));
        Thread.sleep(1);
    }

    }
}
