/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F_Encapsulamento_Ex10;

/**
 *
 * @author Aluno
 */
public class LancheCTR {
    LancheDAO lancheDAO = new LancheDAO();
    
    public void Calcula(LancheDTO lancheDTO){
       lancheDAO.Calcula(lancheDTO);
    }
    
    public String Exibe (LancheDTO lancheDTO){
        return lancheDAO.Exibe(lancheDTO);
    }
}
