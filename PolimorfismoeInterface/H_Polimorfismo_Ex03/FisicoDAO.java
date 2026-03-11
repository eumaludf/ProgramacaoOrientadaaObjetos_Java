/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package H_Polimorfismo_Ex03;

/**
 *
 * @author Aluno
 */
public class FisicoDAO extends ClienteDAO{
    public String mostrarDados(FisicoDTO fisicoDTO){
        return super.mostrarDados(fisicoDTO) +     
        "\nO CPF do cliente: " + fisicoDTO.getCpf() +
        "\nO RG do cliente: " + fisicoDTO.getRg();
    }
}
