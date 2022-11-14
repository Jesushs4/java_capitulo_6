public class Ejercicio18 {
    public static void main(String args[]) {
        
        int colour1 = 1;
        int colour2 = 1;
        int colour3 = 1;
        
        String roomcolour1 = "a";
        String roomcolour2 = "b";
        String roomcolour3 = "c";

        while ((colour1 == colour2) || (colour2 == colour3) || (colour3 == colour1)) {
        colour1 = (int)(Math.random()*6);
        colour2 = (int)(Math.random()*6);
        colour3 = (int)(Math.random()*6);

        switch (colour1) {
            case 0:
            roomcolour1 = "rojo";
            break;

            case 1:
            roomcolour1 = "azul";
            break;

            case 2:
            roomcolour1 = "verde";
            break;

            case 3:
            roomcolour1 = "amarillo";
            break;

            case 4:
            roomcolour1 = "violeta";
            break;

            case 5:
            roomcolour1 = "naranja";
            break;


        }
        switch (colour2) {
            case 0:
            roomcolour2 = "rojo";
            break;

            case 1:
            roomcolour2 = "azul";
            break;

            case 2:
            roomcolour2 = "verde";
            break;

            case 3:
            roomcolour2 = "amarillo";
            break;

            case 4:
            roomcolour2 = "violeta";
            break;

            case 5:
            roomcolour2 = "naranja";
            break;


        }
        switch (colour3) {
            case 0:
            roomcolour3 = "rojo";
            break;

            case 1:
            roomcolour3 = "azul";
            break;

            case 2:
            roomcolour3 = "verde";
            break;

            case 3:
            roomcolour3 = "amarillo";
            break;

            case 4:
            roomcolour3 = "violeta";
            break;

            case 5:
            roomcolour3 = "naranja";
            break;


        }
        }
        System.out.printf("Primer dormitorio: %s\nSegundo dormitorio: %s\nTercer dormitorio: %s",roomcolour1,roomcolour2,roomcolour3);

    }
    
}
