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

        CategoriaDAO cDAO = dao.DAOFactory.getCategoriaDAO();
        ArrayList<ProdutoVO> retornaProduto = new ArrayList<>();
        try {
            String sqlProduto;
            sqlProduto = "select * from tb_produto";
            ResultSet rs = stat.executeQuery(sqlProduto);

            while (rs.next()) {
                ProdutoVO pVO = new ProdutoVO(rs.getInt("id_produto"), rs.getFloat("preco"), rs.getString("nomeProduto"),
                        rs.getString("caracteristicas"), cDAO.retornaCategoria(rs.getInt("id_categoria")), rs.getInt("id_categoria"));
                
                retornaProduto.add(pVO);
            }
            return retornaProduto;

        } catch (SQLException e) {
            throw new SQLException("Erro ao buscar Produto" + e.getMessage());
        } finally {
            con.close();
            stat.close();
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

    public ArrayList<ProdutoVO> filtraProdutoNome(String nome) throws SQLException {
        ArrayList<ProdutoVO> Produto = new ArrayList<>();
        Connection con = Conexao.getConexao();
        Statement stat = con.createStatement();
        CategoriaDAO cDAO = new CategoriaDAO();

        try {
            String sql = "select * from tb_produto where nomeProduto like '%" + nome + "%'";
            ResultSet rs = stat.executeQuery(sql);

            while (rs.next()) {
                ProdutoVO pVO = new ProdutoVO(rs.getInt("id_produto"), rs.getFloat("preco"), rs.getString("nomeProduto"),
                        rs.getString("caracteristicas"), cDAO.retornaCategoria(rs.getInt("id_categoria")), rs.getInt("id_categoria"));

                Produto.add(pVO);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.close();
            stat.close();
        }
        return Produto;
    }

    public ArrayList<ProdutoVO> filtraProdutoCB(int idCategoria) throws SQLException {
        ArrayList<ProdutoVO> Produto = new ArrayList<>();
        Connection con = Conexao.getConexao();
        Statement stat = con.createStatement();
        CategoriaDAO cDAO = new CategoriaDAO();

        try {
            String sql = "select * from tb_produto where id_categoria = " + idCategoria;
            ResultSet rs = stat.executeQuery(sql);
//            while(rs.next()){
//                System.out.println(rs.getString("nomeProduto"));;
//            }
            
            while (rs.next()) {
                ProdutoVO pVO = new ProdutoVO(rs.getInt("id_produto"), rs.getFloat("preco"), rs.getString("nomeProduto"),
                        rs.getString("caracteristicas"), cDAO.retornaCategoria(rs.getInt("id_categoria")), rs.getInt("id_categoria"));
//                System.out.println(pVO);
                Produto.add(pVO);
//                System.out.println(Produto);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.close();
            stat.close();
        }
        return Produto;
    }

    public ArrayList<ProdutoVO> filtraProdutoNomeCB(String nome, int idCategoria) throws SQLException {
        ArrayList<ProdutoVO> Produto = new ArrayList<>();
        ArrayList<ProdutoVO> Aux = new ArrayList<>();
        
        Connection con = Conexao.getConexao();
        Statement stat = con.createStatement();
        CategoriaDAO cDAO = new CategoriaDAO();

        try {
            String sql = "select * from tb_produto where nomeProduto like '%" + nome + "%'";
            ResultSet rs = stat.executeQuery(sql);

            while (rs.next()) {
                ProdutoVO pVO = new ProdutoVO(rs.getInt("id_produto"), rs.getFloat("preco"), rs.getString("nomeProduto"),
                        rs.getString("caracteristicas"), cDAO.retornaCategoria(rs.getInt("id_categoria")), rs.getInt("id_categoria"));

                Aux.add(pVO);
            }
            
            for(ProdutoVO produto : Aux){
                if(produto.getIdCategoria() == idCategoria){
                    Produto.add(produto);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.close();
            stat.close();
        }
        return Produto;
    }
}
