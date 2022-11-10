public class Ejercicio7 {
    public static void main(String[] args) {
        for (int i=1; i<=15; i++) {
            if (i<10) {
                System.out.print(" "+i+". ");
            } else {
            System.out.print(i+". "); }
            for (int j=1; j<=3; j++) {
                int rand = ((int)(Math.random()*3)+1);
                switch (rand) {
                    case 1:
                    System.out.print("|1  |");
                    break;
                    case 2:
                    System.out.print("| X |");
                    break;
                    case 3:
                    System.out.print("|  2|");
                    break;
                }
                
            }
            System.out.println();
        }
    }
}