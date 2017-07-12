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
public class BubbleSort {

    public static void bubbleSort(int lista[]) {

        int tamanho = lista.length - 2;

        for (int i = 0; i <= tamanho; i++) {
            for (int j = 0; j <= tamanho - i; j++) {
                if (lista[j] > lista[j + 1]) {
                    int aux = lista[j];
                    lista[j] = lista[j + 1];
                    lista[j + 1] = aux;
                }
            }
        }

    }

}
