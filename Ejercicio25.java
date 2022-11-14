public class Ejercicio25 {
    public static void main(String args[]) {
        int longitud = 100;
        int randnum;
        boolean comp = false;

        for (int i = 1; i<=longitud; i++) {
            randnum = (int)(Math.random()*191)+10;
            comp = false;
            int count = 2;
            while (randnum > count && comp == false) {
                if (randnum % count == 0) {
                    comp = true;
                }
                else {
                    count++;
            } 
        }
            if (comp == false) {
                System.out.print("#"+randnum+"# ");
            } else if (randnum % 5 == 0) {
                System.out.print("["+randnum+"] ");
                
            } else {
                System.out.print(randnum+" ");
            }
           
    
    }
}
}
    
