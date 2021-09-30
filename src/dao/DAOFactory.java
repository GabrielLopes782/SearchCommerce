/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import cryptography.Encryptions;
import model.loginVO;

/**
 *
 * @author Thiago Quevedo
 */
public class DAOFactory {

    private static final LoginDAO loginDAO = new LoginDAO();
    private static final cryptography.Encryptions encrypt = new Encryptions();
    private static final UsuarioDAO usuarioDAO = new UsuarioDAO();

    public static LoginDAO getLoginDAO() {
        return loginDAO;
    }

    public static Encryptions getEncrypt() {
        return encrypt;
    }

    public static UsuarioDAO getUsuarioDAO() {
        return usuarioDAO;
    }
}
