package br.ufjf.dcc171;

import javax.swing.JOptionPane;

public class Aula01Exm01b {

    public static void main(String[] args) {
        try {
            Integer n1;
            Integer n2;
            Integer soma;

            String sn1 = JOptionPane.showInputDialog("Digite o primeiro numero");
            String sn2 = JOptionPane.showInputDialog("Digite o segundo numero");
            n1 = Integer.parseInt(sn1);
            n2 = Integer.parseInt(sn2);
            soma = n1 + n2;
            JOptionPane.showMessageDialog(null, "A soma de " + n1 + "+" + n2 + " é " + (n1 + n2), " Resultado", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Digite um numero interio para as duas opçoes", "entrada Inválida!", JOptionPane.ERROR_MESSAGE);
        }
    }
}
