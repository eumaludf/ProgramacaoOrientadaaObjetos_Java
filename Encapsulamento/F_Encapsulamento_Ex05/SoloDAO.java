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
public class SoloDAO {
    public String avalia(SoloDTO soloDTO){
        if(soloDTO.getS()<=10){
            return "Solo rochoso.";
        }
        else if(soloDTO.getS()>10 && soloDTO.getS()<=40){
            return "Solo firme.";
        }
        else if(soloDTO.getS()>40 && soloDTO.getS()<=80){
            return "Solo pantanoso.";
        }
        else{
            return "Quantidde de água inválida.";
        }
    } 
}
