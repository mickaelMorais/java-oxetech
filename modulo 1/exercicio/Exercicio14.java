import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("digite algo: ");
        String str = scan.nextLine();

        imprimirMensagem(str);

        scan.close();
    }
    public static void  imprimirMensagem(String str) {
        System.out.println(str);
    }
}
