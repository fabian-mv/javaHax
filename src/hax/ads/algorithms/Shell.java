package hax.ads.algorithms;

/**
 * This class is the shell sort method.
 * @author Alejandro D.P <aleklnx>
 * @version 0.0.1
 */
public class Shell {

    /**
     * This method sort an array of integers.
     * @param array The array to sort.
     */
    public static void sortInt(int[] array){
        int middle = array.length/2;
        int limit = middle;

        while(middle > 0){
            for(int i=0; i<limit; i++){
                    for(int q=i; q>=0; q--){
                        if(array[i] > array[i+middle]){
                            int swap = array[i];
                            array[i] = array[i+middle];
                            array[i+middle] = swap;
                        }

                    }
            }

            middle--;
            limit++;
        }
    }
}
