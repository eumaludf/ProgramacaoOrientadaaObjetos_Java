/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package H_Polimorfismo_Ex03;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class ClienteVIEW {
    public static void main(String[] args){
        FisicoDTO fisicoDTO = new FisicoDTO();
        FisicoCTR fisicoCTR = new FisicoCTR();
        
        fisicoDTO.setNome(JOptionPane.showInputDialog("Informe o nome: "));
        fisicoDTO.setEstado(JOptionPane.showInputDialog("Informe o estado: "));
        fisicoDTO.setCidade(JOptionPane.showInputDialog("Informe a cidade: "));
        fisicoDTO.setEndereco(JOptionPane.showInputDialog("Informe o endereço: "));
        fisicoDTO.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Informe o número: ")));
        fisicoDTO.setCpf(JOptionPane.showInputDialog("Informe o CPF: "));
        fisicoDTO.setRg(JOptionPane.showInputDialog("Informe o RG: "));
        
        JOptionPane.showMessageDialog(null, fisicoCTR.mostrarDados(fisicoDTO));
        
        JuridicoDTO juridicoDTO = new JuridicoDTO();
        JuridicoCTR juridicoCTR = new JuridicoCTR();
        
        juridicoDTO.setNome(JOptionPane.showInputDialog("Informe o nome: "));
        juridicoDTO.setEstado(JOptionPane.showInputDialog("Informe o estado: "));
        juridicoDTO.setCidade(JOptionPane.showInputDialog("Informe a cidade: "));
        juridicoDTO.setEndereco(JOptionPane.showInputDialog("Informe o endereço: "));
        juridicoDTO.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Informe o número: ")));
        juridicoDTO.setCnpj(JOptionPane.showInputDialog("Informe o CNPJ: "));
        juridicoDTO.setIe(JOptionPane.showInputDialog("Informe o IE: "));
        
        JOptionPane.showMessageDialog(null, juridicoCTR.mostrarDados(juridicoDTO));
        
    }
}
