/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E_Excecao_Ex01;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class PrincipalTabuda {
    public static void main(String args[]){
        try{
        Tabuada tabuada = new Tabuada();
        JOptionPane.showMessageDialog(null,
        tabuada.calcular(Integer.parseInt(JOptionPane.showInputDialog(null,"Informe um número:" ))));
        
    }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro: Deve ser informado apens números!");
            System.out.println("Erro " + e.getMessage());
            
        }
      finally{
            JOptionPane.showMessageDialog(null, "Fim do sistema");

        }
    }
}
