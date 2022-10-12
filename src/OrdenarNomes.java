//Crie uma lista de nomes com Array List e salve nomes incluidos pelo usuário até receber a palavra "fim", a inclusão
// de nomes deve ser feita através do loop Do While.
//os nomes da lista devem ser ordenados em ordem alfabética e exibidos na tela um a um.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OrdenarNomes {
    public static void main(String[] args) {
        ArrayList<String> listaNomes = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String adicionarNome = "";

        do {
            System.out.print("Adicione um nome ou digite fim para terminar o programa: ");
            adicionarNome = scan.nextLine();
            listaNomes.add(adicionarNome);
        }while (!adicionarNome.equals("fim"));

       int array = listaNomes.size() - 1;
       listaNomes.remove(array);

        Collections.sort(listaNomes);

        listaNomes.forEach(item -> System.out.println(item));
    }

}
