public class Ejercicio11 {
    public static void main(String args[]) {
        int suscount = 0;
        int sufcount = 0;
        int biencount = 0;
        int notabcount = 0;
        int sobresalcount = 0;
        int mark = 0;
        for (int i = 1; i<=20; i++) {
            mark = (int)(Math.random()*5);
            switch (mark) {
                case 0:
                System.out.print("Suspenso");
                suscount++;
                break;

                case 1:
                System.out.print("Suficiente");
                sufcount++;
                break;

                case 2:
                System.out.print("Bien");
                biencount++;
                break;

                case 3:
                System.out.print("Notable");
                notabcount++;
                break;

                case 4:
                System.out.print("Sobresaliente");
                sobresalcount++;
                break;
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Suspensos: "+suscount);
        System.out.println("Suficientes: "+sufcount);
        System.out.println("Bienes: "+biencount);
        System.out.println("Notables: "+notabcount);
        System.out.println("Sobresalientes: "+sobresalcount);
    }
    
}
    