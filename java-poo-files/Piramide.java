import java.util.Scanner;

class Piramide {
    private Scanner sc = new Scanner(System.in);
    private int lin;

    public static void main(String[] args) {
        new Piramide().criar();
    }
    private void criar() {
        System.out.println("Quantas linhas tem a pirâmide?");
        lin = sc.nextInt();
        int qtdBranco;
        int ast = 1;
        for (int i = 1; i <= lin; i += 1) {
            qtdBranco = lin - i;
            for (int x = 0; x < qtdBranco; x+=1) {
                System.out.print(' ');
            }
            for (int x = 0; x < ast; x+=1) {
                System.out.print('*');
            }
            ast += 2;
            System.out.println();
        }
    }
}