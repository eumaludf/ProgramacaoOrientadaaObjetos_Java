/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_For_Ex05;

/**
 *
 * @author Aluno
 */
public class Salario {
    int ano, a;
    double salf, sala, p;
    
    public double Calcula(int ano){
        this.ano = ano;
        this.a = this.ano - 2010;
        
        if(this.a == 0){
            return 1000;
        }
        else{
        
        this.salf = 1000;
        this.p = 0.015;
        
        for(int i=1; i<=this.a; i++){
            this.sala = this.salf + ( this.salf * this.p);
            this.salf = this.sala;
            this.p = this.p * 2;
        }
        
            return this.salf;
        }
    }
}
