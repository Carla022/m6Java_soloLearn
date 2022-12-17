import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        String[] categories = {"PCs", "Notebooks", "Tablets", "Phones", "Аccessories"};

        //complete the code
        try {
            System.out.println(categories[choice]);

        } catch(Exception obj) {
            System.out.println("Wrong Option");

        }
    }
}