/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptography;

import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

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

    public void criptografaHash(String hash) {

        try {
            KeyGenerator gerador = KeyGenerator.getInstance("DES");
            SecretKey chaveDES = gerador.generateKey();
            Cipher desCipher;

            //Criação do cipher que conterá os objetos de criptografia
            desCipher = Cipher.getInstance("DES/ECB/PKCS5Padding");

            // Iniciando cipher para criptografia
            desCipher.init(Cipher.ENCRYPT_MODE, chaveDES);

            // Excriptando os dados
            byte[] hashCriptografado = desCipher.doFinal(hash.getBytes());
            System.out.println(new String(hashCriptografado));
            
            
            desCipher.init(Cipher.DECRYPT_MODE, chaveDES);
            // Texto a ser descriptografado
            byte[] textoDescriptografado = desCipher.doFinal(hashCriptografado);
            System.out.println(textoDescriptografado);

        } catch (InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
