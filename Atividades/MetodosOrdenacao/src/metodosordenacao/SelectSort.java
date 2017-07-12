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
public class SelectSort {

    public static void selectSort(int lista[]) {

        int tamanho = lista.length - 2;
        for (int i = 0; i <= tamanho; i++) {
            for (int j = i + 1; j <= tamanho + 1; j++) {
                if (lista[j] < lista[i]) {
                    int aux = lista[j];
                    lista[j] = lista[i];
                    lista[i] = aux;
                }
            }
        }
    }

}
