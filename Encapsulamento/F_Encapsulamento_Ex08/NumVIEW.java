/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F_Encapsulamento_Ex08;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class NumVIEW {
           public static void main(String[] args){
        try{
            NumDTO numDTO = new NumDTO();
            NumCTR numCTR = new  NumCTR();

            JOptionPane.showMessageDialog(null, "Informe 3 números.");
            numDTO.setA(Integer.parseInt(JOptionPane.showInputDialog("Informe o número 1:")));
            numDTO.setB(Integer.parseInt(JOptionPane.showInputDialog("Informe o número 2:")));
            numDTO.setC(Integer.parseInt(JOptionPane.showInputDialog("Informe o número 3:")));
            JOptionPane.showMessageDialog(null, numCTR.Ordem(numDTO));

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistem: " + e.getMessage());
        }
    } 
}
