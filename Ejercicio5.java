public class Ejercicio5 {
    public static void main(String args[]) {
        int maxnum = 0;
        int minnum = 200;
        int result = 0;
        for (int i=1; i<=50; i++) {
            int randnum = (int)((Math.random()*100)+100);
            System.out.print(randnum+" ");
            maxnum = Math.max(maxnum, randnum);
            minnum = Math.min(minnum, randnum);
            result += randnum;
        } System.out.println();
        System.out.print("El número máximo es "+maxnum+" y el número mínimo es "+minnum+" y la media es "+(float)result/50);
    }
    
}
