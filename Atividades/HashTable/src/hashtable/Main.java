/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashtable;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author yuri
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        HashTable teste = new HashTable(13);

        try {
            teste.insertValue(20, "Ross");
            teste.insertValue(43, "Mônica");
            teste.insertValue(25, "Chandler");
            teste.insertValue(45, "Joey");
            teste.insertValue(59, "Rachel");
            teste.insertValue(30, "Phoebe");
            teste.insertValue(12, "Other");
            teste.insertValue(93, "Another");
        } catch (FullTableException e) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, e);
        }

        System.out.println(teste);
    }

}
