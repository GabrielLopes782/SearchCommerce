/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.LoginDAO;
import java.sql.SQLException;
import model.loginVO;

/**
 *
 * @author Thiago Quevedo
 */
public class loginServices {
    public static LoginDAO cDAO = dao.DAOFactory.getLoginDAO();
    
    public void cadastraUsuario (loginVO lVO) throws SQLException{
         cDAO.cadastrarUsuario(lVO);
    }
}
