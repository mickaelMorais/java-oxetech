import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Essa calculadora mágica vai adivinhar o numero que você esta pensando");

        System.out.print("\ndigite um numero qualquer: ");
        int numero = scan.nextInt();

        System.out.printf("você pensou no numero.....%d",numero);
    }
}
