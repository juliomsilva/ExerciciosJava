package ClinicaEmagrecimento;

public class Cliente {
    Double peso;
    Double altura;
    Integer idade;

public static void calcularImc(Double peso, Double altura){
    double imc;
    imc = peso / (altura*altura);
    System.out.printf("IMC: %.1f\n",imc);
    if(imc<18.50){
        System.out.println("Muito magro");
    } else if (imc >= 18.50 && imc <= 24.90) {
        System.out.println("Normal");

    }else if(imc >= 25.0 && imc <= 29.9){
        System.out.println("Sobrepeso");
    } else if (imc >= 30.0 && imc <= 34.90) {
        System.out.println("Obeso grau I");
    }else if (imc >= 35.0 && imc <= 39.99) {
        System.out.println("Obeso grau II");
    }else{
        System.out.println("Obeso grau III ou Mórbido");
    }

}

}

