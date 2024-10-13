import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("digite nota 1: ");
        double nota1 = scan.nextDouble();

        System.out.print("digite nota2: ");
        double nota2 = scan.nextDouble();

        System.out.print("digite nota3: ");
        double nota3 = scan.nextDouble();

        String aprovação = (nota1 + nota2 + nota3) / 3 >= 6 ? "aprovado" : "reprovado";

        System.out.printf("\n você foi %s", aprovação);


        scan.close();
    }
}
