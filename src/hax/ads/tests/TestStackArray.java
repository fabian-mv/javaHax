package org.tec.datastructures.test;

import org.junit.Assert;
import org.tec.datastructures.stackArray.Queue;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestStackArray {
    @Test
    public void testPush(){
        Queue<Integer> queue = new Queue<>(Integer.class, 20);

        for(int i=0; i<20; i++)  Assert.assertTrue(queue.push(i));

        Assert.assertFalse(queue.push(56));

        Assert.assertEquals(new Integer(19), queue.peek());
        queue.pop();
        assertEquals(new Integer(18), queue.peek());
    }

    @Test
    public void testPeek(){
        Queue<Integer> queue = new Queue<>(Integer.class, 20);

        Assert.assertNull(queue.peek());

        for(int i=0; i<20; i++)  Assert.assertTrue(queue.push(i));

        Assert.assertEquals(new Integer(19), queue.peek());
        queue.pop();
        Assert.assertEquals(new Integer(18), queue.peek());
    }

    @Test
    public void testPop(){
        Queue<Integer> queue = new Queue<>(Integer.class, 20);

        Assert.assertNull(queue.pop());

        for(int i=0; i<20; i++)  Assert.assertTrue(queue.push(i));

        Assert.assertEquals(new Integer(19), queue.pop());
        Assert.assertEquals(new Integer(18), queue.pop());
        queue.push(21);
        Assert.assertEquals(new Integer(21), queue.pop());
    }
}
