/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchcommerce;

import java.awt.Dimension;
import java.awt.Toolkit;
import view.JfLogin;

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
        JfLogin login = new JfLogin();
        login.setVisible(true);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        login.setBounds((screenSize.width / 2 - 500 / 2), (screenSize.height / 2 - 500 / 2), 500, 500);
        
    }
}
