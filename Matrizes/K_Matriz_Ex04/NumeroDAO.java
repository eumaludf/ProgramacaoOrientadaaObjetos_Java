/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package K_Matriz_Ex04;

/**
 *
 * @author Aluno
 */
public class NumeroDAO {
    String resposta=" ";
    
    public String mostraMatriz(NumeroDTO numeroDTO){
        int n[][] = numeroDTO.getN();
        int soma = 0;
        for(int l=0; l<3; l++){
            for(int j=0; j<4; j++){
                soma += n[l][j];
            }
            n[l][5] = soma/4;         
            soma = 0;
        }

       for(int l=0; l<3; l++){
            for(int j=0; j<4; j++){
                this.resposta += n[l][j] + "  ";
            }
            this.resposta += "\n";
        }
        
      return resposta;  
    }
}
