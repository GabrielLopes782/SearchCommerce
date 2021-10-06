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

    public void buscarCategorias() throws SQLException {
        Connection con = Conexao.getConexao();
        Statement stat = con.createStatement();

        try {
            String sql = "select * from categoria";
            ResultSet rs = stat.executeQuery(sql);

            while (rs.next()) {
                CategoriaVO cVO = new CategoriaVO(rs.getInt("id_categoria"), rs.getString("nome_categoria"));
                cVO.setCategorias(cVO);
            }
        } catch (SQLException ex) {
        }
    }
}
