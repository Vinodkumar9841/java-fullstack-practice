public class Problem2 {
    public static void main(String[] args) {
        int x = 5, y = 10, temp;

        System.out.println("Before swap: x=" + x + " y=" + y);

        temp = x;
        x = y;
        y = temp;

        System.out.println("After swap: x=" + x + " y=" + y);
    }
}