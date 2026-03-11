/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F_Encapsulamento_Ex05;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class SoloVIEW {
    public static void main(String[] args){
        try{
            SoloDTO soloDTO = new SoloDTO();
            SoloCTR soloCTR = new  SoloCTR();

            soloDTO.setS(Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidde de pontos de água no solo:")));
            JOptionPane.showMessageDialog(null, soloCTR.avalia(soloDTO));

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistem: " + e.getMessage());
        }
    } 
}
