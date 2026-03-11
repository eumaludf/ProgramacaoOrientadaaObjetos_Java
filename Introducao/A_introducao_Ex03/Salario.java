/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_introducao_Ex03;

/**
 *
 * @author Aluno
 */
public class Salario {
    double sal, a, salf;
    public String calculaAumento(double sal, double a){
        this.sal = sal;
        this.a = a;
        this.salf = sal + (sal * (a/100));
        
        return ("O novo salário com aumento é: R$" + salf);
    }
}
