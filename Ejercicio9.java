public class Ejercicio9 {
    public static void main(String args[]) {
        boolean samenum = false;
        int numcount = 0;
        while (samenum == false) {
            int randnum = ((int)(Math.random()*101));
            if (randnum%2 == 0) {
                System.out.print(randnum+" ");
                numcount++;
                if (randnum == 24) {
                    samenum = true;
                }
            }

        }
        System.out.printf("\nSe han generado %d números",numcount);
    }
    
}
