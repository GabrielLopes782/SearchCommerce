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
import java.util.logging.Level;
import java.util.logging.Logger;
import model.ProdutoVO;
import persistencia.Conexao;

/**
 *
 * @author Menin
 */
public class ProdutoDAO {

    public void cadastrarProduto(ProdutoVO pVO) throws SQLException {
        Connection con = Conexao.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql;
            sql = "insert into tb_produto (id_produto, preco, nomeProduto, caracteristicas, id_categoria)"
                    + "values (null,'" + pVO.getPreco() + "'," + pVO.getNomeProduto() + ",'" + pVO.getCaracteristicas() + "','" + "'," + pVO.getIdCategoria() + ")";
            stat.execute(sql);
        } catch (SQLException e) {
            throw new SQLException("Erro ao inserir produto");

        } finally {
            stat.close();
            con.close();

        }

    }

    public ArrayList<ProdutoVO> buscarProdutosEspecificos(ProdutoVO pVO) throws SQLException {
        Connection con = Conexao.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql;
            sql = "select * from tb_produto where nomeProduto like" + "%" + pVO.getNomeProduto() + "%";
            ResultSet rs = stat.executeQuery(sql);
            ArrayList<ProdutoVO> Produto = new ArrayList<>();
            return Produto;
        } catch (SQLException e) {
            throw new SQLException("Erro ao buscar Produto" + e.getMessage());
        }

    }
       public ArrayList<ProdutoVO> buscarProdutos() throws SQLException {
        Connection con = Conexao.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql;
            sql = "select * from tb_produto";
            ResultSet rs = stat.executeQuery(sql);
            ArrayList<ProdutoVO> Produto = new ArrayList<>();
            
            return Produto;
        } catch (SQLException e) {
            throw new SQLException("Erro ao buscar Produto" + e.getMessage());
        }
    }

    public void DeletarProdutos(int idProduto) throws SQLException {
        Connection con = Conexao.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql;
            sql = "delete from tb_produto where id_produto=" + idProduto;
            stat.execute(sql);
        } catch (SQLException ex) {
            throw new SQLException("Erro ao deletar Produto" + ex.getMessage());
        } finally {
            con.close();
            stat.close();
        }
    }

    public void alterarProduto(ProdutoVO pVO) throws SQLException {
        Connection con = Conexao.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql = "update tb_produto set"
                    + "nomeProduto'" + pVO.getNomeProduto() + "','"
                    + "preco'" + pVO.getPreco() + "',"
                    + "caracteristicas" + pVO.getCaracteristicas() + "' "
                    + "where id_produto=" + pVO.getIdCategoria() + " ";
            stat.executeUpdate(sql);
        } catch (SQLException se) {
            throw new SQLException("Erro ao Alterar o Produto!" + se.getMessage());

        } finally {
            con.close();
            stat.close();
        }
    }
    
    public ArrayList<ProdutoVO> filtraProdutoNome(String nome) throws SQLException{
        
            Connection con = Conexao.getConexao();
            Statement stat = con.createStatement();
            
            String sql = "select * from tb_produto where nomeProduto like '% " + nome + "%'";
            ResultSet rs = stat.executeQuery(sql);
            
            ArrayList<ProdutoVO> Produto = new ArrayList<>();
            
            while (rs.next()) {
                ProdutoVO prod = new ProdutoVO(rs.getInt("id_produto"), rs.getFloat("preco"), rs.getString("nomeProduto"), rs.getString("caracteristicas"), rs.getInt("id_categoria"));
                Produto.add(prod);
            }
            return Produto;
    }
}
