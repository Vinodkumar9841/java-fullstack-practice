public class Problem3 {
    public static void main(String[] args) {
        int num = 100;
        String str = String.valueOf(num); // int to String
        System.out.println("int to String: " + str);

        String numStr = "250";
        int back = Integer.parseInt(numStr); // String to int
        System.out.println("String to int: " + back);
    }
}