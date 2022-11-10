public class Ejercicio10 {
    public static void main(String args[]) {
        String character = "a";
        for (int i = 1; i<=10; i++) {
            int charlength = ((int)(Math.random()*40)+1);
            for (int j = 1; j<=charlength; j++) {
                int chartype = (int)(Math.random()*7);
                switch (chartype) {
                    case 0:
                    character = "*";
                    break;

                    case 1:
                    character = "-";
                    break;

                    case 2:
                    character = "=";
                    break;

                    case 3:
                    character = ".";
                    break;

                    case 4:
                    character = "*";
                    break;

                    case 5:
                    character = "|";
                    break;

                    case 6:
                    character = "@";
                    break;
                    
                }
                System.out.print(character);
            } 
            System.out.println();
        }
    }
    
}
