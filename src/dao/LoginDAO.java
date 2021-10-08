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
import model.idVO;
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
                    + " values (null, '" + lVO.getUsuario() + "','" + lVO.getSenha() + "')";

            stat.execute(sql);
            
            sql = "select id_login from login_user where usuario = '" + lVO.getUsuario() + "'";
            ResultSet rs = stat.executeQuery(sql);
            
            if (rs != null && rs.next()) {
                idVO idVO = new idVO();
                idVO.setIdLogin(rs.getInt("id_login"));
            }

        } catch (SQLException ex) {
            throw new SQLException("Erro ao inserir o usuario! " + ex.getMessage());
        } finally {
            stat.close();
            con.close();
        }
    }

    public boolean verificaLogin(loginVO lVO) throws SQLException {
        usuarioServices usuarioS = services.ServicesFactory.getUserServices();
        Connection con = Conexao.getConexao();
        Statement stat = con.createStatement();

        try {
            String sql = "select * from login_user where usuario = '" + lVO.getUsuario() + "'";

            ResultSet rs = stat.executeQuery(sql); 
            
            
            while (rs.next()) {
                if (rs.getString("usuario").equalsIgnoreCase(lVO.getUsuario())) {
                    if (rs.getString("senha").equals(lVO.getSenha())) {
                        SearchCommerce.userLogin = true;

                        idVO idVO = new idVO(0, rs.getInt("id_login"));
                        usuarioS.buscaUsuario(rs.getInt("id_login"));

                    } else {
                        SearchCommerce.userLogin = false;
                    }
                } else {
                    SearchCommerce.userLogin = false;
                }
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
