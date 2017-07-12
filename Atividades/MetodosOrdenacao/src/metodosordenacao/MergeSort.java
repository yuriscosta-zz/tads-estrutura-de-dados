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
public class MergeSort {

    private int lista[];
    private int aux[];

    public void sort(int lista[]) {
        this.lista = lista;
        int tamanho = lista.length;
        this.aux = new int[tamanho];
        mergeSort(0, tamanho - 1);
    }

    public void mergeSort(int inicio, int fim) {

        if (inicio < fim) {
            int meio = inicio + (fim - inicio) / 2;
            mergeSort(inicio, meio);
            mergeSort(meio + 1, fim);
            merge(inicio, meio, fim);
        }
    }

    private void merge(int inicio, int meio, int fim) {

        for (int i = inicio; i <= fim; i++) {
            aux[i] = lista[i];
        }

        int i = inicio;
        int j = meio + 1;
        int k = inicio;

        while (i <= meio && j <= fim) {
            if (aux[i] <= aux[j]) {
                lista[k] = aux[i];
                i++;
            } else {
                lista[k] = aux[j];
                j++;
            }
            k++;
        }

        while (i <= meio) {
            lista[k] = aux[i];
            k++;
            i++;
        }

    }

}
