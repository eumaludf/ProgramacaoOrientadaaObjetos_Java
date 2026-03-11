/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_IF_Ex04;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class PrincipalImc {
    public static void main(String[] args){
        Imc imc = new Imc();
        
        JOptionPane.showMessageDialog(null, "====Programa que cacula seu IMC=====");
        
        JOptionPane.showMessageDialog(null, imc.Calcula(
                Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso em KG: ")), 
                Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura em metros: "))));
        
    }
}
