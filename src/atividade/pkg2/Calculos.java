package atividade.pkg2;

public class Calculos {

    public static double calcularGastoBasal(double altura, double peso, int idade, String sexo) {
        double resultado = 0;
        if (sexo.equals("Homem")) {
            resultado = 66 + (13.8 * peso) + (5 * altura) - (6.8 * idade);
        } else if (sexo.equals("Mulher")) {
            resultado = 655 + (9.6 * peso) + (1.9 * altura) - (4.7 * idade);
        }
        return resultado;
    }

    public static double calcularGastoTotal(double calcBasal, String atividades) {
        double resultado = 0;
        if (atividades.equals("Sedentário")) {
            resultado = calcBasal * 1.2;
        } else if (atividades.equals("Leve (exercício leve 1 a 3 dias/semana)")) {
            resultado = calcBasal * 1.375;
        } else if (atividades.equals("Moderado (exercício moderado 3 a 5 dias/semana)")) {
            resultado = calcBasal * 1.55;
        } else if (atividades.equals("Ativo (exercício pesado 5 a 6 dias/semana)")) {
            resultado = calcBasal * 1.725;
        } else if (atividades.equals("Extremamente ativo (exercício pesado diário)")) {
            resultado = calcBasal * 1.9;
        }
        return resultado;
    }
    
    public static double calcularCarboidratos(double calorias) {
        double resultado = calorias * 0.5 / 4;
        return resultado;
    }    
    public static double calcularProteinas(double calorias) {
        double resultado = calorias * 0.25 / 4;
        return resultado;
    }
     public static double calcularGorduras(double calorias) {
        double resultado = calorias * 0.25 / 9;
        return resultado;
    }
}
