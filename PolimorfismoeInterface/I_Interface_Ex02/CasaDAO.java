/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package I_Interface_Ex02;

/**
 *
 * @author Aluno
 */
public class CasaDAO implements ICasaDAO {
    
   private String m;
   public String publicarDados(CasaDTO casaDTO){
        m = "O endereço do imovel é: " + casaDTO.getEnd() + ", número " + casaDTO.getN()
                + ", " + casaDTO.getB() + " - " + casaDTO.getC() + "\n Possui " +
                casaDTO.getQuarto() + "quartos e " + casaDTO.getBanheiro() + "banheiros."
                + "\nO dono se chama: " + casaDTO.getDono();
        
        return m;
    }
}
