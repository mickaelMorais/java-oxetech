import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("digite o primeiro numero: ");
        double n1 = scan.nextDouble();

        System.out.print("digite o segundo numero: ");
        double n2 = scan.nextDouble();

        System.out.printf("a soma dos numeros é igual a %.2f",n1 + n2);

        scan.close();
    }
}
