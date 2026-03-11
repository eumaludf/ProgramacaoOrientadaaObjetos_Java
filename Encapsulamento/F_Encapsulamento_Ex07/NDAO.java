/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F_Encapsulamento_Ex07;

/**
 *
 * @author Aluno
 */
public class NDAO {
    
     private String r;
    
    public String Ordem(NDTO nDTO){
        
        if(nDTO.getN1() > nDTO.getN2() || nDTO.getN1()>nDTO.getN3() || nDTO.getN2()>nDTO.getN3()){
            this.r = "A ordem dos três primeiros é inválida, pois não é crescente!";
        }
        else{
            if(nDTO.getN4()<nDTO.getN1()){
                this.r = "Ordem inversa: " + nDTO.getN3() + ", " + nDTO.getN2()+ ", " + nDTO.getN1()+ ", " + nDTO.getN4();
            }
            else if(nDTO.getN4()>=nDTO.getN1() && nDTO.getN4()<= nDTO.getN2()){
                this.r = "Ordem inversa: " + nDTO.getN3() + ", " + nDTO.getN2() + ", " + nDTO.getN4() + ", " + nDTO.getN1();
            }
            else if(nDTO.getN4()>nDTO.getN1() && nDTO.getN4()>nDTO.getN2() && nDTO.getN4()<nDTO.getN3()){
                this.r = "Ordem inversa: " + nDTO.getN3() + ", " + nDTO.getN4()+ ", " + nDTO.getN2() + ", " + nDTO.getN1();
            }
            else if(nDTO.getN4()>=nDTO.getN3()){
                this.r = "Ordem inversa: " + nDTO.getN4() + ", " + nDTO.getN3()+ ", " + nDTO.getN2() + ", " + nDTO.getN1();
            }
        }
        
        return this.r;
    }

}
