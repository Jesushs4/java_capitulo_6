public class Ejercicio19 {
    public static void main(String args[]) {
        int maxnum = 0;
        int minnum = 0;
        int sum = 0;
        int number;
        for (int i = 0; i<50; i++) {
            number = ((int)((Math.random()*301))-100);
            System.out.print(number+" ");
            if (number % 2==0) {
            maxnum = Math.max(maxnum, number); }
            if (number % 2==0) {
            minnum = Math.min(minnum, number); }
            sum += number;
        }
        
        System.out.printf("\n\nEl número más alto es %d, el más bajo es %d y la media es %f", maxnum, minnum, (float)sum/50);

    }
    
}
