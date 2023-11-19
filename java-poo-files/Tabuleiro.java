public class Tabuleiro {

    public static void main(String [] args) {
        new Tabuleiro().executar();
    }
    public void executar() {
        boolean chv = false;
        for (int lin = 0; lin < 8; lin += 1) {
            for (int col = 0; col < 8; col += 1) {
                System.out.print((chv = !chv)?"**":"  ");
            }
            System.out.println();
            chv = !chv;
        }
    }

}