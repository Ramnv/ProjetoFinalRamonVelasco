/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.assistencia.model.dao;

import br.edu.ifsul.assistencia.model.Marca;
import br.edu.ifsul.assistencia.model.Modelo;
import br.edu.ifsul.assistencia.model.Ordem;
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
public class DAOProduto {

    // TERMINAR
    // INSERIR, ALTERAR , REMOVER, LOCALIZAR
    public boolean incluir(Produto obj) {
        String sql = "insert into produtos (motivo, n_serie, modelo) values (?,?,?,?)";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setString(1, obj.getMotivo());
            pst.setString(2, obj.getNumeroSerie());

            pst.setInt(3, obj.getModelo().getCodigoModelo());

            

            if (pst.executeUpdate() > 0) {
                System.out.println("Produto incluido com sucesso");
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            System.out.println("Erro de SQL: " + e.getMessage());
            return false;
        }
    }

    public boolean remover(Produto obj) {
        String sql = "delete from produtos where produto_cod = ?";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, obj.getCodigoProduto());
            if (pst.executeUpdate() > 0) {
                System.out.println("Produto removido com sucesso");
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            System.out.println("Erro de SQL: " + e.getMessage());
            return false;
        }
    }

    public Produto localizar(Integer id) {
       
        String sql = " select p.produto_cod,c.nome, p.motivo, p.n_serie, \n" +
"                 ma.nome as marca, m.nome as modelo,  pe.nome as peca, pe.valor, o.pago\n" +
"                 from produto as p, modelo as m, ordem as o, pecas as pe,marca as ma,\n" +
"                cliente as c where p.modelo= m.modelo_cod \n" +
"                and m.marca = ma.marca_cod\n" +
"                 and p.ordem = o.ordem_cod and o.peca = pe.peca_cod and\n" +
"                c.produto=p.produto_cod and p.produto_cod= ?";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, id);

            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Produto p = new Produto();
                p.setCodigoProduto(rs.getInt("produto_cod"));
                p.setNumeroSerie(rs.getString("n_serie"));
                p.setMotivo(rs.getString("motivo"));
                
               
                Peca pe = new Peca();
                pe.setDescricaoPeca(rs.getString("peca"));
                pe.setValor(rs.getFloat("valor"));
                
                
                
                Modelo m = new Modelo();
                m.setDescricao(rs.getString("modelo"));
                Marca ma = new Marca();
                ma.setDescricao(rs.getString("marca"));
                m.setMarca(ma);
                p.setModelo(m);
                
              
                  
                               
                               
            }
        } catch (Exception e) {
            System.out.println("Erro de SQL: " + e.getMessage());
        }
        return null;

    }

    public List<Produto> listar() {
        String sql = "select p.produto_cod,c.nome, p.motivo, p.n_serie, \n" +
"                 ma.nome as marca, m.nome as modelo \n" +
"                 from produto as p, modelo as m, marca as ma,\n" +
"                cliente as c where p.modelo= m.modelo_cod \n" +
"                and m.marca = ma.marca_cod\n" +
"                   and\n" +
"                c.produto=p.produto_cod order by p.produto_cod asc"; 
        List<Produto> lista = new ArrayList<>();
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Produto p = new Produto();
                p.setCodigoProduto(rs.getInt("produto_cod"));
                p.setMotivo(rs.getString("motivo"));
                p.setNumeroSerie(rs.getString("n_serie"));
                
               
                
                Modelo m = new Modelo();
                m.setDescricao(rs.getString("modelo"));
                Marca ma = new Marca();
                ma.setDescricao(rs.getString("marca"));
                m.setMarca(ma);
                p.setModelo(m);
                
                lista.add(p);
            }
        } catch (Exception e) {
            System.out.println("Erro de SQL: " + e.getMessage());
        }
        return lista;
    }

    public boolean atualizar(Produto obj) {
        String sql = "update produto set motivo = ?, n_serie= ?,"
                + " modelo=? where produto_cod = ?";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setString(1, obj.getMotivo());
            pst.setString(2, obj.getNumeroSerie());
            pst.setInt(2, obj.getModelo().getCodigoModelo());
            pst.setInt(5, obj.getCodigoProduto());

            if (pst.executeUpdate() > 0) {
                System.out.println("Produto atualizado com sucesso");
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            System.out.println("Erro de SQL: " + e.getMessage());
            return false;
        }
    }
    public List<Produto> listarProduto() {
           String sql = "select * from produto order by n_serie";
           
           List<Produto> lista = new ArrayList<>();
           try{
               PreparedStatement pst = Conexao.getPreparedStatement(sql);
               ResultSet rs = pst.executeQuery();
               
             while(rs.next()){
                 Produto p = new Produto(); 
                // m.setCodigo_marca(rs.getInt("marca_cod"));
                 p.setNumeroSerie(rs.getString("n_serie"));
                 
                 lista.add(p);
                         
                 
             }
           }catch (Exception e ){
                     System.out.println(" Erro de SQL: " + e.getMessage());
           }
           return lista;
           
           }
           
       
}
