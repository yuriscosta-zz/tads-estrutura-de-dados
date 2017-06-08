/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvore;

/**
 *
 * @author yuri
 */
public class No {

    private Object element;
    private No parent;
    private No leftSon;
    private No rightSon;
    private Object children[];

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public No getLeftSon() {
        return leftSon;
    }

    public void setLeftSon(No leftSon) {
        this.leftSon = leftSon;
        this.children[0] = this.getLeftSon();
        leftSon.setParent(this);
    }

    public No getRightSon() {
        return rightSon;
    }

    public void setRightSon(No rightSon) {
        this.rightSon = rightSon;
        this.children[1] = this.getRightSon();
        rightSon.setParent(this);
    }

    public No getParent() {
        return parent;
    }

    public void setParent(No parent) {
        this.parent = parent;
    }

    public Object getChildren() {
        return children;
    }

}
