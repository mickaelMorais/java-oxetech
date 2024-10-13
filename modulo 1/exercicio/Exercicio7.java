import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("digite seu nome: ");
        String nome = scan.nextLine();
        
        System.out.printf("\nOla %s seja bem vindo(a)!!!",nome);
    }
}
