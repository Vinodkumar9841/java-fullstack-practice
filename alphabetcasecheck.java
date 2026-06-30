import java.util.Scanner;
public class alphabetcasecheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().charAt(0);
        if(ch>='A' && ch<='Z'){
            System.out.println("Uppercase");
        }else if(ch>='a' && ch<='z'){
            System.out.println("Lowercase");
        }else{
            System.out.println("Invalid input");
        }
    }
}
