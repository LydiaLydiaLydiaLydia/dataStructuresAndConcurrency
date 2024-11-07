package RecursionLydiasVersion;

public class CP3LinkedListDriver {
    public static void main(String[] args) {

        CP3LinkedList names = new CP3LinkedList();
        names.addFirst("Lydia");
        names.addFirst("Laura");
        names.addFirst("Silva");
        int size = names.sizeRecursive();
        //names.print();

        names.printRecursive();
        //names.printRecursiveBackwards();
    }
}
