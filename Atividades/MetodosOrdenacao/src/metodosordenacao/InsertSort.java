/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosordenacao;

/**
 *
 * @author yuri
 */
public class InsertSort {
    
    public static void insertSort(int lista[]) {
        
        int tamanho = lista.length - 1;   
        for (int i = 1; i <= tamanho; i++) {
            int aux = lista[i]; 
            int j = i - 1;
            while (j >= 0 && aux < lista[j]) {
                lista[j+1] = lista[j];
                --j;
                lista[j+1] = aux;
            }
            
        }
                
    }
    
}
