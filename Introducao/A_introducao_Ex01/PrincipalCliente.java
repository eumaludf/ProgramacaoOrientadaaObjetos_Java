/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_introducao_Ex01;
import javax.swing.JOptionPane;
/**
 *
 * @author Aluno
 */
public class PrincipalCliente {
    public static void main(String[] args){
        
        Cliente cliente = new Cliente();
        
        System.out.println("====Chamando os métodos do objeto=====");

   
        JOptionPane.showMessageDialog(null, cliente.mostrar(JOptionPane.showInputDialog("Informe o nome:"), 
        JOptionPane.showInputDialog("Informe o RG:")));
        
    }
}
