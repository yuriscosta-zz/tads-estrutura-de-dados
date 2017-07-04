/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashtable;

import java.util.Iterator;
import java.util.Vector;

/**
 *
 * @author yuri
 */
public class HashTable implements IHashTable {

    private int size;
    private Item hashTable[];

    public HashTable(int length) {
        this.size = 0;
        hashTable = new Item[length];
    }

    private int hash(Object key) {
        int code = key.hashCode();
        return code % hashTable.length;
    }

    @Override
    public Object findValue(Object key) throws NoSuchKeyException {
        return hashTable[findIndex(key)].getValue();
    }

    public int findIndex(Object key) throws NoSuchKeyException {
        Item item;
        int index = hash(key);
        int count = 0;

        while (count != hashTable.length) {
            item = hashTable[index];
            if (item == null) {
                throw new NoSuchKeyException();
            } else if (item.getKey() == key) {
                return index;
            } else {
                index = (index + 1) % hashTable.length;
                count++;
            }
        }

        throw new NoSuchKeyException();
    }

    @Override
    public void insertValue(Object key, Object obj) throws FullTableException {
        if (size == hashTable.length) {
            throw new FullTableException();
        }

        int index = hash(key);

        while (hashTable[index] != null && hashTable[index].getClass() != ItemAvailable.class) {
            index = (index + 1) % hashTable.length;
        }

        hashTable[index] = new Item(key, obj);
        size++;
    }

    @Override
    public Object removeValue(Object key) throws NoSuchKeyException {
        int index = findIndex(key);
        Object obj_aux = hashTable[index].getValue();
        hashTable[index] = new ItemAvailable();
        size--;
        return obj_aux;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return (size == 0);
    }

    @Override
    public Iterator keys() {
        Vector keys = new Vector();
        for (int i = 0; i < hashTable.length; i++) {
            if (hashTable[i] != null) {
                keys.add(hashTable[i].getKey());
            }
        }

        return keys.iterator();
    }

    @Override
    public Iterator values() {
        Vector values = new Vector();
        for (int i = 0; i < hashTable.length; i++) {
            if (hashTable[i] != null) {
                values.add(hashTable[i].getValue());
            }
        }

        return values.iterator();
    }

    @Override
    public String toString() {
        String hash = "";

        for (int i = 0; i < hashTable.length; i++) {
            if (hashTable[i] == null || hashTable[i].getClass() == ItemAvailable.class) {
                hash += "-- | ";
            } else {
                hash += hashTable[i].getKey() + " | ";
            }
        }

        return hash.substring(0, hash.length() - 3);
    }
}
