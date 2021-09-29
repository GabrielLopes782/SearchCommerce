/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

/**
 *
 * @author Thiago Quevedo
 */
public class ServicesFactory {
    private static final loginServices loginServices = new loginServices();  
    private static final usuarioServices userServices = new usuarioServices();
    
    public static loginServices getLoginServices(){
        return loginServices;
    }
    
    public static usuarioServices getUserServices(){
        return userServices;
    }
}
