/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package K_Matriz_Ex03;

/**
 *
 * @author Aluno
 */
public class NumeroDAO {
    String resposta=" ", d=" ";
    public String mostraMatriz(NumeroDTO numeroDTO){
        int n[][] = numeroDTO.getN();
        for(int l=0; l<20; l++){
            for(int j=0; j<20; j++){
                this.resposta += n[l][j] + "  ";
            }
            this.resposta += "\n";
        }
        
        for(int l=0; l<20; l++){
            for(int j=0; j<20; j++){
                if(l == j){
                this.d += n[l][j] + "  ";
                }
            }
        }
        
        return resposta + "\nA diagonal principal é:\n" + d;
    }

}
