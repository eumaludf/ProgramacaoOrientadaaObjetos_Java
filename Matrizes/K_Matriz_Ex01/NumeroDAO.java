/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package K_Matriz_Ex01;

/**
 *
 * @author Aluno
 */
public class NumeroDAO {
    String resposta=" ";
    public String mostraMatriz(NumeroDTO numeroDTO){
        int n[][] = numeroDTO.getN();
        for(int l=0; l<2; l++){
            for(int j=0; j<3; j++){
                this.resposta += n[l][j] + "  ";
            }
            this.resposta += "\n";
        }
        return resposta;
    }
}
