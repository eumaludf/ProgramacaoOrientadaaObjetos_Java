/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E_Excecao_Ex01;

/**
 *
 * @author Aluno
 */
public class Tabuada {
    private int num;
    private String r ="";
    
    public String calcular(int num){
        try{
            this.num = num;
            for(int i=1; i<=10; i++){
                this.r += this.num + " x " + i + " = " + this.num*i +"\n";
            } 
            return this.r;

        }
        catch(Exception e){
            return this.r;
        }
    }
    
}
