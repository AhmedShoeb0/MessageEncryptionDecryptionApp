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
public class Context {
    private Strategy strategy;
    
    public Context(Strategy strategy){
      this.strategy = strategy;
   }
    
    public String executeStrategy(String msg) throws Exception{
        
    return strategy.DoOperation(msg);
    }
    
}
