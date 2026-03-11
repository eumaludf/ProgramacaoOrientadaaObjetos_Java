/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex03;

/**
 *
 * @author Aluno
 */
public class MotoristaCTR {
    MotoristaDAO motoristaDAO = new MotoristaDAO();
    MotoristaDTO motoristaDTO = new MotoristaDTO();
    
    public String confereIdade(MotoristaDTO motoristaDTO){
        return motoristaDAO.confereIdade(motoristaDTO);
    }
}
