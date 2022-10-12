package ClinicaEmagrecimento;

import java.util.*;

public class Clinica {
    static List<Cliente> clientes = new ArrayList<>();
    String dono;

    public static void cadastrarCliente(Cliente cliente){
        clientes.add(cliente);
    }

    public static void categorizarCliente(){
         clientes.forEach(r -> {
             double resultadoIMC = Cliente.calcularImc(r.peso,r.altura);
             System.out.printf(" - IMC:%.2f Peso:%.1fKg Altura:%.2f\n", resultadoIMC,r.peso, r.altura);

    });
    }

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(80.0,1.70);
        Cliente cliente2 = new Cliente(75.0,1.70);
        Cliente cliente3 = new Cliente(85.0,1.70);
        Cliente cliente4 = new Cliente(60.0,1.70);

        cadastrarCliente(cliente1);
        cadastrarCliente(cliente2);
        cadastrarCliente(cliente3);
        cadastrarCliente(cliente4);


        categorizarCliente();


        tratamentoPersonalizado(cliente1,10);
    }

    public static void tratamentoCinco(Cliente cliente) {

        System.out.println("\nBem vindo ao tratamento de redução de 5kg");
        System.out.println("--------------------------------------------");
        System.out.printf("Seu peso atual é de: %.2fKg\n",cliente.peso);
        System.out.printf("\nApós o tratamento seu peso será: %.2fKg ",(cliente.peso-5));




    }
    public static void tratamentoPersonalizado(Cliente cliente, Integer kg){

        System.out.println("\nBem vindo ao tratamento Personalizado, \naqui você escolhe o quanto quer emagrecer");
        System.out.println("--------------------------------------------");
        System.out.printf("Você ira reduzir %dKg após o tratamento",kg);
        System.out.printf("\nPeso atual:%.2fKg, peso após o tratamento:%.2fkg",cliente.peso,(cliente.peso-kg));

    }
}
