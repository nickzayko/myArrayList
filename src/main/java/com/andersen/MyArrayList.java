package com.andersen;

import java.util.Collection;
import java.util.Iterator;


public class MyArrayList<E extends Integer> implements Collection,Iterable {
    private int beginArraySize = 3;
     Object[] array;

    public MyArrayList() {
        this.array = new Object[beginArraySize];
    }

    @Override
    public int size() {
        int i = 0;
        while (array[i] != null){
            i++;
        }
        return i;
    }

    @Override
    public boolean isEmpty() {
        for (int i = 0; i < size(); i++){
            if (array[i] != null){
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean contains(Object o) {
        if (o !=null){
            for (int i = 0; i < size(); i++){
                if (array[i].equals(o)){
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        int i = 0;
        if (!isEmpty() && array[size()-1]!=null){
            increaseArraySize();
        }
        while (array[i] != null) {
            i++;
        }
        array[i] =  o;
        return true;
    }

    private void increaseArraySize() {
        beginArraySize = beginArraySize*3/2+1;
        Object[] increasedArray =  new Object[beginArraySize];
        for (int i = 0; i < size(); i++){
            increasedArray[i] = array[i];
        }
        array = increasedArray;
    }

    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < size(); i++){
            if (array[i].equals(o)){
                array[i]=null;
                do {
                    array[i]=array[i+1];
                    i++;
                }while (array[i]!=null);
                return true;
            }
        }
        return false;
    }

    @Override
    public void clear() {
        for (int i=0; i<size();i++){
            array[i]=null;
        }
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }


    public Object get(int i) {
        return array[i];
    }

    //    надо что-то менять!!!
    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }
}
