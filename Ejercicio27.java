import java.util.Scanner;
public class Ejercicio27 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Turno del jugador (introduzca piedra, papel o tijera): ");
        String player = sc.next();
        System.out.print("Turno del ordenador: ");
        int randomcomputer = (int)(Math.random()*3);
        String computer;
        switch (randomcomputer) {
            case 0:
            computer = "piedra";
            break;

            case 1:
            computer = "tijera";
            break;

            default:
            computer = "papel";
            break;
        }
        System.out.println(computer);
        if (computer.equals(player)) {
            System.out.print("Empate");
        } else if (player.equals("piedra") && computer.equals("tijera")) {
            System.out.print("El jugador gana");
        } else if (player.equals("piedra") && computer.equals("papel")) {
            System.out.print("El ordenador gana");
        } else if (player.equals("tijera") && computer.equals("piedra")) {
            System.out.print("El ordenador gana");
        } else if (player.equals("tijera") && computer.equals("papel")) {
            System.out.print("El jugador gana");
        } else if (player.equals("papel") && computer.equals("piedra")) {
            System.out.print("El jugador gana");
        } else if (player.equals("papel") && computer.equals("tijera")) {
            System.out.print("El ordenador gana");
        } else {
            System.out.print("Introduzca una opción válida");
        }

    }
    
}
