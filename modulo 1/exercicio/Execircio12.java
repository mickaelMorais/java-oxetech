import java.util.Scanner;

 class Exercicio12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("digite o valor para ser convertido: ");
        double valor = scan.nextDouble();

        int valorInt = (int) valor;

        System.out.printf("o valor convertido é %d",valorInt);

        scan.close();
    }
}
