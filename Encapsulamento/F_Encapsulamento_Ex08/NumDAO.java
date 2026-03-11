/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F_Encapsulamento_Ex08;

/**
 *
 * @author Aluno
 */
public class NumDAO {
     private String r;
    
    public String Ordem(NumDTO numDTO){
        
        if(numDTO.getA() >= numDTO.getB() && numDTO.getA()>numDTO.getC() & numDTO.getB()>numDTO.getC()){
            this.r = "Ordenados: " + numDTO.getC() + ", " + numDTO.getB()+ ", " + numDTO.getA();
        }
        else if(numDTO.getA() > numDTO.getB() && numDTO.getA()>=numDTO.getC() & numDTO.getC()>numDTO.getB()){
            this.r = "Ordenados: " + numDTO.getB() + ", " + numDTO.getC()+ ", " + numDTO.getA();

        }
        if(numDTO.getA() <= numDTO.getB() && numDTO.getB()>numDTO.getC() & numDTO.getA()>numDTO.getC()){
            this.r = "Ordenados: " + numDTO.getC() + ", " + numDTO.getA()+ ", " + numDTO.getB();
        }
        else if(numDTO.getA() < numDTO.getB() && numDTO.getB() >= numDTO.getC() & numDTO.getC()>numDTO.getA()){
            this.r = "Ordenados: " + numDTO.getA() + ", " + numDTO.getC()+ ", " + numDTO.getB();

        }
        else if(numDTO.getA() <= numDTO.getC() && numDTO.getC()>numDTO.getB() & numDTO.getA()>numDTO.getB()){
            this.r = "Ordenados: " + numDTO.getB() + ", " + numDTO.getA()+ ", " + numDTO.getC();
        }
        else if(numDTO.getA() < numDTO.getC() && numDTO.getB() <= numDTO.getC() & numDTO.getB()> numDTO.getA()){
            this.r = "Ordenados: " + numDTO.getA() + ", " + numDTO.getB()+ ", " + numDTO.getC();

        }
        else if(numDTO.getA() == numDTO.getC() && numDTO.getA()== numDTO.getB()){
             this.r = "Ordenados: " + numDTO.getA() + ", " + numDTO.getB()+ ", " + numDTO.getC();
        }
        
        return this.r;
    }
}
