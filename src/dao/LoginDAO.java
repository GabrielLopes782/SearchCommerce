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
import model.loginVO;
import model.usuarioVO;
import persistencia.Conexao;
import searchcommerce.SearchCommerce;
import services.usuarioServices;

/**
 *
 * @author Thiago Quevedo
 */
public class LoginDAO {

    public void cadastraLogin(loginVO lVO) throws SQLException {
        Connection con = Conexao.getConexao();

        Statement stat = con.createStatement();

        try {
            String sql = "insert into login_user (id_login, usuario, senha)"
                    + "values (null, '" + lVO.getUsuario() + "','" + lVO.getSenha() + "')";

            stat.execute(sql);
        } catch (SQLException ex) {
            throw new SQLException("Erro ao inserir o usuario! " + ex.getMessage());
        } finally {
            stat.close();
            con.close();
        }

    }

    public boolean verificaSenha(String senha) throws SQLException {
        boolean valida = false;
        Connection con = Conexao.getConexao();
        Statement stat = con.createStatement();

        try {
            String sql = "select senha from login_user where senha = '" + senha + "'";
            ResultSet rs = stat.executeQuery(sql);
            if (rs.next()) {
                System.out.println(rs.getString("senha"));
                valida = true;
            }

        } catch (SQLException e) {
            throw new SQLException("Erro ao verificar a senha " + e.getMessage());
        }
        return valida;
    }

    public boolean verificaLogin(loginVO lVO) throws SQLException {
        usuarioServices usuarioS = services.ServicesFactory.getUserServices();
        Connection con = Conexao.getConexao();
        Statement stat = con.createStatement();

        try {
            String sql = "select * from login_user where usuario = '" + lVO.getUsuario() + "'";

            ResultSet rs = stat.executeQuery(sql);

            if (rs.getString("usuario").equalsIgnoreCase(lVO.getUsuario())) {
                if (rs.getString("senha").equals(lVO.getSenha())) {
                    SearchCommerce.userLogin = true;
                    usuarioS.buscaUsuario(rs.getInt("id_login"));

                    System.out.println("Certinho prota");

                } else {
                    SearchCommerce.userLogin = false;
                }
            } else {
                SearchCommerce.userLogin = false;
            }

        } catch (SQLException ex) {
            throw new SQLException("Erro ao buscar usuario! " + ex.getMessage());
        } finally {
            stat.close();
            con.close();
        }
        return SearchCommerce.userLogin;
    }
}
