/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package message.encryption.decryption.app;

/**
 *
 * @author Ahmed Shoeb
 */
public interface Strategy {

    public String DoOperation(String msg)
            throws Exception;
    
}
