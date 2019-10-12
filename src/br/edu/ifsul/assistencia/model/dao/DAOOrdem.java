/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.assistencia.model.dao;

import br.edu.ifsul.assistencia.model.Ordem;
import br.edu.ifsul.assistencia.model.Peca;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 20181210031
 */
public class DAOOrdem {
    // sem localizar ?
    // INSERIR, ALTERAR , REMOVER, LISTAR, LOCALIZAR
    public boolean incluir(Ordem obj){
        //Arrumar
        String sql = " insert into ordem (motivo, peca) values (?,?)";
        try{
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setString(1, obj.getMotivo());
            pst.setInt(2, obj.getPeca().getCodigoPeca());
            
            if(pst.executeUpdate()>0){
                System.out.println("Ordem incluida com sucesso");
                return true;
            }else{
                return false;
            }
        }catch (SQLException e){
            System.out.println("Erro de SQL: "+ e.getMessage());
            return false;
        }   
}
    
    public boolean alterar(Ordem obj){
        String sql = "update ordem set motivo=?, peca=? where ordem_cod =?)";
        try{
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setString(1, obj.getMotivo());
            //??
            pst.setInt(2, obj.getPeca().getCodigoPeca());
            pst.setInt(3, obj.getOrdem_cod());
            
            if(pst.executeUpdate()>0){
                System.out.println("Ordem atualizada com sucesso");
                return true;
            }else{
                return false;
            }
            }catch (Exception e){
                    System.out.println("Erro SQL: "+e.getMessage());
                    return false;
                    }
        }
    
    public boolean remover(Ordem obj){
        String sql = "delete * from ordem where ordem_cod=?";
        try{
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, obj.getOrdem_cod());
            
            if(pst.executeUpdate()> 0){
                System.out.println("Ordem removida com sucesso");
                return true;
            }else{
                return false;
            }
                    
        }catch(Exception e){
            System.out.println("Erro SQL: "+ e.getMessage());
            return false;
        }
        
        
    }
    
    public List<Ordem> listar(){
        //revisar 2008
        String sql = "select o.ordem_cod, o.motivo, o.peca, pe.nome, m.nome,  ma.nome from ordem as o, " +
"pecas as pe, modelo as m, marca as ma where o.peca = pe.peca_cod and pe.modelo = m.modelo_cod and m.marca = ma.marca_cod order by" +
"o.ordem_cod asc;";
        List<Ordem> lista = new ArrayList<>();
        try{
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                Ordem o = new Ordem();
                o.setOrdem_cod(rs.getInt("ordem_cod"));
                o.setMotivo(rs.getString("motivo"));
                Peca p = new Peca();
                p.setCodigoPeca(rs.getInt("peca"));
                o.setPeca(p);
                lista.add(o);
            }
        }catch (Exception e){
            System.out.println("Erro de SQL: "+ e.getMessage());
        }
        return lista;
    }
    
    
            
            
            
        
    
}
