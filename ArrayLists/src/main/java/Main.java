import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[ ] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> evennums = new ArrayList<Integer>();

        int sum = 0;
        int avg;

        System.out.println("Please key in a number & press *Enter*");

        while(evennums.size() < 3){
            int num = scanner.nextInt();
            evennums.add(num);

            sum += num;

            System.out.println("Type another number");
            

        }

        avg = sum / evennums.size(); // finding the average value
        System.out.println("The average value of your numbers = " + avg);

    }
}
