import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("selecione sua opção: \n1 - quadrado \n2 - triangulo");
        int geometrico = scan.nextInt();
        
        while (geometrico != 1 && geometrico != 2) {
            System.out.println("selecione uma opção válida: \n1 - quadrado \n2 - triangulo");
            geometrico = scan.nextInt();
        }
        
        System.out.print("digite o valor da base: ");
        double base = scan.nextDouble();

        switch (geometrico) {
            case 1:
                calcularArea(base);
                break;
            case 2:
                System.out.print("digite o valor da altura: ");
                double altura = scan.nextDouble();
                calcularArea(base, altura);
                break;
        }

        scan.close();
    }
    public static void  calcularArea(double base, double altura){
        System.out.printf("a área do triangulo é igual a %.2f",base * altura / 2);
    }
    public static void calcularArea(double base){
        System.out.printf("a área do quadrado é igual a %.2f", base * base);
    }
}
