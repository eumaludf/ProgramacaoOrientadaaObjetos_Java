/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F_Encapsulamento_Ex09;

/**
 *
 * @author Aluno
 */
public class ImcDAO {
    
    private String c;
    
     public String Calcula(ImcDTO imcDTO){
        
        if(imcDTO.getA()<1.20){
            if(imcDTO.getP()<=60){
                this.c = "A";
            }
            else if(imcDTO.getP()>60 && imcDTO.getP()<=90){
                this.c = "D";
            }
            else if(imcDTO.getP()>90){
                this.c = "G";
            }
        }
        
        else if(imcDTO.getA()>=1.20 && imcDTO.getA()<=1.70){
            if(imcDTO.getP()<=60){
                this.c = "B";
            }
            else if(imcDTO.getP()>60 && imcDTO.getP()<=90){
                this.c = "E";
            }
            else if(imcDTO.getP()>90){
                this.c = "H";
            }
        }
        
        else if(imcDTO.getA()>1.70){
            if(imcDTO.getP()<=60){
                this.c = "C";
            }
            else if(imcDTO.getP()>60 && imcDTO.getP()<=90){
                this.c = "F";
            }
            else if(imcDTO.getP()>90){
                this.c = "I";
            }
        }
        
        return this.c;
    }

}
