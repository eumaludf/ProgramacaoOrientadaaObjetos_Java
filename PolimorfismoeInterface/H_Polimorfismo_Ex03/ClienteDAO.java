/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package H_Polimorfismo_Ex03;

/**
 *
 * @author Aluno
 */
public class ClienteDAO {
   public String mostrarDados(ClienteDTO clienteDTO){
       return "O nome do cliente: " + clienteDTO.getNome() +
               "\nO endereço do cliente: " + clienteDTO.getCidade() + ", " +
               clienteDTO.getEndereco() + " " +  clienteDTO.getNumero() + ", " +
               clienteDTO.getEstado();
   }
}
