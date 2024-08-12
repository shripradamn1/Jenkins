

public class Main {
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Main main = new Main();
        int result = main.add(50, 10);
        System.out.println("Result: " + result);
    }
}
