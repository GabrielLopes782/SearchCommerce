/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Thiago Quevedo
 */
public class idVO {
    private static int idUsuario, idLogin;

    public static int getIdUsuario() {
        return idUsuario;
    }

    public static void setIdUsuario(int idUsuario) {
        idVO.idUsuario = idUsuario;
    }

    public static int getIdLogin() {
        return idLogin;
    }

    public static void setIdLogin(int idLogin) {
        idVO.idLogin = idLogin;
    }
    
    public idVO(int idUsuario, int idLogin) {
        idVO.idUsuario = idUsuario;
        idVO.idLogin = idLogin;
    }
    
    public idVO() {
    }
    
    
}
