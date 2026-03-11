/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package H_Polimorfismo_Ex02;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class AlunoVIEW {
     public static void main(String[] args){
    AlunoDTO alunoDTO = new AlunoDTO();
    AlunoCTR alunoCTR = new AlunoCTR();
    


        alunoDTO.setN1(Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 1")));
         alunoDTO.setN2(Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 2")));
          alunoDTO.setN3(Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 3")));
           alunoDTO.setN4(Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 4")));
        
        alunoDTO.setOpc(Integer.parseInt(JOptionPane.showInputDialog
        ("Digite: \n1 - Calcular média das notas 1 e 2"
         + "\n2 - Calcular média das notas 1,2 e 3"
         + "\n3 - Calcular média das notas 1,2,3 e 4")));
        
        JOptionPane.showMessageDialog(null, alunoCTR.imprimir(alunoDTO));
        
    }
}
