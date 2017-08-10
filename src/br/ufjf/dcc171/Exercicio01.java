package br.ufjf.dcc171;

import static java.lang.Float.parseFloat;
import javax.swing.JOptionPane;

public class Exercicio01 {

    public static void main(String[] args) {
        try {
            float largura = 0;
            float comprimento = 0;
            float altura = 0;
            float resultado;
            String mLargura = JOptionPane.showInputDialog("Digite a largura: ");
            String mComprimento = JOptionPane.showInputDialog("Digite o comprimento! ");
            String mAltura = JOptionPane.showInputDialog("Digite a altura! ");
            largura = parseFloat(mLargura);
            comprimento = parseFloat(mAltura);
            altura = parseFloat(mAltura);

            resultado = largura * comprimento * altura;
            JOptionPane.showMessageDialog(null, "O resultado de:  " + largura + "*" + comprimento + "*" + altura + " = " + (largura * comprimento * altura), "Resultado", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Digite um numero real para as 3 opções", "Entrada Invalida!", JOptionPane.ERROR_MESSAGE);
        }
    }
}
