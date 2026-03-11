/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto_1.ctr;

import java.sql.ResultSet;
import br.com.projeto_1.dao.ClienteDAO;
import br.com.projeto_1.dao.ConexaoDAO;
import br.com.projeto_1.dto.ClienteDTO;

/**
 *
 * @author Aluno
 */
public class ClienteCTR {
    ClienteDAO clienteDAO = new ClienteDAO();
    
    public ClienteCTR(){}
    
    public String inserirCliente(ClienteDTO clienteDTO){
        try{
            if(clienteDAO.inserirCliente(clienteDTO)){
                return "Cliente cadastrado com sucesso!";
            }
            else{
                return "Cliente NÃO cadastrado.";
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return "Cliente NÃO cadastrado.";
        }
    }
    
    public ResultSet consultarCliente(ClienteDTO clienteDTO, int opcao){
        ResultSet rs = null;
        rs = clienteDAO.consultarCliente(clienteDTO, opcao);
        
        return rs;
    }
    
    public void CloseDB(){
        ConexaoDAO.CloseDB();
    }
    
} // fecha classe
