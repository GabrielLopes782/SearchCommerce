/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Thiago Quevedo
 */
public class Conexao {

    private static String URL = "jdbc:mysql://db4free.net:3306/searchcommerce";
    private static String USUARIO = "quevedo";
    private static String SENHA = "|v~@#{4lr<6P";

    public static Connection getConexao() throws SQLException {

        Connection c = null;

        try {
            c = DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (SQLException e) {
            throw new SQLException("Erro ao conectar!" + e.getMessage());
        }

        return c;
    }
}
