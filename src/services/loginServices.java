/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import cryptography.Encryptions;
import dao.LoginDAO;
import java.sql.SQLException;
import model.loginVO;

/**
 *
 * @author Thiago Quevedo
 */
public class loginServices {
    private LoginDAO cDAO = dao.DAOFactory.getLoginDAO();
    private Encryptions encrypt = dao.DAOFactory.getEncrypt();
    
    public void cadastraUsuario (loginVO lVO) throws SQLException{
         cDAO.cadastrarUsuario(lVO);
    }
    
    public void verificaUsuario (loginVO lVO) throws SQLException{
        cDAO.verificaLogin(lVO);
    }
    
    public String geraHash(String dado) throws Exception{
        return encrypt.geraHash(dado);
    }
    
    public void criptografaHash(String dado){
        encrypt.criptografaHash(dado);
    }
}
