/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_For_Ex02;

/**
 *
 * @author Aluno
 */
public class Intervalo {
    public int n1, n2;
    public String r="";
    
    public String mostra(int n1, int n2){
    
    this.n1 = n1;
    this.n2 = n2;
        
    for(int i=this.n1; i<=this.n2; i++){
        this.r = this.r + " " + i;
    }
        
    return this.r;
    }
}
