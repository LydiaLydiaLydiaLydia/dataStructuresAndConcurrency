package RecursionLydiasVersion;

import java.util.Arrays;

public class MyArrays {
    public static int sum(int [] values){
        return recursiveSum(values);
    }
    private static int recursiveSum(int [] values){
        //if values.length = 1
        if(values.length == 1){
            return values[0];
        }
        else{
            // return (the element at the current index) + recursiveSum(values[1:])
            return values[0] + recursiveSum(Arrays.copyOfRange(values, 1, (values.length)));
        }

    }
}
