/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F_Encapsulamento_Ex04;

/**
 *
 * @author Aluno
 */
public class NotaDAO {
    public String calcula(NotaDTO notaDTO){
        double m ;
        m = (notaDTO.getN1() + notaDTO.getN2())/2;
        notaDTO.setM(m);
       
        if(notaDTO.getM()>=7){
            return "Aluno com média: " + notaDTO.getM() + ", aprovado!";
        }
        else if(notaDTO.getM()<7 && notaDTO.getM()>=4 ){
            return "Aluno com média: " + notaDTO.getM() + ", recuperação";
        }
        else{
             return "Aluno com média: " + notaDTO.getM() + ", reprovado";
        }
    }
}
