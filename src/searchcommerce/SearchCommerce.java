/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchcommerce;

import dao.LoginDAO;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.loginVO;
import services.loginServices;

/**
 *
 * @author Thiago Quevedo
 */
public class SearchCommerce {

    public static boolean userLogin = false;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            loginVO lVO = new loginVO();
            
            System.out.println("usuario");
            lVO.setUsuario(scan.nextLine());
            System.out.println("senha");
            lVO.setSenha(scan.nextLine());
            
            System.out.println(lVO.getUsuario());
            System.out.println(lVO.getSenha());
            scan.nextLine();
        } catch (Exception ex) {
            Logger.getLogger(SearchCommerce.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
