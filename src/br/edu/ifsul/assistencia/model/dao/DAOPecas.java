/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.assistencia.model.dao;

import br.edu.ifsul.assistencia.model.Marca;
import br.edu.ifsul.assistencia.model.Modelo;
import br.edu.ifsul.assistencia.model.Peca;
import br.edu.ifsul.assistencia.model.Produto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 20181210031
 */
public class DAOPecas {
    // INSERIR, ALTERAR , REMOVER, LISTAR, VERIFICAR ESTOQUE
    public boolean inserir(Peca obj){
        String sql = "insert into pecas (nome, modelo, estoque, valor) values (?,?,?,?)";
        try{
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setString(1, obj.getDescricaoPeca());
            pst.setInt(2, obj.getModelo().getCodigoModelo());
            pst.setInt(3, obj.getEstoque());
            pst.setFloat(4, obj.getValor());
            
            if(pst.executeUpdate()>0){
                System.out.println("Peça incluída com sucesso");
                return true;
            }else{
                return false;
            }
            
                    
        }catch (SQLException e){
            System.out.println("Erro de SQL: "+ e.getMessage());
            return false;
        }
    }
    
    public boolean remover(Peca obj){
        String sql = "delete from pecas where peca_cod=?";
    try{
    PreparedStatement pst = Conexao.getPreparedStatement(sql);
    pst.setInt(1, obj.getCodigoPeca());
    if (pst.executeUpdate()> 0){
        System.out.println("Peca removida com sucesso");
        return true;
    }else{
        return false;
    }
}catch (SQLException e){
            System.out.println("Erro de SQL: "+ e.getMessage());
            return false;
}
    }
    
    public List<Peca> listar(){
        
        String sql = "select distinct p.peca_cod, p.nome, m.nome  as modelo,\n" +
"ma.nome as marca, p.estoque, p.valor from pecas as p, modelo as m, \n" +
"marca as ma, produto as po where p.modelo = m.modelo_cod and\n" +
" m.marca=ma.marca_cod order by peca_cod";
        List<Peca> lista = new ArrayList<>();
        try{
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()){
                Peca obj = new Peca();
                obj.setCodigoPeca(rs.getInt("peca_cod"));
                obj.setDescricaoPeca(rs.getString("nome"));
                
                Modelo m = new Modelo();
                m.setDescricao(rs.getString("modelo"));
                Marca ma = new Marca();
                ma.setDescricao(rs.getString("marca"));
                m.setMarca(ma);
                obj.setModelo(m);
                obj.setEstoque(rs.getInt("estoque"));
                obj.setValor(rs.getFloat("valor"));
                
                lista.add(obj);
            }
        }catch (Exception e){
            System.out.println("Erro de SQL: "+ e.getMessage());
    
}
    return lista;
}
    
    public boolean alterar(Peca obj){
        String sql = "update pecas set nome = ?, modelo=?, estoque=?, valor=? where peca_cod=?";
        try{
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setString(1, obj.getDescricaoPeca());
            pst.setInt(2, obj.getModelo().getCodigoModelo());
                        
            pst.setInt(3, obj.getEstoque());
            pst.setFloat(4, obj.getValor());
            pst.setInt(5, obj.getCodigoPeca());
            
            if(pst.executeUpdate() > 0 ){
                System.out.println("Peça atualizada com sucesso!!");
                return true;
            }else{
                return false;
            }
        }catch (SQLException e){
            System.out.println("Erro de SQL: "+ e.getMessage());
            return false;
        }
    }
    
     public List<Peca> localizar(Integer id){
        
          String sql = "select peca_cod, p.nome, m.nome as modelo, estoque, valor from pecas as p, modelo as m \n" +
"where p.modelo= m.modelo_cod and peca_cod=?";
        List<Peca> lista = new ArrayList<>();
        
        try{
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
             pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()){
                Peca obj = new Peca();
                obj.setCodigoPeca(rs.getInt("peca_cod"));
                obj.setDescricaoPeca(rs.getString("nome"));
                
                Modelo m = new Modelo();
                m.setDescricao(rs.getString("modelo"));
                
                obj.setModelo(m);
                obj.setEstoque(rs.getInt("estoque"));
                obj.setValor(rs.getFloat("valor"));
                
                lista.add(obj);
            }
        }catch (Exception e){
            System.out.println("Erro de SQL: "+ e.getMessage());
    
}
    return lista;
}
      public List<Peca> listarPeca() {
           String sql = "select * from pecas order by nome";
           
           List<Peca> lista = new ArrayList<>();
           try{
               PreparedStatement pst = Conexao.getPreparedStatement(sql);
               ResultSet rs = pst.executeQuery();
               
             while(rs.next()){
                 Peca p = new Peca(); 
                // m.setCodigo_marca(rs.getInt("marca_cod"));
                 p.setDescricaoPeca(rs.getString("nome"));
                 
                 lista.add(p);
                         
                 
             }
           }catch (Exception e ){
                     System.out.println(" Erro de SQL: " + e.getMessage());
                     }
           return lista;
           }
           
       }
    

