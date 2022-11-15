public class Ejercicio8 {
    public static void main(String[] args) {
        for (int i=1; i<=14; i++) {
            
                System.out.printf("%2d. ",i);
            for (int j=1; j<=3; j++) {
                int rand = ((int)(Math.random()*6)+1);
                switch (rand) {
                    case 1:
                    System.out.print("|1  |");
                    break;
                    case 2:
                    System.out.print("|1  |");
                    break;
                    case 3:
                    System.out.print("|1  |");
                    break;
                    case 4:
                    System.out.print("| X |");
                    break;
                    case 5:
                    System.out.print("| X |");
                    break;
                    case 6:
                    System.out.print("|  2|");
                    break;
                }
                
            }
            System.out.println();
        }
        System.out.print("\nPLENO AL 15 - Local...");
        int goles = (int)(Math.random() * 4);
        System.out.print(goles < 3 ? goles : "M");
    
        System.out.print("   Visitante...");
        goles = (int)(Math.random() * 4);
        System.out.print(goles < 3 ? goles : "M");
        
    }
}