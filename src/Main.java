public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = -2;
        int min = a;
        int max = b;

        if (a > b) {
            min = b;
            max = a;
        }

        System.out.println("min:"  + min + ", max=" + max);

    }
}
