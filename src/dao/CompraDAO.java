/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import model.CompraVO;
import persistencia.Conexao;

/**
 *
 * @author Menin
 */
public class CompraDAO {

    public void cadastrarCompra(CompraVO cVO) throws SQLException {
        Connection con = Conexao.getConexao();
        Statement stat = con.createStatement();
        try {

            String sql = "insert into tb_compra(id_compra,data,precoTotal,parcelas,tb_cliente_id) values" + "(" + cVO.getId_compra() + "'," + cVO.getData() + "'," + cVO.getPrecoTotal() + "'," + cVO.getParcelas() + "'," + cVO.getTb_cliente_id() + ")";
            stat.execute(sql);

        } catch (SQLException se) {
            throw new SQLException("Erro ao inserir compra" + se.getMessage());
        } finally {
            stat.close();
            con.close();
        }

    }
}
