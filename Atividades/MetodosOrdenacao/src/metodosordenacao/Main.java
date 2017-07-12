/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosordenacao;

import static metodosordenacao.BubbleSort.bubbleSort;
import static metodosordenacao.InsertSort.insertSort;
import static metodosordenacao.QuickSort.sort;
import static metodosordenacao.SelectSort.selectSort;

/**
 *
 * @author yuri
 */
public class Main {

    public static void toString(int lista[]) {
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {

        int lista[] = {1, 34, 6, 9, 46, 3, 7, 9};
        int aux[] = lista.clone();

        /*System.out.println("Bubble Sort");
        bubbleSort(lista);
        toString(lista);

        lista = aux.clone();
        
        System.out.println("Select Sort");
        selectSort(lista);
        toString(lista);
        
        lista = aux.clone();
        
        System.out.println("Insert Sort");
        insertSort(lista);
        toString(lista);
        
        lista = aux.clone();
        
        System.out.println("Merge Sort");
        MergeSort merge = new MergeSort();
        merge.sort(lista);
        toString(lista);
        
        lista = aux.clone();*/
        
        System.out.println("Quick Sort");
        sort(lista);
        toString(lista);
        
    }

}
