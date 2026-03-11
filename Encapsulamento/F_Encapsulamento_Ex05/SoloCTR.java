/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F_Encapsulamento_Ex05;

/**
 *
 * @author Aluno
 */
public class SoloCTR {
    SoloDAO soloDAO = new SoloDAO();
    
    public String avalia(SoloDTO soloDTO){
        return soloDAO.avalia(soloDTO);
    }
}
