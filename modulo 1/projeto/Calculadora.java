import java.util.Scanner;

public class Calculadora{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Operadores calcular = new Operadores();

        System.out.print("digite seu nome: ");
        String nome = scan.nextLine();
        System.out.printf("Óla, %s, bem vindo(a) a minha calculadora \n\n",nome);

        System.out.print("digite o primeiro numero: ");
        double numero1 = scan.nextDouble();

        System.out.print("digite o segundo numero: ");
        double numero2 = scan.nextDouble();

        double resultSoma = calcular.soma(numero1, numero2);
        double resultSub = calcular.sub(numero1, numero2);
        double resultMult = calcular.mult(numero1, numero2);
        double resultDiv = numero1 == 0 ? -1 : numero2 == 0 ? -1 : calcular.div(numero1, numero2);

        System.out.println("\ncalculando com valores decimais:");
        System.out.printf("resultado da operação %.2f + %.2f = %.2f\n",numero1,numero2,resultSoma);
        System.out.printf("resultado da operação %.2f - %.2f = %.2f\n",numero1,numero2,resultSub);
        System.out.printf("resultado da operação %.2f * %.2f = %.2f\n",numero1,numero2,resultMult); 
        System.out.printf("resultado da operação %.2f / %.2f = %.2f\n",numero1,numero2,resultDiv);

        int numero1Int = (int) numero1;
        int numero2Int = (int) numero2;
        int resultSomaInt = (int) resultSoma;
        int resultSubInt = (int) resultSub;
        int resultMultInt = (int) resultMult;
        int resultDivInt = (int) resultDiv;

        System.out.println("\ncalculando com valores inteiros:");
        System.out.printf("resultado da operação %d + %d = %d\n",numero1Int,numero2Int,resultSomaInt);
        System.out.printf("resultado da operação %d - %d = %d\n",numero1Int,numero2Int,resultSubInt);
        System.out.printf("resultado da operação %d * %d = %d\n",numero1Int,numero2Int,resultMultInt);
        System.out.printf("resultado da operação %d / %d = %d",numero1Int,numero2Int,resultDivInt);

        scan.close();
    }
}