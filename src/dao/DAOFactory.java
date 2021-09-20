/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.loginVO;

/**
 *
 * @author Thiago Quevedo
 */
public class DAOFactory {
    private static final LoginDAO loginDAO = new LoginDAO();
    
    public static LoginDAO getLoginDAO(){
        return loginDAO;
    }
}
