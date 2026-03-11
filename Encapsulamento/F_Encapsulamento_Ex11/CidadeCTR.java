/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F_Encapsulamento_Ex11;

/**
 *
 * @author Aluno
 */
public class CidadeCTR {
    CidadeDAO cidadeDAO = new CidadeDAO();
    
    public void calcula(CidadeDTO cidadeDTO){
       cidadeDAO.calcula(cidadeDTO);
    }
    
    public String exibe (CidadeDTO cidadeDTO){
        return cidadeDAO.exibe(cidadeDTO);
    }
}
