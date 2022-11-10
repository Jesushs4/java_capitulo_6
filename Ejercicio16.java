public class Ejercicio16 {
    public static void main(String args[]) {
        String symbol = ("");
        String symbol1 = ("");
        String symbol2 = ("");
        String symbol3 = ("");
        for (int i=1; i<=3; i++) {
        int symbolnum = ((int)(Math.random()*5)+1);
        switch (symbolnum) {
            case 1:
            symbol = "corazón";
            break;

            case 2:
            symbol = "diamante";
            break;

            case 3:
            symbol = "herradura";
            break;

            case 4:
            symbol = "campana";
            break;

            default:
            symbol = "limón";
            break;
            }
            if (i==1) {
                symbol1 = symbol;
        } else if (i==2) {
            symbol2 = symbol;
        } else {
            symbol3 = symbol;
        }
        }
        System.out.printf("%s %s %s\n",symbol1,symbol2,symbol3);
       
        if (symbol1==symbol2 && symbol1==symbol3 && symbol2==symbol3) {
            System.out.print("Enhorabuena, ha ganado 10 monedas");
        } else if (symbol1==symbol2 || symbol1==symbol3 || symbol2==symbol3) {
            System.out.print("Bien, ha recuperado su moneda"); }
            else {
            System.out.print("Lo siento, ha perdido");
        }
    }
    
}
