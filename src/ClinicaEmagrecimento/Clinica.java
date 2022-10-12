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
             System.out.printf(" - IMC:%.2f Peso:%.1f Altura:%.2f\n", resultadoIMC,r.peso, r.altura);

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

    }


}
