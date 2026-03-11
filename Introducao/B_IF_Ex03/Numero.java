/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_IF_Ex03;

/**
 *
 * @author Aluno
 */
public class Numero {
    private double n1, n2, n3, n4;
    private String r;
    
    public String Ordem(double n1, double n2, double n3, double n4){
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
        
        if(this.n1>this.n2 || this.n2>this.n3 || this.n1>this.n3){
            this.r = "A ordem dos três primeiros é inválida, pois não é crescente!";
        }
        else{
            if(this.n4<this.n1){
                this.r = this.n4 + ", " + this.n1 + ", " + this.n2 + ", " + this.n3;
            }
            else if(this.n4>=this.n1 && this.n4<=this.n2){
                this.r = this.n1 + ", " + this.n4 + ", " + this.n2 + ", " + this.n3;
            }
            else if(this.n4>this.n1 && this.n4>this.n2 && this.n4<this.n3){
                this.r = this.n1 + ", " + this.n2 + ", " + this.n4 + ", " + this.n3;
            }
            else if(this.n4>=this.n3){
                this.r = this.n1 + ", " + this.n2 + ", " + this.n3 + ", " + this.n4;
            }
        }
        
        return this.r;
    }
}
