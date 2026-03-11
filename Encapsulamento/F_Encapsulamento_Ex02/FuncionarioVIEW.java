/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F_Encapsulamento_Ex02;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class FuncionarioVIEW {
     public static void main(String[] args){
        try{
            FuncionarioDTO funcionarioDTO = new FuncionarioDTO();
            FuncionarioCTR funcionarioCTR = new  FuncionarioCTR();

            funcionarioDTO.setTel(JOptionPane.showInputDialog("Informe o telefone do funcionário:"));
            funcionarioDTO.setCod(Integer.parseInt(JOptionPane.showInputDialog("Informe o código do funcionário:")));
            
            JOptionPane.showMessageDialog(null, funcionarioCTR.mostrar(funcionarioDTO));

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistem: " + e.getMessage());
        }
    }
}
