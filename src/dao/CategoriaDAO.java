/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.CategoriaVO;
import persistencia.Conexao;

/**
 *
 * @author Menin
 */
public class CategoriaDAO {

    public void addCategoria(CategoriaVO cVO) throws SQLException {
        Connection con = Conexao.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql;
            sql = "insert into categoria nome_categoria values" + cVO.getNomeCategoria();
            stat.execute(sql);
        } catch (SQLException se) {
            throw new SQLException("Erro ao inserir categoria" + se.getMessage());
        } finally {
            con.close();
            stat.close();
        }

    }

    public void DeletarCategoria(int idCategoria) throws SQLException {
        Connection con = Conexao.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql = "delete from categoria where id_categoria= " + idCategoria;
            stat.execute(sql);
        } catch (SQLException se) {
            throw new SQLException("Erro ao deletar " + se.getMessage());

        } finally {
            con.close();
            stat.close();

        }
    }

    public ArrayList<CategoriaVO> buscarCategorias() throws SQLException {
        Connection con = Conexao.getConexao();
        Statement stat = con.createStatement();
        ArrayList <CategoriaVO> retornaCategoria = new ArrayList<>();
        try {
            String sql = "select * from categoria";
            ResultSet rs = stat.executeQuery(sql);

            while (rs.next()) {
                CategoriaVO cVO = new CategoriaVO();
                cVO.setIdCategoria(rs.getInt("id_categoria"));
                cVO.setNomeCategoria(rs.getString("nome_categoria"));
                
                retornaCategoria.add(cVO);
            }
        } catch (SQLException ex) {
            throw new SQLException(ex.getMessage());
        }
        return retornaCategoria;
    }
    
    public String retornaCategoria(int idCategoria) throws SQLException{
        Connection con = Conexao.getConexao();
        Statement stat = con.createStatement();
        
        String categoria = "";
        try {
            String sql = "select nome_categoria from categoria where id_categoria = " + idCategoria;
            ResultSet rs = stat.executeQuery(sql);

            while (rs.next()) {
                categoria = rs.getString("nome_categoria");
            }
        } catch (SQLException ex) {
            throw new SQLException(ex.getMessage());
        }
        return categoria;
    }
}
