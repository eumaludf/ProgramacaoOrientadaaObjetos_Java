/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F_Encapsulamento_Ex03;

/**
 *
 * @author Aluno
 */
public class MotoristaCTR {
    MotoristaDAO motoristaDAO = new MotoristaDAO();
    
    public String CNH(MotoristaDTO motoristaDTO){
        return motoristaDAO.CNH(motoristaDTO);
    }
    
    }

