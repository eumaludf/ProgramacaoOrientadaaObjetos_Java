/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_IF_Ex02;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class PrincipalSolo {
    public static void main(String[] args){
        Solo solo = new Solo();
        
        System.out.println("====Programa que avalia a qualidade do solo=====");
        
        JOptionPane.showMessageDialog(null, solo.avaliaSolo(Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de pontos presente na amostra : "))));
    }
}
