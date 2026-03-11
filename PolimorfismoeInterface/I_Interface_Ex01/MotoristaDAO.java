/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package I_Interface_Ex01;

/**
 *
 * @author Aluno
 */
public class MotoristaDAO {
    private String m;
    
    public String calcular(MotoristaDTO motoristaDTO){
        if(motoristaDTO.getIdade() >= 18){
            this.m = "O motorista pode ter CNH.";
        }
        else{
            this.m = "O motorista NÃO pode ter CNH.";
        }
        
        return this.m;
    }
}
