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
import model.usuarioVO;
import persistencia.Conexao;

/**
 *
 * @author Thiago Quevedo
 */
public class UsuarioDAO {

    public void cadastraUsuario(usuarioVO uVO) throws SQLException {

        Connection con = Conexao.getConexao();

        Statement stat = con.createStatement();

        try {
            String sql = "insert into usuario (id_user, nome_user, end_user, tel_user, email_user, id_login)"
                    + "values (null, '" + uVO.getNome() + "','" + uVO.getEndereco() + "','" + uVO.getTelefone()
                    + "','" + uVO.getEmail() + "'," + idVO.getIdLogin() + ")";

            stat.execute(sql);
        } catch (SQLException ex) {
            throw new SQLException("Erro ao inserir o usuario! " + ex.getMessage());
        } finally {
            stat.close();
            con.close();
        }
    }

    public void buscaUsuario(int idLogin) throws SQLException {

        Connection con = Conexao.getConexao();
        Statement stat = con.createStatement();

        try {
            String sql = "select * from usuario where id_login = " + idLogin;

            ResultSet rs = stat.executeQuery(sql);
            if(rs.next()){
                usuarioVO usuarioVO = new usuarioVO(rs.getString("nome_user"), rs.getString("end_user"), rs.getString("tel_user"), rs.getString("email_user"));
                idVO idVO = new idVO(rs.getInt("id_user"), rs.getInt("id_login"));
            }
            
            
        } catch (SQLException ex) {
            throw new SQLException("Erro ao buscar o usuario! " + ex.getMessage());
        }
    }
}
