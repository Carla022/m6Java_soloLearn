import java.awt.*;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Scanner;
import java.time.LocalTime;



public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner nameScanner = new Scanner(System.in);
        LocalTime timeObj = LocalTime.now();
        Scanner pIn = new Scanner(System.in);
        String ClockIn = "In";

        try
        {
            System.out.println("It is the all exclusive grand opening of ✨ Crystal Palace ✨. What is your name?");
            Thread.sleep(3000);

        }
        catch(InterruptedException ex)
        {
            ex.printStackTrace();

        }
        String eName = nameScanner.nextLine();

        try
        {
            System.out.println("You have been hired as the night bouncer. Welcome to the crew " + eName + ". Please wait...");
            // Delay for 1 seconds
            Thread.sleep(3000);
        }
        catch(InterruptedException ex)
        {
            ex.printStackTrace();

        }

        try
        {
            System.out.println("Your shift will begin soon \uD83D\uDD4B" );
            // Delay for 2 seconds
            Thread.sleep(3000);
        }
        catch(InterruptedException ex)
        {
            ex.printStackTrace();

        }

        try {
            System.out.println("Type 'In' to Clock In");

            if(ClockIn.equals(pIn.nextLine())) {
                System.out.println("You clocked in at " + timeObj.withNano(0));
                Thread.sleep(3000);
            }

        }catch(InterruptedException ex) {
            ex.printStackTrace();

        }




        HashMap<String, Integer> ages = new HashMap<String, Integer>();

        ages.put("Carla", 87);
        ages.put("Cremilda", 12);
        ages.put("Ana Paula", 24);
        ages.put("Ana Bela", 46);
        ages.put("Ronnie", 19);
        ages.put("James", 4);
        ages.put("Dora", 32);

        String [] nameArr = new String[ages.size()];

        /*array created from ages HashMap for interating*/
        nameArr = ages.keySet().toArray(nameArr);

        System.out.println(nameArr.length + " VIPs are arriving and you must set an age limit before entry. What is the minimum age limit?");

        int ageLimit = scanner.nextInt();

        for(String emptyArr : nameArr) {
            if (ages.get(emptyArr) < ageLimit) {
                ages.remove(emptyArr);
            }
        }

        try
        {
            Thread.sleep(1500);
            System.out.println("* Good Evening Ladies and Gentlemen.The minimum age for entry is " + ageLimit + " * ");
            // Delay for 1 seconds
            Thread.sleep(2000);
            System.out.println("You have given entry to guests: " + ages);
            // Delay for 2 seconds
            Thread.sleep(3000);
        }
        catch(InterruptedException ex)
        {
            ex.printStackTrace();
        }


        if (ages.size() < 4) {
            System.out.println("Oh no! The guests were not very pleased to be turned away.");
        } else {
            System.out.println("Great job "  + eName + " !" + " ✨Crystal Palace ✨ received over 50% entry rate.");
        }




    }
}
