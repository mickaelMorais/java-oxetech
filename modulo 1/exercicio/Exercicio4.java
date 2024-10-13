import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("digite um número para verificar se ele é par ou ímpar: ");
        int numero = scan.nextInt();
        String parInpar = numero % 2 == 0 ? "par" : "impar";

        System.out.printf("Seu número é %s", parInpar);

        scan.close();
    }
}