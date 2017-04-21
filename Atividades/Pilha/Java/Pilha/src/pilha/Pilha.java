/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilha;

/**
 *
 * @author yurih
 */
public class Pilha {

    /**
     * @param args the command line arguments
     * @throws pilha.EPilhaVazia
     */
    public static void main(String[] args) throws EPilhaVazia {
        PilhaArray p1 = new PilhaArray(10, 0);
        PilhaArray p2 = new PilhaArray(6, 0);

        for (int i = 0; i < 6; i++) {
            p1.push(i);
            p2.push(i * 10);
        }
        
        System.out.println("Elementos da Pilha 1:");
        p1.show();
        
        System.out.println("Elementos da Pilha 2:");
        p2.show();
       
        p1.adicionaPilha(p2);
        
        System.out.println("Elementos da Pilha 1:");
        p1.show();
    }
}
