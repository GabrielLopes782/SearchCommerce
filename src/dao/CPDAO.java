/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import model.CPVO;
import persistencia.Conexao;

/**
 *
 * @author Menin
 */
public class CPDAO {

    public void addCP(CPVO CPVO) throws SQLException {
        Connection con = Conexao.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql;
            sql = "insert into tb_compra_produto (quantidade, idProduto, idCompra) values" + CPVO.getQtd() + "'," + CPVO.getIdProd() + "'," + CPVO.getIdCompra();
            stat.execute(sql);
        } catch (SQLException se) {
            throw new SQLException("Erro ao inserir Compra do Produto " + se.getMessage());
        } finally {
            con.close();
            stat.close();
        }

    }
}
