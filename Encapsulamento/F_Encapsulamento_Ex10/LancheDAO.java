/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F_Encapsulamento_Ex10;

/**
 *
 * @author Aluno
 */
public class LancheDAO {
    String f;
    public void Calcula(LancheDTO lancheDTO){
        if(lancheDTO.getC() == 1){
          lancheDTO.setH(lancheDTO.getH() + 1);   
        }
        if(lancheDTO.getC() == 2){
          lancheDTO.setCb(lancheDTO.getCb() + 1);   
        }
        if(lancheDTO.getC() == 3){
           lancheDTO.setM(lancheDTO.getM() + 1);
        }
        if(lancheDTO.getC() == 4){
           lancheDTO.setA(lancheDTO.getA() + 1);   
        }
        if(lancheDTO.getC() == 5){
          lancheDTO.setQ(lancheDTO.getQ() + 1);   
        }

        
        lancheDTO.setT((lancheDTO.getH() * 1.50) + 
       (lancheDTO.getCb() * 1.00) + (lancheDTO.getM() * 1.20) +
       (lancheDTO.getA() * 2.00) + (lancheDTO.getQ() * 1.00));
       

    }
    
    private String r;
    
    public String Exibe(LancheDTO lancheDTO){
       
       this.r = "Codigo |  Quantidade |   Preço \n------------------------------------------\n";
       
       if(lancheDTO.getH() > 0){
         this.r += 1 + "    |    " +  lancheDTO.getH() + "    |    R$" + 1.50 +"\n";
       }
       if(lancheDTO.getCb() > 0){
         this.r += 2 + "    |    " +  lancheDTO.getCb() + "    |    R$" + 1.00 +"\n";
       }
       if(lancheDTO.getM() > 0){
         this.r += 3 + "    |    " +  lancheDTO.getM() + "    |    R$" + 1.20 +"\n";
       }
       if(lancheDTO.getA() > 0){
         this.r += 4 + "    |    " +  lancheDTO.getA() + "    |    R$" + 2.00 +"\n";
       }
       if(lancheDTO.getQ() > 0){
         this.r += 5 + "    |    " +  lancheDTO.getQ() + "    |    R$" + 1.00 +"\n";
       }
       
       this.r += "TOTAL = R$" + lancheDTO.getT();
       
       return r;
    }
}
