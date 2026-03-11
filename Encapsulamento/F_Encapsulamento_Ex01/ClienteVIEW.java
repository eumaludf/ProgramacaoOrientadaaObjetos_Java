/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F_Encapsulamento_Ex01;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class ClienteVIEW {
    public static void main(String[] args){
        try{
            ClienteDTO clienteDTO = new ClienteDTO();
            ClienteCTR clienteCTR = new ClienteCTR();
            
            clienteDTO.setNome(JOptionPane.showInputDialog("Informe seu nome:"));
            clienteDTO.setRg(JOptionPane.showInputDialog("Informe seu RG:"));
            clienteDTO.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade:")));
            
            JOptionPane.showMessageDialog(null, clienteCTR.mostrarNomeRG(clienteDTO));
            JOptionPane.showMessageDialog(null, clienteCTR.mostrarNomeIdade(clienteDTO));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistem: " + e.getMessage());
        }
    }
}
