/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_IF_Ex02;

/**
 *
 * @author Aluno
 */
public class Solo {
    private double solo;
    private String r;
    
    public String avaliaSolo(double solo){
        this.solo = solo;
        
        if(this.solo <=10){
            this.r = "Rochosa.";
        }
        else if(this.solo >10 && this.solo<=40){
            this.r = "Firme.";
        }
        else if(this.solo >40 && this.solo<=80){
            this.r = "Pantanoso.";
        }
        else{
            this.r = "quantidade de água invalida!";
        }
        
        return ("O resultado da avaliação é: " + r);
    }
}
