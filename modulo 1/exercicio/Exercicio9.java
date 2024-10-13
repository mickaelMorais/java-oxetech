import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("digite sua idade: ");
        int idade = scan.nextInt();

        boolean inclusivo = idade >= 16 && idade <= 18 ? true : false;
        boolean maior65 = idade > 65 ? true : false;

        System.out.printf("inclusivo? %b\nmaior que 65? %b", inclusivo, maior65);



        scan.close();
    }
}
