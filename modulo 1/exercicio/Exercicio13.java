import java.util.Scanner;

 class Exercicio13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("digite o valor para ser convertido: ");
        double valor = scan.nextDouble();

        int valorInt = (int) valor;

        System.out.printf("o valor convertido mais 10 é %d",valorInt + 10);

        scan.close();
    }
}