package com.andersen;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.*;

public class MyArrayListTest {
    MyArrayList<Integer> myArrayList;

    @Before
    public void setUp(){
        myArrayList = new MyArrayList<>();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);
        myArrayList.add(5);
        myArrayList.add(6);
        myArrayList.add(7);
    }


    @Test
    public void size() throws Exception {

    }

    @Test
    public void isEmpty() throws Exception {
    }

    @Test
    public void contains() throws Exception {
    }

    @Test
    public void add() throws Exception {
    }

    @Test
    public void remove() throws Exception {
    }

    @Test
    public void clear() throws Exception {
    }

    @Test
    public void get() throws Exception {
    }

}