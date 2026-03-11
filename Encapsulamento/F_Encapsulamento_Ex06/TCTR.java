/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F_Encapsulamento_Ex06;

/**
 *
 * @author Aluno
 */
public class TCTR {
        TDAO tDAO = new TDAO();
    
    public String testa(TDTO tDTO){
        return tDAO.testa(tDTO);
    }
    public String avalia(TDTO tDTO){
        return tDAO.avalia(tDTO);
    }
}
