package RecursionLydiasVersion.package1;

public class MainLydiasVersion {

    public static void main(String[] args) {
        // TODO code application logic here
        int n = 1;
        Factorial fun = new Factorial();
        n = Factorial.factorial(n);
        System.out.println(fun);
        System.out.println("Finishing main "+n);
    }
}