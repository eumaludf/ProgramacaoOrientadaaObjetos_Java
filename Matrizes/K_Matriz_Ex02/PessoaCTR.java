/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package K_Matriz_Ex02;

/**
 *
 * @author Aluno
 */
public class PessoaCTR {
    PessoaDAO pessoaDAO = new PessoaDAO();
    PessoaDTO pessoaDTO = new PessoaDTO();
    
    public String mostrarPessoa(PessoaDTO pessoaDTO){
        return pessoaDAO.mostrarPessoa(pessoaDTO);
    }
}
