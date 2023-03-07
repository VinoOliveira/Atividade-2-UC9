package atividade.pkg2;

import javax.swing.ButtonGroup;
import javax.swing.JTextField;

public class ValidarCampos {

    public static void validarCampos(JTextField textPeso, JTextField textAltura, JTextField textIdade, ButtonGroup grupo) {
        String peso = textPeso.getText();
        String altura = textAltura.getText();
        String idade = textIdade.getText();

        if (peso.isEmpty() || idade.isEmpty() || altura.isEmpty()) {
            throw new NumberFormatException("Preencha todos os campos.");
        }

        if (grupo.getSelection() == null) {
            throw new NumberFormatException("Informe seu sexo.");
        }

        boolean validarPeso = peso.matches("^(0|[1-9]\\d*)(,\\d+)?$");
        boolean validarAltura = altura.matches("^[0-9]+{3}$");
        boolean validarIdade = idade.matches("^(0|[1-9]\\d*)(,\\d+)?$");

        if (validarPeso == false ) {
            throw new NumberFormatException("O peso deve ser maior que zero e apenas numeros.");
        }

        if (validarAltura == false) {
            throw new NumberFormatException("A altura deve ser maior que zero e apenas numeros.");
        }

        if (validarIdade == false) {
            throw new NumberFormatException("A idade deve estar entre 1 e 3 digitos e apenas numeros.");
        }
    }
}
