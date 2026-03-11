/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_introducao_Ex01;

/**
 *
 * @author Aluno
 */
public class Cliente {
    private String nome, rg;
    
    public String mostrar(String nome, String rg){
        this.rg = rg;
        this.nome = nome;
       
       return("O nome informado foi: " + this.nome + " e o rg informdo foi: " + this.rg );
    
    }
    
    public String mostrarNome(String nome){
        this.nome = nome;
        
        return("O nome informado foi: " + this.nome);
    }
}
