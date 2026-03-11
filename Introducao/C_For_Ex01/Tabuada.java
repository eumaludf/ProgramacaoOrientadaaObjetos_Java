/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_For_Ex01;

/**
 *
 * @author Aluno
 */
public class Tabuada {
    private int n;
    private String imprimir = "";
    
    public String calcular(int n){
        this.n = n;
        for(int i=1; i<=10; i++){
        this.imprimir = this.imprimir + "\n" + this.n + " X " + i + " = " + this.n*i;
        }
        
        return this.imprimir;
    }
}
