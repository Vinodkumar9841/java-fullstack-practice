import java.util.Scanner;
public class ENHANCEDSWITCH {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();
        switch (fruit) {
            case "Mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("A sweet red fruit");
            case "Banana" -> System.out.println("A long yellow fruit");
            case "Orange" -> System.out.println("A round orange fruit");
            default -> System.out.println("Unknown fruit");
        }
    }
}
