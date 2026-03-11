/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F_Encapsulamento_Ex04;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class NotaVIEW {
    public static void main(String[] args){
        try{
            NotaDTO notaDTO = new NotaDTO();
            NotaCTR notaCTR = new  NotaCTR();

            notaDTO.setN1(Double.parseDouble(JOptionPane.showInputDialog("Informe a primeira nota:")));
            notaDTO.setN2(Double.parseDouble(JOptionPane.showInputDialog("Informe a segunda nota:"))); 
            JOptionPane.showMessageDialog(null, notaCTR.calcula(notaDTO));

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistem: " + e.getMessage());
        }
    }
}
