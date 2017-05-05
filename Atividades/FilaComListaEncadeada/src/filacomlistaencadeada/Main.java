/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filacomlistaencadeada;

/**
 *
 * @author yurih
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws EFilaVazia {
        Fila fila = new Fila();
        fila.inserir(1);
        fila.inserir(2);
        fila.inserir(3);
        
        fila.exibir();
        
        System.out.println("Elemento removido: " + fila.remover());
        fila.exibir();
        
        System.out.println("Elemento removido: " + fila.remover());
        fila.exibir();
          
        System.out.println("Elemento removido: " + fila.remover());
        fila.exibir();       
    }
}
