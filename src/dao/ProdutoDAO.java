/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.ProdutoVO;
import persistencia.Conexao;

/**
 *
 * @author Menin
 */
public class ProdutoDAO {
    public void cadastrarProduto(ProdutoVO pVO) throws SQLException{
        Connection con= Conexao.getConexao();
        Statement stat= con.createStatement();
        try{
            String sql;
            sql = "insert into tb_produto (id_produto, preco, nomeProduto, caracteristicas, id_categoria)"
          + "values (null,'" + pVO.getPreco()+ "'," + pVO.getNomeProduto()+ ",'" + pVO.getCaracteristicas()+ "','" + "',"+ pVO.getIdCategoria()+ ")";
            stat.execute(sql);
    }catch(SQLException e){
        throw new SQLException("Erro ao inserir produto");
        
    }finally{
            stat.close();
            con.close();
                   
        }
    
}
    public ArrayList<ProdutoVO> buscarProdutos() throws SQLException{
        Connection con= Conexao.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql;
            sql="select * from cliente";
            
        } catch (Exception e) {
        }
    }
}
