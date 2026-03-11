/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package D_While_DoWhile_Ex02;

/**
 *
 * @author Aluno
 */
public class Letra {
    private String letra;
    private int a, e, i, o, u, c;
    
    public void verificar(String letra){
        this.letra = letra;
        if(this.letra.equalsIgnoreCase("a")){
            this.a++;
        }
        else if(this.letra.equalsIgnoreCase("e")){
            this.e++;
        }
        else if(this.letra.equalsIgnoreCase("i")){
            this.i++;
        }
        else if(this.letra.equalsIgnoreCase("o")){
            this.o++;
        }
        else if(this.letra.equalsIgnoreCase("u")){
            this.u++;
        }
        else{
            if(!letra.equalsIgnoreCase("0")){
            this.c++;
            }
        }
    }
    
    public String mostra(){
        return "A quantidade 'A' digitada foi:" + this.a +
                "\nA quantidade 'E' digitada foi:" + this.e +
                "\nA quantidade 'I' digitada foi:" + this.i +
                "\nA quantidade 'O' digitada foi:" + this.o +
                "\nA quantidade 'U' digitada foi:" + this.u +
                "\nA quantidade de consontes digitada foi:" + this.a;
    }
}
