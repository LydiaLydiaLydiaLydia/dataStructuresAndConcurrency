package RecursionLydiasVersion;

public class Q4Fibonacci {

    public static int FibonacciRecursive(int n) {
        return 0;
    }
    public static int FibonacciNonRecursive(int n) {
        if(n == 0) return 0;
        else if (n == 1) return 1;
        else{
            int last = 1;
            int secondLast = 1;
            int temp;
            for(int i = 2; i <= n; i++){
                //add last to second last
                temp = last + secondLast;
                secondLast = last;
                last = temp;
                i++;
            }
            return last;
        }

    }
}
