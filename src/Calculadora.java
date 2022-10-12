import java.util.Scanner;

//Crie uma calculadora que irá receber 2 número e um operador(soma, subtracao, multiplicacao ou divisao)
// e esse programa deve retornar o valor da operação realizada
public class Calculadora {
    public static void main(String[] args) {
        System.out.println("""
                Utilize os números para Selecionar:\s
                 1 - Soma
                 2 - Subtração
                 3 - Multiplicação
                 4 - Divisão""");
        Scanner scan = new Scanner(System.in);
        System.out.print("\nEscolher Operação: ");
        int opcao = scan.nextInt();
        int n1,n2;

        switch (opcao){
            case 1:
                System.out.println("Soma");

                System.out.print("Digite o primeiro número: ");
                n1 = scan.nextInt();
                System.out.print("Digite o segundo número: ");
                n2 = scan.nextInt();
                System.out.printf("%d + %d = %d",n1,n2,n1+n2);
                break;
            case 2:
                System.out.println("Subtração");
                System.out.print("Digite o primeiro número: ");
                n1 = scan.nextInt();
                System.out.print("Digite o segundo número: ");
                n2 = scan.nextInt();
                System.out.printf("%d - %d = %d",n1,n2,n1-n2);

                break;
            case 3:
                System.out.println("Multiplicação");
                System.out.print("Digite o primeiro número: ");
                n1 = scan.nextInt();
                System.out.print("Digite o segundo número: ");
                n2 = scan.nextInt();
                System.out.printf("%d * %d = %d",n1,n2,n1*n2);
                break;
            case 4:
                System.out.println("Divisão");
                System.out.print("Digite o primeiro número: ");
                n1 = scan.nextInt();
                System.out.print("Digite o segundo número: ");
                n2 = scan.nextInt();
                System.out.printf("%d / %d = %d",n1,n2,n1/n2);
                break;
        }

    }
}
