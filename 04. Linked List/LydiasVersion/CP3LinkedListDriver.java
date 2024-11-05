package LydiasVersion;

public class CP3LinkedListDriver {
    public static void main(String[] args) {
        CP3LinkedList<String> names = new CP3LinkedList();
        names.addFirst("Lydia");
        names.addFirst("Emma");
        names.addFirst("Lara");
        names.addLast("Lydia");
        names.print();
    }
}
