public class Ejercicio15 {
    public static void main(String args[]) {
        int repeat = (int)(Math.random()*7)*4;
        String musicnote;
        String firstnote = "do";
        for (int i=1; i<=repeat; i++) {
            int musicnum = (int)(Math.random()*(7)+1);
            switch (musicnum) {
                case 1:
                musicnote = "do";
                break;

                case 2:
                musicnote = "re";
                break;

                case 3:
                musicnote = "mi";
                break;

                case 4:
                musicnote = "fa";
                break;

                case 5:
                musicnote = "sol";
                break;

                case 6:
                musicnote = "la";
                break;

                default:
                musicnote = "si";
                break;
            }
            if (i==1) {
                firstnote = musicnote;
            }
            if (i==repeat) {
                System.out.print(firstnote+" | ");
            } else {
            System.out.print(musicnote+" "); }
            if (i%4==0) {
                System.out.print("| ");
            }
        }
    }
    
}
