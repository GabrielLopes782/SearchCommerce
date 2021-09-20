/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchcommerce;

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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Scanner ler = new Scanner(System.in);
            loginVO mL = new loginVO();
            loginServices logS = services.ServicesFactory.getLoginServices();
            mL.setUsuario(ler.nextLine());
            mL.setSenha(ler.nextLine());
            System.out.println(mL.getUsuario());
            System.out.println(mL.getSenha());
            logS.cadastraUsuario(mL);
            
        } catch (Exception ex) {
            Logger.getLogger(SearchCommerce.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
