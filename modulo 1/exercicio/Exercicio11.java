import java.util.Scanner;

 class Exercicio11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("digite o valor em metros para ser convertido: ");
        double valorM = scan.nextDouble();

        System.out.printf("o valor convertido é %.2f cm", valorM * 100);

        scan.close();
    }
}
