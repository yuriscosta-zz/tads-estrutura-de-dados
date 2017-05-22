/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sequencia;

/**
 *
 * @author yurih
 */
public class No {

    private Object element;
    private No before;
    private No after;

    public No() {
    }
    
    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public No getBefore() {
        return before;
    }

    public void setBefore(No before) {
        this.before = before;
    }

    public No getAfter() {
        return after;
    }

    public void setAfter(No after) {
        this.after = after;
    }
    
}
