/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilharubronegra;

/**
 *
 * @author yurih
 */
public class PilhaRubroNegra {

    /**
     * @param args the command line arguments
     * @throws pilharubronegra.EPilhaCheia
     * @throws pilharubronegra.EPilhaVazia
     */
    public static void main(String[] args) throws EPilhaCheia, EPilhaVazia {
       
        Pilha p = new Pilha(10);
        
        System.out.println("Adicionando...");
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                p.pushVermelha(i);
            } else {
                p.pushPreta(i);
            }
        }
        
        p.show();
        
        System.out.println("Removendo...");
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println(p.popVermelha());
            } else {
                System.out.println(p.popPreta());
            }
        }
        
        System.out.println("Exibindo...");
        p.show();
       
    }

}
