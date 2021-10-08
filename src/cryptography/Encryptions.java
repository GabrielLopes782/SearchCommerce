/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptography;

import java.security.MessageDigest;


/**
 *
 * @author Thiago Quevedo
 */
public class Encryptions {
    
    public String geraHash (String dado) throws Exception{
        return this.hash2(this.hash1(dado));
    }

    public String hash1(String dado) throws Exception {
        MessageDigest algorithm = MessageDigest.getInstance("SHA-256");
        byte hash[] = algorithm.digest(dado.getBytes("UTF-8"));

        StringBuilder texto = new StringBuilder();
        for (byte b : hash) {
            texto.append(String.format("%02X", 0xFF & b));
        }
        return texto.toString();
    }
    
    public String hash2(String dado) throws Exception {
        MessageDigest algorithm = MessageDigest.getInstance("MD5");
        byte hash[] = algorithm.digest(dado.getBytes("UTF-8"));

        StringBuilder texto = new StringBuilder();
        for (byte b : hash) {
            texto.append(String.format("%02X", 0xFF & b));
        }
        return texto.toString();
    }

    
}
