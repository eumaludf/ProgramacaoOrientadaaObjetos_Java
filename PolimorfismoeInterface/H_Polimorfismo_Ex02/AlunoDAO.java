/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package H_Polimorfismo_Ex02;

/**
 *
 * @author Aluno
 */
public class AlunoDAO {
    public double calcularMedia(AlunoDTO alunoDTO){
        double r = 0;
        if(alunoDTO.getOpc() == 1){
            r = calcularMedia(alunoDTO.getN1(), alunoDTO.getN2());
        }
        else if(alunoDTO.getOpc() == 2){
            r = calcularMedia(alunoDTO.getN1(), alunoDTO.getN2(), alunoDTO.getN3());
        }
        else if(alunoDTO.getOpc() == 3){
          r = calcularMedia(alunoDTO.getN1(), alunoDTO.getN2(), alunoDTO.getN3(), alunoDTO.getN4());  
        }
        
        return r;
    }
    
    public double calcularMedia(double n1, double n2){
       double m = (n1+n2)/2;
       return m;
    }
    public double calcularMedia(double n1, double n2, double n3){
       double m = (n1+n2+n3)/3;
       return m;
    }
    public double calcularMedia(double n1, double n2, double n3, double n4){
       double m = (n1+n2+n3+n4)/4;
       return m;
    }

public String imprimir(AlunoDTO alunoDTO){
    return "O resultado da média é " + calcularMedia(alunoDTO);
}

}