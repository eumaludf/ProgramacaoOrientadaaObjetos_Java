/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package K_Matriz_Ex04;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class NumeroVIEW {
     public static void main(String[] args){
        NumeroDTO numeroDTO = new NumeroDTO();
        NumeroCTR numeroCTR = new NumeroCTR();
        
        int num[][] = new int[3][5];
        
        for(int l=0; l<3; l++){
            for(int j=0; j<4; j++){
                num[l][j] = Integer.parseInt(JOptionPane.showInputDialog
                ("Informe o número para linha " + l + " e coluna " + j + ":"));
            }
            num[l][5] = 0;
        }
        
        numeroDTO.setN(num);
        JOptionPane.showMessageDialog(null, numeroCTR.mostraMatriz(numeroDTO));
  

    }
}
