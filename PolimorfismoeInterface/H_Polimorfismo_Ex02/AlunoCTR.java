/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package H_Polimorfismo_Ex02;

/**
 *
 * @author Aluno
 */
public class AlunoCTR {
    AlunoDAO alunoDAO = new AlunoDAO();
    public String imprimir(AlunoDTO alunoDTO){
        return alunoDAO.imprimir(alunoDTO);
    }
}
