/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_introducao_Ex02;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class PrincipalMedia {
        public static void main(String[] args){
        
        Media media = new Media();
        
        System.out.println("====Programa que calcula a média=====");
   
        JOptionPane.showMessageDialog(null, media.calcular(Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 1:")),
        Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 2:")), 
        Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 3:")),
        Double.parseDouble(JOptionPane.showInputDialog("Informe o peso 1:")),
        Double.parseDouble(JOptionPane.showInputDialog("Informe o peso 2:")),
        Double.parseDouble(JOptionPane.showInputDialog("Informe o peso 3:"))));
        
    }
}

