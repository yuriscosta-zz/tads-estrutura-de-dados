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
public interface IArvore {
    
    /* Metodos Genéricos */
    public int size();

    //public int heigth(No no);

    public boolean isEmpty();

    public void elements();

    public void nos();

    /* Métodos de Acesso */
    public No root();

    public No parent(No no);

    //public void children(No no);

    /* Métodos de Consulta */
    public boolean isInternal(No no);

    public boolean isExternal(No no);

    public boolean isRoot(No no);

    public int depth(No no);

    /* Método de atualização */
    public Object replace(No no, Object obj);

}
