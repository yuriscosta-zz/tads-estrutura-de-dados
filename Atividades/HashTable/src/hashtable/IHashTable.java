/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashtable;

import java.util.Iterator;

/**
 *
 * @author yuri
 */
public interface IHashTable {

    public Object findValue(Object key) throws NoSuchKeyException;

    public void insertValue(Object key, Object obj) throws FullTableException;

    public Object removeValue(Object key) throws NoSuchKeyException;

    public int size();

    public boolean isEmpty();

    public Iterator keys();

    public Iterator values();

}
