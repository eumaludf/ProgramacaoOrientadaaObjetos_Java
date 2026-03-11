/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_For_Ex03;

/**
 *
 * @author Aluno
 */
public class Soma {
    private int s, n, r;
    
    public void calcula(int n){
        this.n = n;
        this.s+= this.n;
    }
    
    public int mostra(){
        return this.s;
    }
}
