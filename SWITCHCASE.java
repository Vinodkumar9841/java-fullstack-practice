import java.util.Scanner;
public class SWITCHCASE {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();
        switch (fruit) {
            case "Mango":
                System.out.println("King of fruits");
                break;
            case "Apple":
                System.out.println("A sweet red fruit");
                break;
            case "Banana":
                System.out.println("A long yellow fruit");
                break;
            case "Orange":
                System.out.println("A round orange fruit");
                break;
            default:
                System.out.println("Unknown fruit");
        }
    }
}
