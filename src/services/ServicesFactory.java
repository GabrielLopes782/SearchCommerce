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
    
    
    public static loginServices getLoginServices(){
        return loginServices;
    }
}
