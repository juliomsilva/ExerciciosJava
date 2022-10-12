//Crie um Loop que irá receber 10 nomes e após isso irá exibir os nomes
// e a posição deles na lista. Utilize um array(vertor) para esses exercício.

import java.util.Scanner;

public class Nomes {
    public static void main(String[] args) {
        String [] nomes = new String[10];
        Scanner scan = new Scanner(System.in);

        for (int i = 0;i < nomes.length;i++){
            System.out.print("Insira um nome na lista: ");
            nomes[i] = scan.nextLine();
        }

        for(int i = 0;i < nomes.length;i++){
            System.out.printf("\nNome: %s, Posição: %d", nomes[i], i);
        }
    }
}
