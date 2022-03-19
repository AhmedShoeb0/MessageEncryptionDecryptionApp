/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package message.encryption.decryption.app;
import java.security.*;
import javax.crypto.*;
import javax.crypto.spec.*;
import sun.misc.BASE64Decoder;
/**
 *
 * @author Ahmed Shoeb
 */
public class Decoding_State implements Strategy {
    public static String algo="AES";
    public static byte[] KeyValue;
    
    
    
    public Decoding_State(byte key[]){
        KeyValue=key;
    }

    public static Key GenerateKey()throws Exception{
    Key key= new SecretKeySpec(KeyValue,algo);
    return key;
    }
    
    @Override
    public String DoOperation(String msg) throws Exception {
    Key key= GenerateKey();
    Cipher c=Cipher.getInstance(algo);
    c.init(Cipher.DECRYPT_MODE,key);
    byte[] DecodedVal= new BASE64Decoder().decodeBuffer(msg);
    byte[] DecVal=c.doFinal(DecodedVal);
    String decryptedValue=new String(DecVal);
    return decryptedValue;
    }
}
