/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F_Encapsulamento_Ex11;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class CidadeVIEW {
     public static void main(String[] args){
        try{
            CidadeDTO cidadeDTO = new CidadeDTO();
            CidadeCTR cidadeCTR = new  CidadeCTR();
                
            char s;
            String sexo;
            int o;
            double sal;
            
             JOptionPane.showMessageDialog(null, "=====Faixa Salarial da Cidade======");
            
            do{
           sexo = JOptionPane.showInputDialog("Informe o sexo (F - FEMININO | M - MASCULINO):");
           s = sexo.charAt(0); // Simples e direto
           if(s!='f' && s!='F' && s!='m' && s!='M'){
               JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
            sal = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário mensal:"));
            
            o = Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar? 1-Sim e 0-Não"));
            
            if(o!=1 && o!=0){
               JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
            else{
             cidadeDTO.setSexo(s);
             cidadeDTO.setSal(sal);
             cidadeCTR.calcula(cidadeDTO);
            }
            
            }while(o !=0 );
            
            JOptionPane.showMessageDialog(null, cidadeCTR.exibe(cidadeDTO));
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistem: " + e.getMessage());
        }
    } 
}
