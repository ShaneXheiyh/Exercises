import java.util.Arrays;

public class ElementOmissionArray {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 5,5,4,7,8,9,3,5,2,6,9,4,7,1};
        int[] resultingArray = removeElement(array,5);
        System.out.println(Arrays.toString(resultingArray));

    }
    static int[] removeElement(int[] a, int b){
        // compute the size of the new array,
        // because we cannot create an array if we don't know its size
        int newSize = a.length - countElement(a,b);
        // create an empty array with the new size
        int[] newArray = new int[newSize];
        // we need a index to know at what position in the new array we need to
        // put first element
        // logically, the first position is 0
        int tempIndex = 0;
        // we go through all elements of old array to find
        // those which need to be put in the new array
        for(int i = 0; i < a.length; i++){
            // once we find one
            if(b != a[i]){
                // we add it to the new array at new index
                newArray[tempIndex] = a[i];
                // increment the index so that the next element we find
                // we put it at the next index, otherwise
                // we'd put everything in position 0
                tempIndex++;
            }
        }
      return newArray;
    }

    static int countElement(int[] a, int b){
        int count = 0;
        for(int i = 0; i < a.length; i++){
            if(b == a[i]){
                count += 1;
            }
        }
        return count;
    }


}



