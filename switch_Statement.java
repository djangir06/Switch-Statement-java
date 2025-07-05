import java.util.Scanner;

public class switch_Statement {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        switch (num){

            case 1:
                System.out.println("Today is monday");
                break;
            case 2:
                System.out.println("Today is tuesday");
                break;
            case 3:
                System.out.println("Today is wednesday");
                break;
            case 4:
                System.out.println("Today is Thursday");
                break;
            case 5:
                System.out.println("Today is Friday");
                break;
            case 6:
                System.out.println("Today is saturday");
                break;
            case 7:
                System.out.println("Today is sunday");
                break;
            default:
                System.out.println("Enter in the range of 1-7");
                break;
        }
    }
}
