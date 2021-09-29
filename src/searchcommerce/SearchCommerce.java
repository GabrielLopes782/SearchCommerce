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
    public static boolean userLogin = false;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            Scanner ler = new Scanner(System.in);
            loginVO mL = new loginVO();
            loginServices logS = services.ServicesFactory.getLoginServices();
            System.out.println("------LOGIN------");
            System.out.println("Usuário: ");
            mL.setUsuario(ler.nextLine());
            System.out.println("Senha: ");
            mL.setSenha(ler.nextLine());
            logS.verificaSenha(mL.getSenha());
//            logS.verificaUsuario(mL);
//            if(userLogin){
//                System.out.println("Deu certo");
//                System.out.println(mL.getUsuario());
//                System.out.println(mL.getSenha());
//            } else {
//                System.out.println("Deu errado");
//            }
//            logS.cadastraLogin(mL);


        } catch (Exception ex) {
            Logger.getLogger(SearchCommerce.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
