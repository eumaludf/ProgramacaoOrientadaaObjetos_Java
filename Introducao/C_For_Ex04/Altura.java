/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_For_Ex04;

/**
 *
 * @author Aluno
 */
public class Altura {
    
    double a, s = 0, m, maior;
    
    public void Calcula(double a){
        this.a = a;
        this.s = this.s + this.a;
        
        if(this.a > 2.00){
            this.maior += 1;  
        }
        Media();
    }
    
    public void Media(){
        this.m = (this.s / 10);
    }
    
    public String Resultado(){
        return "A quantidade de pessoas com altura maior que dois metros é de " + 
                this.maior + " e a média das alturas é de " + this.m;
    }
}
