/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_IF_Ex03;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class PrincipalNumero {
        public static void main(String[] args){
        Numero numero = new Numero();
        
        JOptionPane.showMessageDialog(null, "====Programa que ordena os números=====");
              JOptionPane.showMessageDialog(null, "Por favor, digite três números em ordem crescente e um aleatório.");
        
        JOptionPane.showMessageDialog(null, numero.Ordem(
                Double.parseDouble(JOptionPane.showInputDialog("Informe o número 1: ")), 
                Double.parseDouble(JOptionPane.showInputDialog("Informe o número 2: ")), 
                Double.parseDouble(JOptionPane.showInputDialog("Informe o número 3: ")), 
                Double.parseDouble(JOptionPane.showInputDialog("Informe o número 4 - Aleatório: "))));
    }
}
