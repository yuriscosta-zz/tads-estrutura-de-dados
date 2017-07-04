/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashtable;

/**
 *
 * @author yuri
 */
class NoSuchKeyException extends Exception {
    
    public NoSuchKeyException() {
        super();
    }
    
    public NoSuchKeyException(String message) {
        super(message);
    }
    
}
