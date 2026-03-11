/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F_Encapsulamento_Ex09;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class ImcVIEW {
    public static void main(String[] args){
        try{
            ImcDTO imcDTO = new ImcDTO();
            ImcCTR imcCTR = new  ImcCTR();

            JOptionPane.showMessageDialog(null, "Vamos calcular seu IMC!");
            imcDTO.setA(Double.parseDouble(JOptionPane.showInputDialog("Informe a altura:")));
            imcDTO.setP(Double.parseDouble(JOptionPane.showInputDialog("Informe o peso:")));
            JOptionPane.showMessageDialog(null, imcCTR.Calcula(imcDTO));

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistem: " + e.getMessage());
        }
    } 
}
