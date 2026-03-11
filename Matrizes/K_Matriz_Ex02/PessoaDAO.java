/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package K_Matriz_Ex02;

/**
 *
 * @author Aluno
 */
public class PessoaDAO {
    private String r = "Nome     Endereço\n";
    
    public String mostrarPessoa(PessoaDTO pessoaDTO){
        String n[][] = pessoaDTO.getP();
        for(int l=0; l<5; l++){
            for(int j=0; j<2; j++){
                this.r += n[l][j] + "     ";
            }
            this.r += "\n";
        }
        return r;
    }
}
