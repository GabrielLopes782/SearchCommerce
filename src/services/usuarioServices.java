/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.UsuarioDAO;
import java.sql.SQLException;
import model.usuarioVO;

/**
 *
 * @author Thiago Quevedo
 */
public class usuarioServices {
    private UsuarioDAO uDAO = dao.DAOFactory.getUsuarioDAO();
    
    public void cadastraUsuario (usuarioVO uVO) throws SQLException{
        uDAO.cadastraUsuario(uVO);
    }
    
    public void buscaUsuario (int idLogin) throws SQLException{
        uDAO.buscaUsuario(idLogin);
    }
}
