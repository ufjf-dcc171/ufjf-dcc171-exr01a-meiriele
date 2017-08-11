
package br.ufjf.dcc171;

import static java.lang.Float.parseFloat;
import javax.swing.JOptionPane;


public class Exercicio02 {
    public static void main(String[] args) {
        
        float x1 = 0;
        float y1 = 0;
        float x2 = 0;
        float y2 = 0;
        float distancia;
        
        String dx1 = JOptionPane.showInputDialog("Digite o valor de X1: ");
        String dy1 = JOptionPane.showInputDialog("Digite o valor de Y1: ");
        String dx2 = JOptionPane.showInputDialog("Digite o valor de X2: ");
        String dy2 = JOptionPane.showInputDialog("Digite o valor de Y2: ");
        
        x1 = parseFloat(dx1);
        y1 = parseFloat(dy1);
        x2 = parseFloat(dx2);
        y2 = parseFloat(dy2);
        
                
        distancia = (float) Math.sqrt( Math.pow( (x1 - x2),2 ) +  Math.pow( (y1 - y2),2 ) );
        
        JOptionPane.showMessageDialog(null,"A Distancia entre ponto um e ponto dois é: "+distancia+ "!","Resultado", JOptionPane.INFORMATION_MESSAGE);
        
    }
}
