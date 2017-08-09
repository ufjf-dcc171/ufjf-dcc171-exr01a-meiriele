package br.ufjf.dcc171;

import javax.swing.JOptionPane;

public class Aula01Exm01 {

    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog(null, "Digite seu nome! ");

        if (nome != null && !nome.isEmpty()) {

            System.out.println(nome);
            JOptionPane.showMessageDialog(null, "Bem vindo ao GUIs ", "Olá " + nome + "!", JOptionPane.PLAIN_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Voce deveria ter digitado um nome ", "ERRO " + "!", JOptionPane.ERROR_MESSAGE);

        }
    }
}
