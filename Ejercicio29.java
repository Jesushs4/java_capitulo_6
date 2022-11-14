import java.util.Scanner;
public class Ejercicio29 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int maxtemp;
        int mintemp;
        int weather;
        System.out.println("1. Primavera");
        System.out.println("2. Verano");
        System.out.println("3. Otoño");
        System.out.println("4. Invierno");
        System.out.print("Seleccione la estación del año (1-4): ");
        int season = sc.nextInt();
        switch (season) {
            case 1:
            maxtemp = ((int)(Math.random()*16))+15;
            mintemp = ((int)(Math.random()*(maxtemp-15)))+15;
            System.out.printf("Temperatura mínima: %dºC\nTemperatura máxima: %dºC\n", mintemp, maxtemp);
            weather = (((int)(Math.random()*10))+1);
            if (weather<=6) {
                System.out.print("Soleado");
            } else {
                System.out.print("Nublado");
            }
            break;

            case 2:
            maxtemp = ((int)(Math.random()*26))+25;
            mintemp = ((int)(Math.random()*(maxtemp-25)))+25;
            System.out.printf("Temperatura mínima: %dºC\nTemperatura máxima: %dºC\n", mintemp, maxtemp);
            weather = (((int)(Math.random()*10))+1);
            if (weather<=8) {
                System.out.print("Soleado");
            } else {
                System.out.print("Nublado");
            }
            break;

            case 3:
            maxtemp = ((int)(Math.random()*21))+20;
            mintemp = ((int)(Math.random()*(maxtemp-20)))+20;
            System.out.printf("Temperatura mínima: %dºC\nTemperatura máxima: %dºC\n", mintemp, maxtemp);
            weather = (((int)(Math.random()*10))+1);
            if (weather<=4) {
                System.out.print("Soleado");
            } else {
                System.out.print("Nublado");
            }
            break;

            case 4:
            maxtemp = ((int)(Math.random()*26));
            mintemp = ((int)(Math.random()*(maxtemp)));
            System.out.printf("Temperatura mínima: %dºC\nTemperatura máxima: %dºC\n", mintemp, maxtemp);
            weather = (((int)(Math.random()*10))+1);
            if (weather<=2) {
                System.out.print("Soleado");
            } else {
                System.out.print("Nublado");
            }
            break;
        }
    }
    
}
