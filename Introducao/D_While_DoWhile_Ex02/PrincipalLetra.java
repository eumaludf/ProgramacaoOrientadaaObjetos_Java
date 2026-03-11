/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package D_While_DoWhile_Ex02;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class PrincipalLetra {
    public static void main(String[] args){
        String letra;
        Letra exemplo = new Letra();
        
        letra = JOptionPane.showInputDialog("Informe a letra: ");
        
        while(!letra.equalsIgnoreCase("0")){
            exemplo.verificar(letra);
            letra = JOptionPane.showInputDialog("Informe a letra: ");
        }
        
        JOptionPane.showMessageDialog(null, exemplo.mostra());
    }
}
