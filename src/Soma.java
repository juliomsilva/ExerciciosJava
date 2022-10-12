import java.util.Scanner;

//Crie um programa que receba 2 dados escritos pelo usuário e realize uma soma entre esses número e exiba o resultado no terminal.
public class Soma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int numero1 = scan.nextInt();
        System.out.println("Digite o segundo número: ");
        int numero2 = scan.nextInt();

        int resultado = numero1 + numero2;

        System.out.printf("%d + %d = %d", numero1,numero2,resultado);
    }
    }
