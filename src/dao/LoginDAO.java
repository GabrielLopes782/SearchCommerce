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
import persistencia.Conexao;

/**
 *
 * @author Thiago Quevedo
 */
public class LoginDAO {
    public void cadastrarUsuario (loginVO lVO) throws SQLException{
        Connection con = Conexao.getConexao();
        
        Statement stat = con.createStatement();
        
        try {
            String sql = "insert into login_user (id_login, usuario, senha)" 
                    + "values (null, '" + lVO.getUsuario() + "','" + lVO.getSenha()+"')";
            
            stat.execute(sql);
        } catch (SQLException ex) {
            throw new SQLException("Erro ao inserir o usuario! " + ex.getMessage());
        } finally {
            stat.close();
            con.close();
        }
        
    }
}
