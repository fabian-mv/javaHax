package org.tec.datastructures.test;

import org.junit.Assert;
import org.junit.Test;
import org.tec.datastructures.linkedList.LinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * This class test the methods of the linked list.
 * @version 0.0.1
 * @autor Alejandro D.P <aleklnx>
 */
public class TestLinkedList {

    /**
     * This method test the insertion of values at start of list.
     */
    @Test
    public void testInsertTop(){
        LinkedList<Integer> list = new LinkedList<>();
        assertEquals(0, list.getSize());

        list.addOnTop(23);

        //The list has one element after insertion.
        assertEquals(1, list.getSize());

        //Should print "Data not added: The value already exists."
        list.addOnTop(23);
        list.addOnTop(56);
        list.addOnTop(78);
        list.addOnTop(9);
        assertEquals(4, list.getSize());

        list.addOnTop(9);
        list.addOnTop(78);

        //The elements inserted can be obtained.
        assertEquals(new Integer(23), list.searchByValue(23).getValue());
        assertEquals(new Integer(56), list.searchByValue(56).getValue());

    }

    /**
     * This method test the insertion of values at final of list.
     */
    @Test
    public void testInsertBottom(){
        LinkedList<Integer> list = new LinkedList<>();

        list.addOnBottom(23);
        assertEquals(1, list.getSize());

        //Should print "Data not added: The value already exists."
        list.addOnBottom(23);
        list.addOnBottom(56);
        list.addOnBottom(78);
        list.addOnBottom(9);

        //The list has the correct amount of elements after insertions.
        assertEquals(5, list.getSize());

        //The elements inserted can be obtained.
        assertEquals(new Integer(23), list.searchByValue(23).getValue());
        assertEquals(new Integer(56), list.searchByValue(56).getValue());

    }

    /**
     * This test the insertion in some position of the list.
     */
    @Test
    public void testInsertByKey(){
        LinkedList<Integer> list = new LinkedList<>();

        //Should print "List is empty".
        list.addOnPos(95, 3);

        for(int i=0; i<10; i++) list.addOnPos(i, i);

        list.addOnPos(45, 5);

        assertEquals(12, list.getSize());
        assertEquals(new Integer(45), list.searchByValue(45).getValue());


    }

    /**
     * This test the delete method and some variations.
     * Delete by index.
     * Delete by value.
     * Delete all.
     */
    @Test
    public void testDelete(){
        LinkedList<Integer> list = new LinkedList<>();

        for(int i=0; i<10; i++) list.add(i);

        list.deleteByIndex(5);
        Assert.assertNull(list.searchByValue(5));

        list.deleteByIndex(11);

        assertEquals(9, list.getSize());

        list.deleteByValue(9);
        Assert.assertNull(list.searchByValue(9));

        assertEquals(8, list.getSize());

        list.deleteAll();
        assertEquals(0, list.getSize());

    }

    /**
     * This test the search method of the list and some variations.
     * Search by value.
     * Search by index
     */
    @Test
    public void testSearch(){
        LinkedList<Integer> list = new LinkedList<>();

        for(int i=0; i<=10; i++) list.add(i);

        assertEquals(new Integer(5), list.searchByValue(5).getValue());
        assertEquals(new Integer(7), list.searchByValue(7).getValue());
        assertEquals(new Integer(10), list.searchByValue(10).getValue());
        assertEquals(new Integer(0), list.searchByValue(0).getValue());

        assertEquals(11, list.getSize());

        Assert.assertNull(list.searchByValue(90));

        assertEquals(new Integer(5), list.searchByIndex(5).getValue());
        assertEquals(new Integer(7), list.searchByIndex(7).getValue());
        assertEquals(new Integer(10), list.searchByIndex(10).getValue());
        assertEquals(new Integer(0), list.searchByIndex(0).getValue());

        assertEquals(11, list.getSize());
    }

    /**
     * This test update method of the list.
     */
    @Test
    public void testUpdate(){
        LinkedList<Integer> list = new LinkedList<>();

        for(int i=0; i<=10; i++) list.add(i);

        assertEquals(new Integer(4), list.searchByIndex(4).getValue());

        list.changeValueFor(4, 65);

        assertEquals(new Integer(65), list.searchByIndex(4).getValue());

        assertEquals(new Integer(7), list.searchByValue(7).getValue());

        list.changeValueOf(7, 54);

        assertEquals(new Integer(54), list.searchByValue(54).getValue());
    }

}
