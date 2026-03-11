/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package K_Matriz_Ex03;

import javax.swing.JOptionPane;
//import java.util.Random;

/**
 *
 * @author Aluno
 */
public class NumeroVIEW {
    public static void main(String[] args){
        NumeroDTO numeroDTO = new NumeroDTO();
        NumeroCTR numeroCTR = new NumeroCTR();
        
        int num[][] = new int[20][20];
        
        for(int l=0; l<20; l++){
            for(int j=0; j<201; j++){
                num[l][j] = Integer.parseInt(JOptionPane.showInputDialog
                ("Informe o número para linha " + l + " e coluna " + j + ":"));
            }
        }
        
        numeroDTO.setN(num);
        JOptionPane.showMessageDialog(null, numeroCTR.mostraMatriz(numeroDTO));
  

    }
}
