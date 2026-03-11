/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package D_While_DoWhile_Ex01;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Principal_Exemplowhile1 {
    public static void main(String[] args){
        String letra;
        Exemplowhile1 exemplo = new Exemplowhile1();
        
        letra = JOptionPane.showInputDialog("Informe a letra: ");
        
        while(letra.equalsIgnoreCase("x")){
            exemplo.verificar(letra);
            letra = JOptionPane.showInputDialog("Informe a letra: ");
        }
        
        JOptionPane.showMessageDialog(null, exemplo.mostra());
    }
}
