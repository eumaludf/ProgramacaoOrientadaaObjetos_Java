/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package K_Matriz_Ex02;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class PessoaVIEW {
    public static void main(String[] args){
        PessoaDTO  pessoaDTO = new  PessoaDTO();
         PessoaCTR  pessoaCTR = new  PessoaCTR();
        
        String num[][] = new String[5][2];
        
        for(int l=0; l<5; l++){
            for(int j=0; j<2; j++){
                if(j == 0){
                num[l][j] = (JOptionPane.showInputDialog
                ("Informe o " + l+1 + "° nome:")); 
                }
                else if( j == 1){
                num[l][j] = (JOptionPane.showInputDialog
                ("Informe o " + l+1 + "° endereço:")); 
                }
            }
        }
        
        pessoaDTO.setP(num);
        JOptionPane.showMessageDialog(null, pessoaCTR.mostrarPessoa(pessoaDTO));
  

    }
}
