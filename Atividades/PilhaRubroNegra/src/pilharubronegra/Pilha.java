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
public class Pilha implements IPilha {

    private Object Elementos[];
    //private Object ElementosPreta[];
    //private Object ElementosVermelha[];

    private int indexTotal = -1;
    private int indexVermelha = -1;
    private int indexPreta;
    private int tamanho;

    public Pilha(int tamanho) {
        Elementos = new Object[tamanho];
        this.tamanho = tamanho;
        this.indexPreta = tamanho;
    }

    @Override
    public int totalSize() {
        return (indexTotal + 1);
    }

    @Override
    public int vermelhaSize() {
        return (indexVermelha + 1);
    }

    @Override
    public int pretaSize() {
        return (tamanho - indexPreta);
    }

    @Override
    public boolean isEmpty() {
        return (indexTotal == -1);
    }

    @Override
    public Object topPreta() throws EPilhaVazia {
        if (isEmpty()) {
            throw new EPilhaVazia("Pilha está vazia");
        } else {
            return Elementos[indexPreta];
        }
    }

    @Override
    public Object topVermelha() throws EPilhaVazia {
        if (isEmpty()) {
            throw new EPilhaVazia("Pilha está vazia");
        } else {
            return Elementos[indexVermelha];
        }
    }

    @Override
    public void pushPreta(Object obj) throws EPilhaCheia {
        if ((indexTotal == tamanho - 1) || (indexPreta == indexVermelha + 1)) {
            throw new EPilhaCheia("Pilha está cheia!");
        }

        Elementos[--indexPreta] = obj;
        indexTotal++;
    }

    @Override
    public void pushVermelha(Object obj) throws EPilhaCheia {
        if ((indexTotal == tamanho - 1) || (indexPreta == indexVermelha + 1)) {
            throw new EPilhaCheia("Pilha está cheia!");
        }

        Elementos[++indexVermelha] = obj;
        indexTotal++;
    }

    @Override
    public Object popPreta() throws EPilhaVazia {
        if (isEmpty() || (indexPreta == tamanho)) {
            throw new EPilhaVazia("Pilha está vazia!");
        }
        
        Object temp = Elementos[indexPreta];
        Elementos[indexPreta] = null;
        indexPreta++;
        return temp;
    }

    @Override
    public Object popVermelha() throws EPilhaVazia {
        if (isEmpty() || (indexVermelha == -1)) {
            throw new EPilhaVazia("Pilha está vazia!");
        }
        
        Object temp = Elementos[indexVermelha];
        Elementos[indexVermelha] = null;
        indexVermelha--;
        return temp;
    }
    
    public void empty() {
        Elementos = null;
        indexTotal = -1;
        indexVermelha = -1;
        indexPreta = tamanho - 1;
    }
    
    public boolean isNull() {
        for (Object o : Elementos) {
            if (o != null) {
                return false;
            }
        }
        
        this.empty();
        return true;
    }
    
    public void show() throws EPilhaVazia {
        if (isEmpty() || isNull()) {
            throw new EPilhaVazia("Pilha está Vazia!");
        } else {
            for (Object o : Elementos) {
                System.out.println(o);
            }
        }
    }

    /*
    public void showPreta() throws EPilhaVazia {
        if (isEmpty()) {
            throw new EPilhaVazia("Pilha está Vazia!");
        } else {
            for (Object o : ElementosPreta) {
                System.out.println(o);
            }
        }
    }
    
    public void showVermelha() throws EPilhaVazia {
        if (isEmpty()) {
            throw new EPilhaVazia("Pilha está Vazia!");
        } else {
            for (Object o : ElementosVermelha) {
                System.out.println(o);
            }
        }
    }
     */
}
