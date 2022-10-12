package ClinicaEmagrecimento;

public class Cliente {
    Double peso;
    Double altura;
    Integer idade;

    public Cliente(Double peso, Double altura) {
        this.peso = peso;
        this.altura = altura;


    }

    public Cliente(Double peso, Double altura, Integer idade) {
        this.peso = peso;
        this.altura = altura;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "peso=" + peso +
                ", altura=" + altura +
                ", idade=" + idade +
                '}';
    }

    public static double calcularImc(Double peso, Double altura){
    double imc;
    imc = peso / (altura*altura);
    if(imc<18.50){
        System.out.print("Muito magro");
    } else if (imc >= 18.50 && imc <= 24.90) {
        System.out.print("Normal");

    }else if(imc >= 25.0 && imc <= 29.9){
        System.out.print("Sobrepeso");
    } else if (imc >= 30.0 && imc <= 34.90) {
        System.out.print("Obeso grau I");
    }else if (imc >= 35.0 && imc <= 39.99) {
        System.out.print("Obeso grau II");
    }else{
        System.out.print("Obeso grau III ou Mórbido");
    }

        return imc;
    }

}

