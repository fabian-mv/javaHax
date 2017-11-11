package hax.ads.algorithms;

/**
 * This class is ther bubble sort method.
 * @author Alejnadro D.P <aleklnx>
 * @version 0.0.1
 */
public final class Bubble {

    /**
     * This sort an array of numbers.
     * @param array The array to sort.
     */
    public static void sortInt(int[] array){
        if(array == null) return;
        // If the array needs another iteration.
        boolean iteration = true;

        while(iteration){
            //This always can be the last iteration.
            boolean finish = true;
            //Make the iteration.
            for(int i=0; i<array.length-1; i++){
                if(array[i] > array[i+1]){
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    //If the array make just one swap then it may needs another iteration.
                    finish = false;
                }
            }
            //Finish the sort process.
            if(finish) iteration = false;
        }
    }

    /**
     * This sort an array of strings.
     * @param array The array to sort.
     */
    public static void sortString(String[] array){
        // If the array needs another iteration.
        boolean iteration = true;

        while(iteration){
            //This always can be the last iteration.
            boolean finish = true;
            //Make the iteration.
            for(int i=0; i<array.length-1; i++){
                if(array[i].compareTo(array[i+1]) > 0 ){
                    String temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    //If the array make just one swap then it may needs another iteration.
                    finish = false;
                }
            }
            //Finish the sort process.
            if(finish) iteration = false;
        }
    }

}
