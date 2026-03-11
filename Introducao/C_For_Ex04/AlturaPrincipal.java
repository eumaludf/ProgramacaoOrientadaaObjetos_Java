/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_For_Ex04;

import javax.swing.JOptionPane;
/**
 *
 * @author Aluno
 */
public class AlturaPrincipal {
    public static void main(String[] args){
        
        Altura altura = new Altura();
        
        JOptionPane.showMessageDialog(null, "====Programa de alturas=====");
         
        for(int i=1; i<=10; i++){
        altura.Calcula(
                Double.parseDouble(JOptionPane.showInputDialog("Informe uma altura: "))
             );
        }
        JOptionPane.showMessageDialog(null, altura.Resultado());
    }
}
