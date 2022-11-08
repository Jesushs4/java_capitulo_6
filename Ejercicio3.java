public class Ejercicio3 {
    public static void main(String args[]) {
        int cardnum = (((int)(Math.random()*10)+1));
        switch (cardnum) {
            case 1:
            System.out.print("La carta es una as de ");
            break;

            case 8:
            System.out.print("La carta es un sota de ");
            break;

            case 9:
            System.out.print("La carta es un caballo de ");
            break;

            case 10:
            System.out.print("La carta es un rey de ");
            break;

            default:
            System.out.print("La carta es un "+cardnum+" de ");

        }
        int cardsuit = ((int)(Math.random()*4));
        switch (cardsuit) {
            case 0:
            System.out.print("oro");
            break;

            case 1:
            System.out.print("copas");
            break;

            case 2:
            System.out.print("espadas");
            break;

            default:
            System.out.print("bastos");
            break;
        }
    }
    
}
