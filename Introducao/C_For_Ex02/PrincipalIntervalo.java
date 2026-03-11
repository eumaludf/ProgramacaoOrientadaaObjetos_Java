/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_For_Ex02;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class PrincipalIntervalo {
    public static void main(String[] args){
        Intervalo intervalo = new Intervalo();
        
        JOptionPane.showMessageDialog(null, "====Programa que mostra intervalos=====");
        
        JOptionPane.showMessageDialog(null, intervalo.mostra(
                Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro número: ")), 
                Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo número: "))));
    }
}
