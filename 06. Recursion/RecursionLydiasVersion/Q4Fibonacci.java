package RecursionLydiasVersion;

public class Q4Fibonacci {

    public static int FibonacciRecursive(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        else{
            return FibonacciRecursive(n - 1) + FibonacciRecursive(n - 2);
        }
    }
    public static int FibonacciNonRecursive(int n) {
        if(n == 0) return 0;
        else if (n == 1) return 1;
        else{
            int last = 1;
            int secondLast = 0;
            int current;
            for(int i = 2; i <= n; i++){
                //add last to second last
                current = last + secondLast;
                secondLast = last;
                last = current;
            }
            return last;
        }

    }
}
