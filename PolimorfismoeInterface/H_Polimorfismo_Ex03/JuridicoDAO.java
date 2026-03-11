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
public class JuridicoDAO extends ClienteDAO {
  public String mostrarDados(JuridicoDTO juridicoDTO){
        return super.mostrarDados(juridicoDTO) +     
        "\nO CNPJ do cliente: " + juridicoDTO.getCnpj() +
        "\nO IE do cliente: " + juridicoDTO.getIe();
    } 
}
