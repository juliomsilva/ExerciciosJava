//Recrie o programa do exercicio 6 e o coloque dentro de um bloco try-catch.
// Coloque um catch para o NullPointerException e um catch para uma Exception Genérica.

public class SegurancaExecucao {
    public static void main(String[] args) {
        try {

            int n1 = 10;
            int n2 = 0;

            System.out.println(n1/n2);


        }catch (Exception e) {
            System.out.println("Deu ruim no calculo");
        }
        try {
            String Vazio = null;
            Vazio.startsWith("a");

        }catch (NullPointerException e){
            System.out.println("String vazia");
        }



    }
}
