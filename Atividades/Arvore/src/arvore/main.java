/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvore;

/**
 *
 * @author yuri
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        No root = new No();
        root.setElement(10);
        
        No s1 = new No();        
        s1.setElement(5);
        
        No s2 = new No();
        s2.setElement(15);
        
        No s11 = new No();
        s11.setElement(4);
        
        No s12 = new No();
        s12.setElement(9);
        
        No s21 = new No();
        s21.setElement(11);
        
        No s22 = new No();
        s22.setElement(20);
        
        root.setLeftSon(s1);
        root.setRightSon(s2);
        
        s1.setLeftSon(s11);
        s1.setRightSon(s12);
        
        s2.setLeftSon(s21);
        s2.setRightSon(s22);
        
        Arvore tree = new Arvore();        
        tree.setRoot(root);
        
        
        System.out.println("");
        
    }

}
