/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex04;

/**
 *
 * @author Aluno
 */
public class EnderecoDAO {
    public String mostrar(EnderecoDTO enderecoDTO){
        return enderecoDTO.getNome() + ", RG: " + enderecoDTO.getRg() + ", CPF:" + enderecoDTO.getCpf() +
               "\n Reside no endereço:\n" + enderecoDTO.getLogradouro() + ", número: " +
               enderecoDTO.getNumero() + "\nBairro: " + enderecoDTO.getBairro() +
               "\nCidade: " + enderecoDTO.getCidade() + "\nEstado: " + enderecoDTO.getEstado() + 
               "\nCEP: " + enderecoDTO.getCep();
    }
}
