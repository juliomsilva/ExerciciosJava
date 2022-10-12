//Crie um programa que gera um exception sempre que executado, pegue essa exception em um Catch e print a mensagem de erro.
public class Throws {
    public static void main(String[] args) {

        try {
            int n1 = 10;
            int n2 = 0;

            System.out.println(n1/n2);

        }catch (Exception e){
            System.out.println("Deu ruim, reveja o código.");
        }


    }
}
