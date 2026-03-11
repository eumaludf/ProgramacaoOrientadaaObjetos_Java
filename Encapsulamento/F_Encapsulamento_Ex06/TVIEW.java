/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F_Encapsulamento_Ex06;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class TVIEW {
        public static void main(String[] args){
        try{
            TDTO tDTO = new TDTO();
            TCTR tCTR = new  TCTR();

            tDTO.setL(Double.parseDouble(JOptionPane.showInputDialog("Informe o lado 1:")));
            tDTO.setL2(Double.parseDouble(JOptionPane.showInputDialog("Informe o lado 2:")));
            tDTO.setL3(Double.parseDouble(JOptionPane.showInputDialog("Informe o lado 3:")));
            JOptionPane.showMessageDialog(null, tCTR.testa(tDTO));

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistem: " + e.getMessage());
        }
    } 
}
