import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("digite um número: ");
        int numero = scan.nextInt();

        System.out.printf("\nseu valor com incremento %d\n",numero + 1);
        System.out.printf("seu valor com decremento %d",numero - 1);

        scan.close();
    }
}
