/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F_Encapsulamento_Ex09;

/**
 *
 * @author Aluno
 */
public class ImcCTR {
    ImcDAO imcDAO = new ImcDAO();
    
    public String Calcula(ImcDTO imcDTO){
        return imcDAO.Calcula(imcDTO);
    }
}
