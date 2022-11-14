public class Ejercicio23 {
    public static void main(String args[]) {
        int dice;
        for (int i=1; i<=5; i++) {
        dice = (int)(Math.random()*6);
        switch (dice) {
            case 0:
            System.out.print("As ");
            break;

            case 1:
            System.out.print("K ");
            break;

            case 2:
            System.out.print("Q ");
            break;

            case 3:
            System.out.print("J ");
            break;

            case 4:
            System.out.print("7 ");
            break;

            default:
            System.out.print("8 ");
            break;
        }
    }
    }
}
