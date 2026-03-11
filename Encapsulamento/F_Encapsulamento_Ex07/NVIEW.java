/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F_Encapsulamento_Ex07;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class NVIEW {
            public static void main(String[] args){
        try{
            NDTO nDTO = new NDTO();
            NCTR nCTR = new  NCTR();

            JOptionPane.showMessageDialog(null, "Informe 3 números em ordem crescente e 1 aleatório.");
            nDTO.setN1(Integer.parseInt(JOptionPane.showInputDialog("Informe o número 1:")));
            nDTO.setN2(Integer.parseInt(JOptionPane.showInputDialog("Informe o número 2:")));
            nDTO.setN3(Integer.parseInt(JOptionPane.showInputDialog("Informe o número 3:")));
            nDTO.setN4(Integer.parseInt(JOptionPane.showInputDialog("Informe o número 4:")));
            JOptionPane.showMessageDialog(null, nCTR.Ordem(nDTO));

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistem: " + e.getMessage());
        }
    } 
}
