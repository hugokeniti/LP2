/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB;

import javax.swing.JOptionPane;

/**
 *
 * @author 31411525
 */
public class EX1 {
    private int codigo = 0;
    private double valor = 0;
    
    public EX1() {
        
        String val = JOptionPane.showInputDialog("Digite o valor do produto: ");
        valor = Double.parseDouble(val);

        codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo de aumento do produto: "));
        //Entrada de dados e conversao com JOptionPane na mesma linha

        switch (codigo) {
            case 1:
                valor += (valor*0.1);
                JOptionPane.showMessageDialog(null, "O valor é: " + valor);
                break;

            case 3:
                valor += (valor*0.25);
                JOptionPane.showMessageDialog(null, "O valor é: " + valor);
                break;

            case 4:
                valor += (valor*0.3);
                JOptionPane.showMessageDialog(null, "O valor é: " + valor);
                break;
            case 8:
                valor += (valor*0.5);
                JOptionPane.showMessageDialog(null, "O valor é: " + valor);
                break;
            default:
                JOptionPane.showMessageDialog(null,"Codigo invalido");

        }
    }
}
