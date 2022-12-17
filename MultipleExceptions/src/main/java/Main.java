import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();


            if(num2 == 0)
            { throw new ArithmeticException();

            }else {
                System.out.println(num1/num2);
            }


        } catch(ArithmeticException e) {
            System.out.println("Mistake: division by zero");

        } catch(InputMismatchException e){
            System.out.println("Mistake: wrong value type");

        }

    }
}