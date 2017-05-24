/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sequencia;

import javax.smartcardio.ATR;

/**
 *
 * @author yurih
 */
public class Main {

    public static void main(String[] args) throws ESequenciaVazia {
        No no1 = new No();
        No no2 = new No();
        No no3 = new No();
        
        no1.setElement(1);
        no2.setElement(2);
        no3.setElement(3);
        
        no1.setAfter(no2);
        no1.setBefore(null);

        no2.setAfter(no3);
        no2.setBefore(no1);
        
        no3.setAfter(null);
        no3.setBefore(no2);
        
        Sequencia seq = new Sequencia();
        
        seq.insertFirst(no1);
        seq.insertLast(no3);
        
        No no4 = new No();
        no4.setElement(4);
        seq.insertAfter(no2, no4);
        
        No no5 = new No();
        no5.setElement(5);
        seq.insertBefore(no4, no5);
        
        No no6 = new No();
        no6.setElement(6);
        seq.insertAfter(no1, no6);
        
        No no7 = new No();
        no7.setElement(7);
        seq.insertBefore(no3, no7);
        
        No no8 = new No();
        no8.setElement(8);
        seq.insertBefore(no1, no8);
        
        No no9 = new No();
        no9.setElement(9);
        seq.insertAfter(no3, no9);       
        
        /*No cont = seq.first();
        while(cont != null) {
            System.out.println(cont.getElement());
            cont = cont.getAfter();
        }*/
        
        System.out.println("---------------------");
        
        seq.remove(no3);
        seq.remove(seq.first());
        seq.remove(no9);
        
        No cont = seq.first();
        while(cont != null) {
            System.out.println(cont.getElement());
            cont = cont.getAfter();
        }
        
        System.out.println("---------------------");
        
         /*System.out.println(seq.rankOf(no1));
         System.out.println(seq.rankOf(no6));
         System.out.println(seq.rankOf(no2));
         System.out.println(seq.rankOf(no5));
         System.out.println(seq.rankOf(no4));
         System.out.println(seq.rankOf(no7));*/
         
         for (int i = 0; i < seq.size(); i++) {
             System.out.println(seq.atRank(i).getElement());
         }
         
    }

}
