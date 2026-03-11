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
public class MotoristaDAO {
    public String confereIdade(MotoristaDTO motoristaDTO){
        String msg;
        if(motoristaDTO.getIdade() >= 18){
            msg = "O  motorista pode adiquirir CNH.";
        }
        else{
            msg = "O motorista não pode adiquirir CNH.";
        }
        return msg;
    }
    
}
