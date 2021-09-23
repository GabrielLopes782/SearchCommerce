/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import services.loginServices;


/**
 *
 * @author Thiago Quevedo
 */

public class loginVO {
    private final loginServices encrypt = services.ServicesFactory.getLoginServices();
    private String usuario, senha;
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) throws Exception {
        this.usuario = encrypt.geraHash(usuario.toLowerCase());
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) throws Exception {
        this.senha = encrypt.geraHash(senha);
    }
}