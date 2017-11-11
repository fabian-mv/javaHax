package org.tec.datastructures.test;

import org.junit.Assert;
import org.tec.datastructures.doublyLinkedCircularList.DoublyLinkedCircularList;
import org.junit.Test;

/**
 * This class test the methods of the linked circular list.
 * @version 0.0.1
 * @author Alejandro D.P <aleklnx>
 */
public class TestDoublyLinkedCircularList {

    /**
     * This method test the insertion of values at start of list.
     */
    @Test
    public void testInsertTop(){
        DoublyLinkedCircularList<Integer> list = new DoublyLinkedCircularList<>();
        Assert.assertEquals(0, list.getSize());

        list.addOnTop(23);

        //The list has one element after insertion.
        Assert.assertEquals(1, list.getSize());

        list.addOnTop(23);
        list.addOnTop(56);
        list.addOnTop(78);
        list.addOnTop(9);
        Assert.assertEquals(4, list.getSize());

        list.addOnTop(9);
        list.addOnTop(78);

        //The elements inserted can be obtained.
        Assert.assertEquals(new Integer(23), list.searchByValue(23).getValue());
        Assert.assertEquals(new Integer(56), list.searchByValue(56).getValue());

    }

    /**
     * This method test the insertion of values at final of list.
     */
    @Test
    public void testInsertBottom(){
        DoublyLinkedCircularList<Integer> list = new DoublyLinkedCircularList<>();

        list.addOnBottom(23);
        Assert.assertEquals(1, list.getSize());

        list.addOnBottom(23);
        list.addOnBottom(56);
        list.addOnBottom(78);
        list.addOnBottom(9);

        //The list has the correct amount of elements after insertions.
        Assert.assertEquals(5, list.getSize());

        //The elements inserted can be obtained.
        Assert.assertEquals(new Integer(23), list.searchByValue(23).getValue());
        Assert.assertEquals(new Integer(56), list.searchByValue(56).getValue());

    }

    /**
     * This test the insertion in some position of the list.
     */
    @Test
    public void testInsertByKey(){
        DoublyLinkedCircularList<Integer> list = new DoublyLinkedCircularList<>();

        //Should print "List is empty".
        list.addOnPos(95, 3);

        for(int i=0; i<10; i++) list.addOnPos(i, i);

        list.addOnPos(45, 5);

        list.print();

        Assert.assertEquals(12, list.getSize());
        Assert.assertEquals(new Integer(45), list.searchByValue(45).getValue());


    }

    /**
     * This test the delete method and some variations.
     * Delete by index.
     * Delete by value.
     * Delete all.
     */
    @Test
    public void testDelete(){
        DoublyLinkedCircularList<Integer> list = new DoublyLinkedCircularList<>();

        for(int i=0; i<10; i++) list.add(i);

        list.deleteByIndex(5);
        Assert.assertNull(list.searchByValue(5));

        list.deleteByIndex(11);

        Assert.assertEquals(9, list.getSize());

        list.deleteByValue(9);
        Assert.assertNull(list.searchByValue(9));

        Assert.assertEquals(8, list.getSize());

        list.deleteAll();
        Assert.assertEquals(0, list.getSize());

    }

    /**
     * This test the search method of the list and some variations.
     * Search by value.
     * Search by index
     */
    @Test
    public void testSearch(){
        DoublyLinkedCircularList<Integer> list = new DoublyLinkedCircularList<>();

        for(int i=0; i<=10; i++) list.add(i);

        Assert.assertEquals(new Integer(5), list.searchByValue(5).getValue());
        Assert.assertEquals(new Integer(7), list.searchByValue(7).getValue());
        Assert.assertEquals(new Integer(10), list.searchByValue(10).getValue());
        Assert.assertEquals(new Integer(0), list.searchByValue(0).getValue());

        Assert.assertEquals(11, list.getSize());

        Assert.assertNull(list.searchByValue(90));

        Assert.assertEquals(new Integer(5), list.searchByIndex(5).getValue());
        Assert.assertEquals(new Integer(7), list.searchByIndex(7).getValue());
        Assert.assertEquals(new Integer(10), list.searchByIndex(10).getValue());
        Assert.assertEquals(new Integer(0), list.searchByIndex(0).getValue());

        Assert.assertEquals(11, list.getSize());
    }

    /**
     * This test update method of the list.
     */
    @Test
    public void testUpdate(){
        DoublyLinkedCircularList<Integer> list = new DoublyLinkedCircularList<>();

        for(int i=0; i<=10; i++) list.add(i);

        Assert.assertEquals(new Integer(4), list.searchByIndex(4).getValue());

        list.changeValueFor(4, 65);

        Assert.assertEquals(new Integer(65), list.searchByIndex(4).getValue());

        Assert.assertEquals(new Integer(7), list.searchByValue(7).getValue());

        list.changeValueOf(7, 54);

        Assert.assertEquals(new Integer(54), list.searchByValue(54).getValue());
    }
}
