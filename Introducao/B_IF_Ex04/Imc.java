/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_IF_Ex04;

/**
 *
 * @author Aluno
 */
public class Imc {
    private double p, a;
    private String c;
    
    public String Calcula(double p, double a){
        this.p = p;
        this.a = a;
        
        if(this.a<1.20){
            if(p<=60){
                this.c = "A";
            }
            else if(p>60 && p<=90){
                this.c = "D";
            }
            else if(p>90){
                this.c = "G";
            }
        }
        else if(this.a>=1.20 && this.a<=1.70){
            if(p<=60){
                this.c = "B";
            }
            else if(p>60 && p<=90){
                this.c = "E";
            }
            else if(p>90){
                this.c = "H";
            }
        }
        else if(this.a>1.70){
            if(p<=60){
                this.c = "C";
            }
            else if(p>60 && p<=90){
                this.c = "F";
            }
            else if(p>90){
                this.c = "I";
            }
        }
        
        return this.c;
    }
}
