/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F_Encapsulamento_Ex11;

/**
 *
 * @author Aluno
 */
public class CidadeDAO {
    String t;
    public void calcula(CidadeDTO cidadeDTO){
        if(cidadeDTO.getSexo() == 'F' || cidadeDTO.getSexo() == 'f' ){
            cidadeDTO.setF(cidadeDTO.getF() + 1);
            if(cidadeDTO.getSal() <= 300.00){
                cidadeDTO.setMm(cidadeDTO.getMm() + 1);
            }
        }
        if(cidadeDTO.getSexo() == 'M'|| cidadeDTO.getSexo() == 'm'){
            cidadeDTO.setM(cidadeDTO.getM() + 1);
        }
        
        cidadeDTO.setQ(cidadeDTO.getQ() + 1);
         cidadeDTO.setT(cidadeDTO.getT() + cidadeDTO.getSal());
    }

    private String r;
    
    public String exibe(CidadeDTO cidadeDTO){
     
    cidadeDTO.setMedia(cidadeDTO.getT()/cidadeDTO.getQ());
    
    this.r = "A média salarial dos habitantes ouvidos: " + cidadeDTO.getMedia() +
            "\nO percentual de homens ouvidos: " + ((cidadeDTO.getM()* 100)/cidadeDTO.getQ()) + "%" +
            "\nO percentual de mulheres ouvidas: " + ((cidadeDTO.getF()* 100)/cidadeDTO.getQ()) + "%" +
            "\nO percentual de mulheres com salário igual ou inferior a R$300,00: " + ((cidadeDTO.getMm()*100)/cidadeDTO.getF()) + "%";
    
    return r;
}
    
}