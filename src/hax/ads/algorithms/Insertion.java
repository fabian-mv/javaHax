package hax.ads.algorithms;

/**
 * This class is the insertion sort method.
 * @author Alejandro D.P <aleklnx>
 * @version 0.0.1
 */
public final class Insertion {

    /**
     * This method sort array of numbers.
     * @param array The array to sort.
     */
    public static void sortInt(int[] array){

        for(int i=0; i<array.length-1; i++){
            // The element to compare.
            int testing = array[i+1];

            //Compare if the element needs sorted.
            if(testing < array[i]){

                //Swap element until the element is biggest than previous.
                for(int q=i+1; q>0; q--){

                    int swap = array[q];
                    if(swap < array[q-1]){
                        array[q] = array[q-1];
                        array[q-1] = swap;
                    }
                }
            }
        }
    }

    /**
     * This method sort array of strings.
     * @param array The array to sort.
     */
    public static void sortString(String[] array){
        for(int i=0; i<array.length-1; i++){
            // The element to compare.
            String testing = array[i+1];

            //Compare if the element needs sorted.
            if(testing.compareTo(array[i]) < 0 ){

                //Swap element until the element is biggest than previous.
                for(int q=i+1; q>0; q--){

                    String swap = array[q];
                    if(swap.compareTo(array[q-1]) < 0){
                        array[q] = array[q-1];
                        array[q-1] = swap;
                    }
                }
            }
        }
    }
}
