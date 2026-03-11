/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_IF_Ex01;

/**
 *
 * @author Aluno
 */
public class Media {
    private double n1, n2, mdf;
    private String r;
    
    public String calcular(double n1, double n2){
        this.n1 = n1;
        this.n2 = n2;
        this.mdf = ((this.n1+this.n2)/2);
        
        if(this.mdf>=6){
            this.r = "Aprovado";
        }
        else{
        
            if(this.mdf>=4){
                this.r = "Recuperação";
            }
            else{
                this.r = "Reprovado";
            }
            
        }
        
        return (r + " com média " + mdf);
    }
}
