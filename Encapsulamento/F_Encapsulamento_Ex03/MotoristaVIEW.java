/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F_Encapsulamento_Ex03;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class MotoristaVIEW {
         public static void main(String[] args){
        try{
            MotoristaDTO motoristaDTO = new MotoristaDTO();
            MotoristaCTR motoristaCTR = new  MotoristaCTR();

       
            motoristaDTO.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do motorista:")));
            
            JOptionPane.showMessageDialog(null, motoristaCTR.CNH(motoristaDTO));

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistem: " + e.getMessage());
        }
    }
}
