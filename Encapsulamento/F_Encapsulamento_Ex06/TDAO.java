/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F_Encapsulamento_Ex06;

/**
 *
 * @author Aluno
 */
public class TDAO {
    private String r;
    public String testa(TDTO tDTO){
        double a, b,c;
        a = tDTO.getL() + tDTO.getL2();
        b = tDTO.getL2() + tDTO.getL3();
        c = tDTO.getL() + tDTO.getL3();
        if(a > tDTO.getL3() && b > tDTO.getL() && c > tDTO.getL2()){
           avalia(tDTO);
        }
        else{
            r = "Os lados informados não formam um triãngulo.";
        
    }
        return r;
    }
    
    public String avalia(TDTO tDTO){
        if(tDTO.getL() == tDTO.getL2() && tDTO.getL2() == tDTO.getL3()){
            r = "Os lados formam um triângulo equilátero.";
        }
        else if(tDTO.getL() == tDTO.getL2() || tDTO.getL2() == tDTO.getL3() || tDTO.getL() == tDTO.getL3()){
            r = "Os lados formam um triângulo isóceles.";
        }
        else if(tDTO.getL() != tDTO.getL2() && tDTO.getL2() != tDTO.getL3() && tDTO.getL() != tDTO.getL3()){
            r = "Os lados formam um triângulo escaleno.";
        }
        
        return r;
    }
}
