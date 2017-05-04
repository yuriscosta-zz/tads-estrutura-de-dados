/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deque;

/**
 *
 * @author yurih
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws deque.EDequeVazio
     */
    public static void main(String[] args) throws EDequeVazio {
        Deque deque = new Deque(5, 1);
        for (int i = 0; i < 4; i++) {
            if (i % 2 == 0) {
                deque.inserirInicio(i);
            } else {
                deque.inserirFim(i);
            }
            
            //deque.exibirDeque();
        }
        
        deque.exibirDeque();
        
        for (int i = 0; i < 4; i++) {
            if (i % 2 == 0) {
                System.out.println(deque.removerInicio());
            } else {
                System.out.println(deque.removerFim());
            }
            
            //deque.exibirDeque();
        }
        
        deque.exibirDeque();
    }

}
