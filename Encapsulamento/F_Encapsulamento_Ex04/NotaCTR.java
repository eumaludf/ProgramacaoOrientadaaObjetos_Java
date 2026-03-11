/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F_Encapsulamento_Ex04;

/**
 *
 * @author Aluno
 */
public class NotaCTR {
        NotaDAO notaDAO = new NotaDAO();
    
    public String calcula(NotaDTO notaDTO){
        return notaDAO.calcula(notaDTO);
    }
    
}
