/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.autocleansystem.dal;

import java.sql.*;

/**
 *
 * @author h24he
 */
public class ModuloConexao {
    
    public static Connection conector() {
        
        java.sql.Connection conexao = null;
        
        String url = "jdbc:mysql://localhost:3306/lavacao";
        String user = "root";
        String password = "senha123";
        
        try {
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            return null;
        }
        
    }
    
}
