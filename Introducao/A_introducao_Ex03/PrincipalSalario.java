/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_introducao_Ex03;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class PrincipalSalario {
    public static void main (String[] args)
    {
        Salario salario = new Salario();
        
                System.out.println("====Programa que calcula a média=====");
   
        JOptionPane.showMessageDialog(null, salario.calculaAumento(Double.parseDouble(JOptionPane.showInputDialog("Informe o salário:")),
        Double.parseDouble(JOptionPane.showInputDialog("Informe o aumento:"))));
        
    }
}
