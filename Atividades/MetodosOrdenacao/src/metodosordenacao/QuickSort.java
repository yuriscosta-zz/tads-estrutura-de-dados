/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosordenacao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 *
 * @author yuri
 */
public class QuickSort {

    public static void sort(int lista[]) {
        Random random = new Random();
        int indice = random.nextInt(lista.length) ;
        lista = partition(lista, indice);
    }

    private static int[] toArray(List<Integer> l, List<Integer> e, List<Integer> g, int array[]) {
        int cont = 0;
        for (Integer i : l) {
            array[cont] = i;
            cont++;
        }
        for (Integer i : e) {
            array[cont] = i;
            cont++;
        }
        for (Integer i : g) {
            array[cont] = i;
            cont++;
        }

        return array;
    }

    private static int[] partition(int lista[], int indice) {
        ArrayList<Integer> lista_aux = new ArrayList<>();
        for (int i = 0; i < lista.length; i++) {
            lista_aux.add(lista[i]);
        }

        ArrayList<Integer> l = new ArrayList<>();
        ArrayList<Integer> e = new ArrayList<>();
        ArrayList<Integer> g = new ArrayList<>();
        int pivo = lista_aux.remove(indice);
        
        while (!lista_aux.isEmpty()) {
            int y = lista_aux.remove(0);
            if (y < pivo) {
                l.add(y);
            } else {
                if (y > pivo) {
                    g.add(y);
                } else {
                    e.add(y);
                }
            }
        }
        
        lista = toArray(l, e, g, lista);
        return lista;
    }

}
