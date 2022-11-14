public class Ejercicio21 {
    public static void main(String args[]) {
        int coin;
        int flip;
        for (int i = 1; i<=5; i++) {
            coin = (int)(Math.random()*8);
            flip = (int)(Math.random()*2);
            switch (coin) {
                case 0:
                System.out.print("1 céntimo - ");
                break;

                case 1:
                System.out.print("2 céntimos - ");
                break;

                case 2:
                System.out.print("5 céntimos - ");
                break;

                case 3:
                System.out.print("10 céntimos - ");
                break;

                case 4:
                System.out.print("20 céntimos - ");
                break;

                case 5:
                System.out.print("50 céntimos - ");
                break;

                case 6:
                System.out.print("1 euro - ");
                break;

                default:
                System.out.print("2 euros - ");
                break;
            }
            switch (flip) {
                case 0:
                System.out.println("cara");
                break;

                default:
                System.out.println("cruz");
                break;

            }

        }
    }
    
}
