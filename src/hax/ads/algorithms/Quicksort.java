package hax.ads.algorithms;

//http://www.vogella.com/tutorials/JavaAlgorithmsQuicksort/article.html

public class Quicksort {

    private int[] values;
    private int pivot;

    public void sort(int... pValues){
        if(pValues == null || pValues.length == 0){
            return;
        }

        this.values = pValues;
        pivot = this.values.length;
        quicksort(0 , pivot -1);

    }

    private void quicksort(int start , int end){
        int i = start;
        //int j =
    }

    private void swap(int i , int j){

    }


}
