/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package H_Polimorfismo_Ex01;

/**
 *
 * @author Aluno
 */
public class ClienteDAO {
    public String mostrar(ClienteDTO clienteDTO){
        return "O nome informado foi: " + clienteDTO.getNome() +
                "\nO RG informado foi: " + clienteDTO.getRg() +
                verifica(clienteDTO.getIdade()) + verifica(clienteDTO.getAltura()); 
    }


public String verifica(int idade){
    if(idade > 18){

          return "\nIdade maior que 18, pode entrar no brinquedo.";
    }
    else{
       return "\nIdade menor que 18, não pode entrar no brinquedo."; 
    }
}

public String verifica(double altura){
    if(altura > 1.50){

          return "\nAltura maior que 1.50m, pode entrar no brinquedo.";
    }
    else{
       return "\nAltura menor que 1.50m, não pode entrar no brinquedo.";
    }
}


}