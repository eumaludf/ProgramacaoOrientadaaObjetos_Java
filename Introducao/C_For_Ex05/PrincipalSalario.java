/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_For_Ex05;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/**
 *
 * @author Aluno
 */
public class PrincipalSalario {
    
    public static void main(String[] args){
        Salario salario = new Salario();
        
        DecimalFormat formata = new DecimalFormat("##,###.00");
        
        JOptionPane.showMessageDialog(null, "====Programa de atualização de salário=====");
         
        JOptionPane.showMessageDialog(null, "O salário é de: R$" +  formata.format(salario.Calcula(
                Integer.parseInt(JOptionPane.showInputDialog("Informe o ano atual: "))
             )));
        
    }
}
