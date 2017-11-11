package hax.ads.tests;

import org.junit.Test;
import hax.ads.algorithms.Bubble;
import hax.ads.algorithms.Insertion;
import hax.ads.algorithms.RadixSort;
import hax.ads.algorithms.Shell;

import static org.junit.Assert.assertTrue;

public class Tests {

    @Test
    public void testBubble(){

        int[] list = {12, 20, 4, 16, 78, 87, 95, 55, 66, 5};
        Bubble.sortInt(list);

        for(int i=0; i<list.length-1; i++) assertTrue(list[i] < list[i+1]);
    }

    @Test
    public void testInsertion(){

        int[] list = {15, 80, 13, 92, 54, 5, 56, 60, 33, 74};
        Insertion.sortInt(list);

        for(int i=0; i<list.length-1; i++) assertTrue(list[i] < list[i+1]);
    }

    @Test
    public void testMerge(){
        int[] list = {35, 73, 94, 51, 43, 60, 66, 13, 29, 70};
        Insertion.sortInt(list);

        for(int i=0; i<list.length-1; i++) assertTrue(list[i] < list[i+1]);
    }

    @Test
    public void testShell(){
        int[] list = {39, 8, 94, 48, 40, 6, 38, 92, 27, 19};
        Shell.sortInt(list);

        for(int i=0; i<list.length-1; i++) assertTrue(list[i] < list[i+1]);
    }

    @Test
    public void testRadix(){
        int[] list = {8, 57, 74, 76, 54, 84, 19, 69, 5, 3};
        RadixSort.radixsort(list,list.length);

        for(int i: list) System.out.print(i + ", ");

        for(int i=0; i<list.length-1; i++) assertTrue(list[i] < list[i+1]);
    }
}
