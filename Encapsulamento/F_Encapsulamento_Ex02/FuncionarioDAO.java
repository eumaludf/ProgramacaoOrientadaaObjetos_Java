/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F_Encapsulamento_Ex02;

/**
 *
 * @author Aluno
 */
public class FuncionarioDAO {
    public String mostrar(FuncionarioDTO funcionarioDTO){
        return "O código do funcionário é: " + funcionarioDTO.getCod() +
        " e o telefone do funcionário é: " + funcionarioDTO.getTel();
    }
}
