/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_For_Ex01;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class PrincipalTauada {
   public static void main(String[] args){
    Tabuada tabuada = new Tabuada();
    
      JOptionPane.showMessageDialog(null, "====Programa que calcula tabuada=====");
        
        JOptionPane.showMessageDialog(null, tabuada.calcular(
                Integer.parseInt(JOptionPane.showInputDialog("Informe um número: "))));
   }
}
