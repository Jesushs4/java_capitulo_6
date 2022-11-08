public class Ejercicio2 {
    public static void main(String args[]) {
        int cardnum = (((int)(Math.random()*13)+1));
        switch (cardnum) {
            case 1:
            System.out.print("La carta es una A de ");
            break;

            case 11:
            System.out.print("La carta es una J de ");
            break;

            case 12:
            System.out.print("La carta es una Q de ");
            break;

            case 13:
            System.out.print("La carta es una K de ");
            break;

            default:
            System.out.print("La carta es un "+cardnum+" de ");

        }
        int cardsuit = ((int)(Math.random()*4));
        switch (cardsuit) {
            case 0:
            System.out.print("picas");
            break;

            case 1:
            System.out.print("diamantes");
            break;

            case 2:
            System.out.print("corazones");
            break;

            default:
            System.out.print("tréboles");
            break;
        }
    }
    
}
