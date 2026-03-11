/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package H_Polimorfismo_Ex03;

/**
 *
 * @author Aluno
 */
public class FisicoCTR {
    FisicoDAO fisicoDAO = new FisicoDAO();
    public String mostrarDados(FisicoDTO fisicoDTO){
        return fisicoDAO.mostrarDados(fisicoDTO);
    }
}
