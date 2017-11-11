package org.tec.datastructures.test;

import org.junit.Assert;
import org.tec.datastructures.queueList.Queue;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestQueueList {
    @Test
    public void testEnqueue(){
        Queue<Integer> queue = new Queue<>();

        for(int i=0; i<20; i++)  queue.enqueue(i);

        queue.enqueue(56);

        Assert.assertEquals(new Integer(0), queue.peek());
        queue.dequeue();
        Assert.assertEquals(new Integer(1), queue.peek());
    }

    @Test
    public void testPeek(){
        Queue<Integer> queue = new Queue<>();

        Assert.assertNull(queue.peek());

        for(int i=0; i<20; i++)  queue.enqueue(i);

        Assert.assertEquals(new Integer(0), queue.peek());
        queue.dequeue();
        Assert.assertEquals(new Integer(1), queue.peek());
    }

    @Test
    public void testDequeue(){
        Queue<Integer> queue = new Queue<>();

        Assert.assertNull(queue.dequeue());

        for(int i=0; i<20; i++) queue.enqueue(i);

        Assert.assertEquals(new Integer(0), queue.dequeue());
        Assert.assertEquals(new Integer(1), queue.dequeue());
        Assert.assertEquals(new Integer(2), queue.dequeue());
    }
}