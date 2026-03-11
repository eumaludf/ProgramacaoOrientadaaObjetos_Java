/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex01;

/**
 *
 * @author Aluno
 */
public class ClienteDAO {
    
    public String mostrarNomeRg(ClienteDTO clienteDTO){
        return "O nome informado foi: " +
                clienteDTO.getNome() + "\nO RG informado foi: " +
                clienteDTO.getRg();
    }
    public String mostrarNomeIdade(ClienteDTO clienteDTO){
        return "O nome informado foi: " +
                clienteDTO.getNome() + "\nA idade informada foi: " +
                clienteDTO.getIdade();
    }
}
