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
public class EnderecoCTR {
    EnderecoDAO enderecoDAO = new EnderecoDAO();
    EnderecoDTO enderecoDTO = new EnderecoDTO();
    
    public String mostrar(EnderecoDTO enderecoDTO){
        return enderecoDAO.mostrar(enderecoDTO);
    }
}
