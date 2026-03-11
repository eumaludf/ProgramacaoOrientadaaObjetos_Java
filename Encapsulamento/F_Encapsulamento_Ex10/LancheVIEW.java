/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F_Encapsulamento_Ex10;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class LancheVIEW {
     public static void main(String[] args){
        try{
            LancheDTO lancheDTO = new LancheDTO();
            LancheCTR lancheCTR = new  LancheCTR();
                
            int o;
            
             JOptionPane.showMessageDialog(null, "==========Lanchonete==========" + "\nHamburger: 1 ---- R$1.50" +
                "\nCheeseburguer: 2 ---- R$1.00" + "\nMisto Quente: 3 ---- R$1.20" + "\nAmericano: 4 ---- R$2.00" + "\nQueijo Ptrato: 5 ---- R$1.00" +
                 "\nSair:0");
            
            do{
            o = Integer.parseInt(JOptionPane.showInputDialog("Informe o pedido:"));
            
            if(o!=1 && o!=2 && o!=3 && o!=4 && o!=5 && o!=0){
               JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
            else{
             lancheDTO.setC(o);
             lancheCTR.Calcula(lancheDTO);
            }
            
            }while(o !=0 );
            
            JOptionPane.showMessageDialog(null, lancheCTR.Exibe(lancheDTO));
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistem: " + e.getMessage());
        }
    } 
}
