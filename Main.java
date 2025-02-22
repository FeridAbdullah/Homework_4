public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 100000; i++) {
            new Human("Test", "Person", 2000, 100, null);
        }
        System.gc();
    }
}
