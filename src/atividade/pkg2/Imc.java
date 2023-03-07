package atividade.pkg2;

public class Imc {

    public static double calcularImc(double peso, double altura) {
        double resultado = peso / (altura * altura);
        return resultado;

    }

    public static String classificarImc(double imc) {
        String resultado = "";

        if (imc < 18.5) {
            resultado = "Magreza";
        } else if (imc > 18.50 && imc < 24.99) {
            resultado = "Normal";
        } else if (imc > 25 && imc < 29.99) {
            resultado = "Sobrepeso";
        } else if (imc > 30 && imc < 39.99) {
            resultado = "Obesidade";
        } else if (imc > 40) {
            resultado = "Obesidade grave";
        }
        return resultado;
    }

}
