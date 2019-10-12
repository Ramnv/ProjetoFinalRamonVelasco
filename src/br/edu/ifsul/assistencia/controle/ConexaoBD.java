/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.assistencia.controle;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ramonvelasco
 */
public class ConexaoBD {
    
   public Statement stm;
   public ResultSet rs;
   private String driver = "org.postgresql.Driver";
   private String caminho = "jdbc:postgresql://localhost:5432/COLOCARNOME";
   private String usuario = "postgres";
   private String senha = "123";
   public Connection con;
   
   public void conexao(){
       try {
           System.setProperty("jdbc.Drivers", driver);       
           con = DriverManager.getConnection(caminho, usuario, senha);
           JOptionPane.showMessageDialog(null, "Conexao efetuada com sucesso");
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao se conectar com o banco de dados");
       }
       
   }
    
}
