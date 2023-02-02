import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
    public static void main(String[ ] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, type five numbers of your choice:");

        while(nums.size()<5){
            int num = scanner.nextInt();

            //your code goes here
            nums.add(num);

        }
        //your code goes here

        Collections.max(nums);
        Collections.min(nums);

        System.out.println(Collections.max(nums));
        System.out.println(Collections.min(nums));






    }
}
