package org.tec.datastructures.test;

import org.junit.Assert;
import org.tec.datastructures.queueArray.Queue;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestQueueArray {
    @Test
    public void testEnqueue(){
        Queue<Integer> queue = new Queue<>(Integer.class, 20);

        for(int i=0; i<20; i++)  Assert.assertTrue(queue.enqueue(i));

        Assert.assertFalse(queue.enqueue(56));

        Assert.assertEquals(new Integer(0), queue.peek());
        queue.dequeue();
        Assert.assertEquals(new Integer(1), queue.peek());
    }

    @Test
    public void testPeek(){
        Queue<Integer> queue = new Queue<>(Integer.class, 20);

        Assert.assertNull(queue.peek());

        for(int i=0; i<20; i++)  Assert.assertTrue(queue.enqueue(i));

        Assert.assertEquals(new Integer(0), queue.peek());
        queue.dequeue();
        Assert.assertEquals(new Integer(1), queue.peek());
    }

    @Test
    public void testDequeue(){
        Queue<Integer> queue = new Queue<>(Integer.class, 20);

        Assert.assertNull(queue.dequeue());

        for(int i=0; i<20; i++)  Assert.assertTrue(queue.enqueue(i));

        Assert.assertEquals(new Integer(0), queue.dequeue());
        Assert.assertEquals(new Integer(1), queue.dequeue());
        Assert.assertEquals(new Integer(2), queue.dequeue());
    }
}
