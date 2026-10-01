interface Printable {
    void print();
}

interface Showable {
    void show();
}

public class MultipleInterface implements Printable, Showable {
    public void print() {
        System.out.println("Printing...");
    }

    public void show() {
        System.out.println("Showing...");
    }

    public static void main(String[] args) {
        MultipleInterface obj = new MultipleInterface();
        obj.print();
        obj.show();
    }
}
