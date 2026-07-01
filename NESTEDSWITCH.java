import java.util.Scanner;
public class NESTEDSWITCH {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String  name = in.next();
       String city =  in.next();
       switch(name){
           case "vinod":
               System.out.println("Hello vinod");
               break;
              case "sachin":
                System.out.println("Hello sachin");
                break;
                case "rohit":
                    switch (city){
                        case "mumbai":
                            System.out.println("Hello rohit from mumbai");
                            break;
                            case "delhi":
                                System.out.println("Hello rohit from delhi");
                                break;
                                default:
                                    System.out.println("Hello rohit from unknown city");
                                    break;
                    }
       }
    }
}
